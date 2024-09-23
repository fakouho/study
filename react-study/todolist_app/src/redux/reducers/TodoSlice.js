import { createSlice } from "@reduxjs/toolkit";

const TodoSlice = createSlice({
    name: 'todo',
    initialState: {
        todoList: []
    },
    reducers: {
        // 입력값 저장
        addTodo: (state, action) => {
            state.todoList.push(action.payload);
        },

        checkChangeTodo: (state,action) => {
            state.todoList=state.todoList.map((item)=>({
                ...item,
                complete:item.id===action.payload.id? !item.complete : item.complete
            }))
        },
        textChangeTodo: (state, action) => {
            // 새로운 배열을 만들어서 todoList에 할당합니다.
            state.todoList = state.todoList.map(item => 
                item.id === action.payload.id
                    ? { ...item, text: action.payload.text } // 상태를 업데이트합니다.
                    : item
            );
        },
        deleteTodo: (state, action) => {
            state.todoList = state.todoList.filter(item => item.id !== action.payload.id);
        }
    }
});

export const { addTodo, checkChangeTodo, textChangeTodo, deleteTodo } = TodoSlice.actions;

export default TodoSlice.reducer;
