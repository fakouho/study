import logo from './logo.svg';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import Hearder from './components/Hearder';
import { Route, Routes } from 'react-router-dom';
import MainPage from './page/MainPage';
import AlLogin from './page/AlLogin';
import AlProduce from './page/AlProduce';

/*
  1. 각 페이지 컴포넌트를 page폴더 내 생성
    - 헤더영역 : Hearder.jsx
    - 로그인페이지 : loginPage.jsx
    - 상품상세페이지 : ProductDetails.jsx

  2. 페이지 컴포넌트를 화면에 출력할수 있도록 라우터 설정
    - login : /login
    - main : '/'
    - 상품상세페이지 :  /preDetail
*/

function App() {
  return (
    <div className='container'>
      <Hearder></Hearder>
      <Routes>
        <Route path='/' element={<MainPage/>}></Route>
        <Route path='/login' element={<AlLogin/>}></Route>
        <Route path='/preDetail/:id' element={<AlProduce/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
