import React, { useEffect } from 'react';
import { useSelector } from 'react-redux';
import TodoItem from './TodoItem';

const TodoList = ({ title, checked }) => {
    // Redux store에서 todoList를 가져옵니다.
    const todoList = useSelector((state) => state.todo.todoList);

    // todoList를 콘솔에 출력합니다.
    useEffect(() => {
        console.log("Todo List: ", todoList);
    }, [todoList]);

    return (
        <div className='todo-list'>
            <p className='todo-list-tit'>
                <h4>[{title}]</h4>
            </p>
            <ul className='todo-list-ul'>
                {/* todoList를 순회하여 조건에 맞는 TodoItem 컴포넌트를 렌더링합니다. */}
                {todoList.map((todo) => (
                    todo.complete === checked ? (
                        <TodoItem key={todo.id} todo={todo} />
                    ) : null
                ))}
            </ul>
        </div>
    );
};

export default TodoList;
