import { configureStore } from '@reduxjs/toolkit';
import Counter from '../components/Counter';
import CounterReducer from './reducers/counterSlice'
/*
    store: state,reducer를 관리하는 역활
            하나의 프로젝트에 하나의 store만 생성 관리
    

    middleware: action과 reducer 사이에 특정 함수를 실행하는 중간 처리기 역할
*/
export default configureStore({
    reducer:{
        Counter: CounterReducer
    },
    middleware:(getDefaultMiddeleware)=> getDefaultMiddeleware().concat()
})