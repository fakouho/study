import React, { useState, useEffect } from 'react';
import Menu from './component/Menu';


function App() {
  const [name, setName] = useState('');//(3)
  const [season, setSeason] = useState('');//(3)
  const [date, setDate] = useState(new Date());// new Date() -> 날짜 및 시간
  let myStyle = {
    color : 'blue'
    }

  // 실시간 업데이트 
  useEffect(() => {
    
   
    const userName = "우석";//(1)
    setName(userName);//(2)

    const month = date.getMonth() + 1;
    let tomonth = '';//(1)

    if (month >= 3 && month <= 5) {
        tomonth = '봄';
    } else if (month >= 6 && month <= 8) {
        tomonth = '여름';
    } else if (month >= 9 && month <= 11) {
        tomonth = '가을';
    } else {
        tomonth = '겨울';
    }
    setSeason(tomonth);//(2)

   
  });

  return (
    <div>
      <h1>{`${date.getMonth() + 1}. ${date.getDate()}.`}</h1>
      <hr />
      {/*
      JSX 분법에서 자주 사용되어지는 방법
      1. style 적용
      inline{테그안에} 적용시 객체 형식으로 적용 해야한다.
      */}
      <p style={myStyle}>{name}님 지금은 {season}입니다. 좋은 하루 보내세요!</p>

      {/*2. 삼항연산자 */}
      {name == "승환" ?<h1>칼퇴</h1> : <h1>불가</h1>}\

      {/*props : 컴포넌트로 데이터를 전달 방법
               - 속성값으로 데이터를 전달
      */}
       <Menu  menu ="아메리카노" price="4100"></Menu> 
       <Menu menu ="카페라떼" price="4500"></Menu> 
    </div>
    
  );
}

export default App;
