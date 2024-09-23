import React, { Component } from 'react';

export class Myclass extends Component {

    // 컴포넌트 생명주기 함수
    // -> 컴포넌트 생명주기에 맞춰서 실행되어지는 함수들

    // 1. componentDidMount -> 컴포넌트가 처음 렌더링 될 때 실행
    componentDidMount() {
        console.log('Mount 단계 -> 해당 JSX 처음 시작 단계');
    }

    // 2. componentDidUpdate -> 컴포넌트가 재렌더링 될 때 실행
    componentDidUpdate() {
        console.log('Update 단계 -> 재렌더링 될 때 실행');
        if(this.state.num==10){
            alert("목표숫자도달")
        }
    }

    // 상태 초기화
    state = {
        num: 0
    }

    render() {
        return (
            <div>
                <h1>{this.state.num}</h1>
                {/* +1 버튼 클릭 시 num 값을 1 증가시킴 */}
                <button onClick={() => this.setState({ num: this.state.num + 1 })}>+1</button>
                
                {/* -1 버튼 클릭 시 num 값을 감소시키되, 0보다 작아지지 않도록 조건 추가 */}
                <button onClick={() => this.setState(prevState => {
                    if (prevState.num > 0) {
                        return { num: prevState.num - 1 };
                    } else {
                        alert('0으로 초기화됩니다');
                        return { num: 0 };
                    }
                })}>-1</button>
            </div>
        );
    }
}

export default Myclass;
