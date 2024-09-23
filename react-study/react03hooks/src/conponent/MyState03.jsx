import React,{useState} from 'react';

const MyState03 =() => {

    const [lnum,setLnum] = useState('');

    const plus = () => {
        setLnum(lnum+1)
    };
    const mi = () => {
        setLnum(lnum-1)
    };
    
    const re = () => {
        setLnum(0)
    };
    if(lnum<0){
        setLnum(0)
        alert("0아래로 내려갈수 없습니다.")
    }
    return(
        <div>
            <div>
            <h1>like! {lnum}</h1>
            <button onClick={plus}>+1</button>
            <button onClick={mi}>-1</button>
            <button onClick={re}>초기화</button>

        </div>
        </div>
    )
}
export default MyState03;