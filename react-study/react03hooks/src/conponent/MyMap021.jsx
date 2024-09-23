import React, { useState } from 'react'

export const MyMap021 = () => {
    const colorArray = ['red', 'orange', 'yellow', 'green', 'blue'];
    const [ciColor,setCiColor] =useState('black');
    const myStyle={
        width: '100px',
        height: '100px',
        display:'inline-block'
    }
    
    return (
        <div>
            <ul>
                <h1>색상 변경하기</h1>
                {colorArray.map((data,index)=>
                    <div key={index}
                        style={{...myStyle,backgroundColor: data,}} 
                        onClick={()=>setCiColor(data)}
                    >   
                    </div>)}
                <hr />
                <h2>선택한 색상</h2>
                <div
                    style={{  
                    backgroundColor: ciColor,
                    width: '100px',
                    height: '100px',
                    }}
                >
                </div>
    
            </ul>
        </div>
      )
}
export default MyMap021