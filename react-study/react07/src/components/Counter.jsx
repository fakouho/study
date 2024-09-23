import React from 'react'
import {useSelector,useDispatch} from 'react-redux'
import { CounterActions } from '../redux/reducers/counterSlice'

const Counter = () => {
    
    const count = useSelector((state)=>state.Counter.count)

    const dispatch = useDispatch()

    const handleClick1=()=>{
        dispatch(CounterActions.increment())
    }
    const handleClick2=()=>{
        dispatch(CounterActions.decrement())
    }
    const handleClick3=()=>{
        dispatch(CounterActions.incrementByAmount({num:2}))
        
    }
    const handleClick4=()=>{
        dispatch(CounterActions.inplusten({num:10}))
    }
    const handleClick5=()=>{
        dispatch(CounterActions.inminuten())
    }
    console.log(count);

  return (

    <div>
        <h1>Redux Toolkit활용 실습</h1>
        <h1>{count}</h1>
        <button onClick={handleClick1}>증가</button>
        <button onClick={handleClick2}>감소</button>
        <button onClick={handleClick3}>2씩 증가</button>
        <button onClick={handleClick4}>10증가 </button>
        <button onClick={handleClick5}>10감소 </button>
    </div>
  )
}

export default Counter