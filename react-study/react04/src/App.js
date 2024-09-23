import logo from './logo.svg';
import './App.css';
import Left01 from './component/Left01';
import Right01 from './component/Right01';
import SubItem01 from './component/SubItem01';
import MyColor from './component/MyColor';
import Result from './component/Result';
import { createContext, useState } from 'react';

// 공유공간생성 (Context)
export const AppContext = createContext();
export const AppText = createContext();
export const ColorContext = createContext();

function App() {
  const[num,setNum]=useState(0);
  const[tex,setTex]=useState("내용일 입력해주세요");
  const[color,setColor] =useState('gold');
  // num, setNum 을 Left01과 Right01 넘겨서 (전달)
  // Right01 에 있는 버튼 클릭했을때
  // Lefr01 에 있는 숫자를 바꾸고 싶다
  {/*
    Provider : 공유공간 허용하겠습니다.
    value : 공유공간에서 공유하며 사용할 공유값 지정
  */}

  return (
    <div >
      <h1>Root</h1>
      <div>
        {/*<AppContext.Provider value={{state:num,setState:setNum}}>
          <Left01 ></Left01>
          <Right01 ></Right01>
        </AppContext.Provider>*/}

        {/*<AppText.Provider value={{apptex:tex,setApptex:setTex}}>
        <h1>Contest실습</h1>
        <h1>다른 컴포넌트에서 입력한 내용 :{tex}</h1>
        <SubItem01></SubItem01>
        </AppText.Provider>*/}
        <ColorContext.Provider value={{state:color,setState:setColor}}>
          <MyColor></MyColor>
          <hr></hr>
          <Result></Result>
        </ColorContext.Provider>
      </div>
    </div>
  );
}

export default App;
