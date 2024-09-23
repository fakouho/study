import React,{useState} from 'react';

const MyState=()=>{
        
        const [num,setNum] = useState(0); // close함수 

        const plus = () =>{
            setNum(num+1)
           
        };
        const mi = () => {
            setNum(num-1)
        };

        if(num==10){
            alert("목표숫자 도달")
            setNum(0)
        }
        if(num<0){
            setNum(0)
        }
    return(
        <div>
            <h1>{num}</h1>
            <button onClick={plus}>+1</button>
            <button onClick={mi}>-1</button>

        </div>
    )
}
export default MyState;