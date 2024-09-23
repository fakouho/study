import React, { useState, useEffect } from 'react';

const Menu = (props) => {
  const [menu, setMenu] = useState(props.menu);
  const [price, setPrice] = useState(props.price);

  // 필요시 useEffect를 사용하여 props가 변경될 때 상태 업데이트
  useEffect(() => {
    setMenu(props.menu);
    setPrice(props.price);
  });

  console.log(props);

  return (
    <div>
      <p className='food'>메뉴 : {menu}</p>
      <p className='money'>가격 : {price}</p>
    </div>
  )
}

export default Menu;
