import React, { useState, useRef } from 'react';

const MyRef01 = () => {
    // 방법 1: useState를 사용한 상태 관리
    const [inputText, setInputText] = useState('');
    const [dos, setDos] = useState('');
    const chiInput = (e) => {
        setInputText(e.target.value);
    };
    const enter = () => {
        setDos(inputText);
    };

    // 방법 2: useRef를 사용한 상태 관리
    const inputRef = useRef(null); // ref 객체 생성
    const [inputText2, setInputText2] = useState('');
    const refIput = () => {
        setInputText2(inputRef.current.value);
    };

    return (
        <div>
            {/* 방법 1: useState를 사용한 입력 필드와 출력 */}
            <div>
                <input onChange={chiInput}></input>
                <button onClick={enter}>출력</button>
                <h1>{dos}</h1>
            </div>
            
            {/* 방법 2: useRef를 사용한 입력 필드와 출력 */}
            <div>
                <input ref={inputRef}></input>
                <button onClick={refIput}>출력</button>
                <h1>{inputText2}</h1>
            </div>
        </div>
    );
};

export default MyRef01;
