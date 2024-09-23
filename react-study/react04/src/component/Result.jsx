import React from 'react'
import { useContext } from 'react'
import { ColorContext } from '../App'

const Result = () => {
    const data = useContext(ColorContext);
    const myStyle={
        width: '100px',
        height: '100px',
        display:'inline-block'
        
    }
  return (
    <div style={{...myStyle,backgroundColor:data.state}}></div>
  )
}

export default Result