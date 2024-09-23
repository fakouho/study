import './App.css';
import Form from '../src/components/Form'
import JoinFrom from './components/JoinFrom';
import LoginFrom from './components/LoginFrom';

// 리액트 프로젝트 수정 후 터미널 창에 'npm run build' 실행하기! ⭐⭐⭐
function App() {
  return (
    <div>
        <h1>React-Node 연동실습</h1>
        <Form/>
        <h1>회원가입폼</h1>
        <JoinFrom/>
        <h1>로그인폼</h1>
        <LoginFrom/>
    </div>
  );
}

export default App;
