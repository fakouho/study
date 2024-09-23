import React, { useRef, useState, useEffect } from 'react';

export const MyToDo = () => {
    const inputRef = useRef();
    const [todo, setTodo] = useState([]);
    

    function addTodo() {   
        
        setTodo(todo.concat(inputRef.current.value)); // 입력값을 배열에 추가
    }

    // useEffect -> state 변수에 의해서 실행되어지는 함수,지정 되는 함수 생성
    useEffect(()=>{
        console.log("랜더링시 useEffect실행")
        if(todo.length >= 5){
            alert("최대 목표개수에 도달하였습니다.")
            console.log("재랜더링시 useEffect실행")
        }
    })

    const dlt =(toda) =>{
        console.log('삭제 정보 =index'+toda)   
        setTodo(todo.filter((data, index) => index !== toda));
        //                  배열요소,인덱스
        
    }

    return (
        <div>
            <h1>2024 올해는 꼭 해봅시다!</h1>
            <input ref={inputRef} ></input>
            <button onClick={addTodo}>계획 추가</button>
            <hr />
            <h1>TodoList</h1>
            <ul>
                {todo.map((data, index) => (
                    <li key={index}>
                        {data}
                    <button onClick={()=>dlt(index)}>삭제</button>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default MyToDo;
