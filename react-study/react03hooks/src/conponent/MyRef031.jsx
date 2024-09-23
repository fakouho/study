import React, { useState, useRef, useEffect } from 'react';

export const MyRef031 = () => {
    // 주사위 이미지
    const diceArray = [
        "/dice1.png",
        "/dice2.png",
        "/dice3.png",
        "/dice4.png",
        "/dice5.png",
        "/dice6.png",
    ];
    const comImgRef = useRef();
    const userImgRef = useRef();
    const [comScore, setComScore] = useState(0);
    const [userScore, setUserScore] = useState(0);
    const [result, setResult] = useState('');
    const [num,setNum] = useState(0);

    // 주사위 출력
    const chDice = () => {
        const comRanDum = parseInt(Math.random() * 6);
        const userRanDum = parseInt(Math.random() * 6);

        comImgRef.current.src = diceArray[comRanDum];
        userImgRef.current.src = diceArray[userRanDum];

        // 주사위 확인 이후 승리자 체크
        if (comRanDum > userRanDum) {
            setComScore(comScore + 1);
        } else if (comRanDum < userRanDum) {
            setUserScore(userScore + 1);
        }
        setNum(num+1)
    };

    useEffect(() => {
        // 승리 출력물
        if (comScore >= 10) {
            setResult('com win');
        } else if (userScore >= 10) {
            setResult('user win');
        }
    }, [comScore, userScore]);

    return (
        <div>
            <h1>DICE GAME</h1>
            <p>클릭수 :{num}</p>
            <button onClick={chDice}>Start</button>

            <div className="dice">
                <img ref={comImgRef} alt="Computer Dice" />
                <h1>Com Score : {comScore}</h1>
            </div>
            <div className="dice">
                <img ref={userImgRef} alt="User Dice" />
                <h1>User Score : {userScore}</h1>
            </div>

            <h1>결과 : {result}</h1>
        </div>
    );
};

export default MyRef031;
