import React from 'react';
import MyTeam from './component/MyTeam';

function App3() {

    return (
        <div>
            <MyTeam so="교육운영부" py="선영표" />
            <MyTeam so="전략기획팀" py="강예진" />
            <MyTeam so="홍보팀" py="임보미" />
            <MyTeam so="기획팀" py="최영화" />
            <MyTeam so="개발팀" />
        </div>
    );
}
// defaultProps : 데이터를 전달바디 않을때 기본적으로 적용되는 데이터


export default App3;
