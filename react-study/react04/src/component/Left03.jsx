import React from 'react'
// 공유공간에 접근할 수 있는 기능
import { useContext } from 'react';
import { AppContext } from '../App';


export const Left03 = () => {
    // data : 공유 되고 있는 값
    const data = useContext(AppContext);
  return (
    <div>
        <h1>Left03</h1>
        <h1>{data.state}</h1>
    </div>
  )
}
export default Left03;