import React, { useState } from 'react';

const App = () => {
  const [count, setCount] = useState(0); 

  const up= () => {
    setCount(count + 1); 
  };

  const down = () => {
    setCount(count - 1); 
  };

  return (
    <div>
      <h1>현재 숫자: {count}</h1> 
      <button onClick={up}>증가</button> 
      <button onClick={down}>감소</button> 
    </div>
  );
}

export default App;
