import React, { useState, useRef } from 'react';

function MyRef02() {
    const imgs = [
        "/삑삑이아리.png",
        "/달리는아리.png",
        "/간식내놔아리.png"
    ];

    const dogImageRef = useRef('');
                                // 초기설정
    const [num, setNum] = useState(2); // 초기 인덱스를 0으로 설정

    const pl = () => {
        // 이전 이미지로 변경
        const chnum = (num === 0) ? imgs.length - 1 : num - 1;
        //             num이 0이라면? 이미지길이 -1 : num에서 1을뺴
        setNum(chnum);
        dogImageRef.current.src = './img' + imgs[chnum];
    };

    const mi = () => {
        // 다음 이미지로 변경
        const chnum = (num === imgs.length - 1) ? 0 : num + 1;
        //            num이 이미지길이 -1이라면? 0으로 :num+1해줘
        setNum(chnum);
        dogImageRef.current.src = './img' + imgs[chnum];
    };

    return (
        <div>
            <img ref={dogImageRef} />
            <br />
            <button onClick={pl}>이전</button>
            <button onClick={mi}>이후</button>
        </div>
    )
}

export default MyRef02;
