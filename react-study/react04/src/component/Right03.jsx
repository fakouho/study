import React from 'react'
// 공유공간에 접근할 수 있는 기능
import { useContext } from 'react';
import { AppContext } from '../App';

export const Right03 = () => {

    const data = useContext(AppContext);

    const chNum=()=>{
        data.setState(data.state+1)
    }
    
  return (
    <div>
        <h1>Right03</h1>
        <button onClick={chNum}>+1</button>
    </div>
  )
}
export default Right03;