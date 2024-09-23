import { Route, Routes } from 'react-router-dom';
import './App.css'; // 스타일 시트 가져오기
import HomePage from './page/HomePage';
import AboutPage from './page/AboutPage';
import ProductPage from './page/ProductPage';
import ProductDetailPage from './page/ProductDetailPage';
import ProductDetailPage2 from './page/ProductDetailPage2';
import { useEffect, useState } from 'react';
import LoginPage from './page/LoginPage';
import PrivateRouter from './page/PrivateRouter';

// 컴포넌트 정의
function App() {

  const [loginState,setLoginState] = useState(false);
  
  useEffect(()=>{
    console.log("현재 로그인관리",loginState)
  })

  return (
    <div>
      {/* Routes: 요청 경로를 정의하는 컴포넌트 */}
      <Routes>
        {/* Route: 경로와 렌더링할 컴포넌트를 정의 */}
        <Route path='/' element={<HomePage />} />
        <Route path='/about' element={<AboutPage />} />
        <Route path='/product' element={<ProductPage />} />
        <Route path='/product/:prd_no' element={<ProductDetailPage/>}/>
        <Route path='/productQuery' element={<ProductDetailPage2/>}></Route>
        <Route path='/loginPage' element={<LoginPage setLoginState={setLoginState} />} />
        <Route path='/mypage' element={<PrivateRouter state={loginState} />} />
      </Routes>
    </div>
  );
}

export default App;
