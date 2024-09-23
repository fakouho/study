import {createSlice} from '@reduxjs/toolkit'

const counterSlice = createSlice({
    // 접근 구분 이름
    name:'counter',          
    // 내가 관리할 state를 정의 하는 공간 
    initialState:{
        count:0
    },
    // 함수를 정의하는 공간-> 기능 생성공간
    reducers:{
        increment:(state)=>{
            console.log('증가',state.count);
            state.count+=1
            
        },
        decrement: (state) => {
            if (state.count > 0) {
                state.count -= 1;
                console.log('감소', state.count);
            } else {
                console.log('카운트는 0보다 작을 수 없습니다.');
            }
        },
        incrementByAmount:(state,actions)=>{

            /*
                action : type, payload 묶는 단위
                type: 명려에 대한 구분값
                payload : 명렁에 대한 값을 저장하는 속성
            */
            console.log('액션 :',actions.payload.num);
            state.count+=actions.payload.num

        },
        inplusten:(state,action)=>{
            state.count+=action.payload.num

        },
        inminuten:(state)=>{
            state.count-=10;
        }
    }
})

console.log(counterSlice);

// 컴포넌트에서 reducers에 정의된 함수를 접근할 수 잇도록 내보내기
export const CounterActions = counterSlice.actions

// store에 counterSlice에 reducer(함수)를 접근할 수 있도록 내보내기
export default counterSlice.reducer