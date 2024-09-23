import React from 'react'
import { useContext,useState } from 'react'
import { ColorContext } from '../App'

const MyColor = () => {

    const shareData = useContext(ColorContext);

    const colorList=['red','orange','yellow','green','blue']
    const myStyle={
        width: '100px',
        height: '100px',
        display:'inline-block'
    }
    
  return (
    <div>
        {colorList.map((data)=>
        <div onClick={()=>shareData.setState(data)}
        style={{...myStyle,backgroundColor:data}}></div>)}
    </div>
  )
}

export default MyColor