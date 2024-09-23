import React, { useState, useRef } from 'react';

export const MyRef03 = () => {
    const [user, setUser] = useState(0); // 유저 주사위 숫자 저장
    const [com, setCom] = useState(0); // 컴터 주사위 숫자 저장
    const [uwin, setUwin] = useState(0); // 유저 승리수
    const [cwin, setCwin] = useState(0); // 컴터 승리수
    const comdiceimg = useRef(null); // 컴터 주사위 이미지
    const userdiceimg = useRef(null); // 유저 주사위 이미지
    const [result, setResult] = useState(''); // 결과 저장

    // 주사위 이미지
    const imgs = [
        "/dice1.png",
        "/dice2.png",
        "/dice3.png",
        "/dice4.png",
        "/dice5.png",
        "/dice6.png",
    ];

    const comjuu = () => { // 컴터 주사위 랜덤
        return Math.floor(Math.random() * 6);
    };

    const userjuu = () => { // 유저 주사위 랜덤
        return Math.floor(Math.random() * 6);
    };

    const win = (user, com) => {
        if (user > com) {
            setUwin(prevUwin => {
                const newUwin = prevUwin + 1;
                if (newUwin >= 10) {
                    setResult('User WIN');
                }
                return newUwin;
            });
        } else if (com > user) {
            setCwin(prevCwin => {
                const newCwin = prevCwin + 1;
                if (newCwin >= 10) {
                    setResult('Com WIN');
                }
                return newCwin;
            });
        }
    };

    // 이미지 저장 및 게임 로직
    const dice = () => {
        const newCom = comjuu();
        const newUser = userjuu();

        setCom(newCom);
        setUser(newUser);

        if (comdiceimg.current) {
            comdiceimg.current.src = './img' + imgs[newCom];
        }

        if (userdiceimg.current) {
            userdiceimg.current.src = './img' + imgs[newUser];
        }
        win(newUser, newCom);
    };

    return (
        <div>
            <h1>DICE GAME</h1>
            <button onClick={dice}>Start</button>

            <div className="dice">
                <img ref={comdiceimg}/>
                <h1>Com Score : {cwin}</h1>
            </div>
            <div className="dice">
                <img ref={userdiceimg}/>
                <h1>User Score : {uwin}</h1>
            </div>

            <h1>결과 :{result}</h1>
        </div>
    );
};
