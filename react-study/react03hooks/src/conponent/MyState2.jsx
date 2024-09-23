import React, { useState } from 'react';

const MyState2 = () => {
    // 1. 클릭한 숫자가 내가 입력한 숫자로
    // 2. 버튼을 클릭시 랜덤숫자 나오게
    const [cnum, setCnum] = useState('');
    const [rnum, setRnum] = useState('');

    const rdnum = () => {
        setRnum(Math.floor(Math.random() * 100 + 1)); // 1에서 3 사이의 정수로 반올림
    };

    const one = () => {
        setCnum(1);
        rdnum();
    };
    const two = () => {
        setCnum(2);
        rdnum();
    };
    const three = () => {
        setCnum(3);
        rdnum();
    };

    const chNum = (e) => {
        // e(이벤트 객체): 이벤트 클릭 시 적용되는 내부 메세지
        setCnum(e.target.innerText);
        rdnum();
    };

    return (
        <div>
            <div>
                <button onClick={chNum}>1</button>
                <button onClick={chNum}>2</button>
                <button onClick={chNum}>3</button>
            </div>

            <div>
                내가 입력한 숫자 : {cnum}
                <br />
                랜덤한 숫자 : {rnum}
                <br />
            </div>
        </div>
    );
};

export default MyState2;
