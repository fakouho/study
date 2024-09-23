import React from 'react'

export const MyMap = () => {
    const menu=['짬뽕','짜장면','냉면','탕수육']
    const menu2 = [<li>짜장</li>, <li>짬뽕</li>,<li>냉면</li>,<li>탕수육</li>]
    
    // map,filter
    // map : 배열 안에있는 요소들에 규칙을 부여해서 새로운 배열을 만든다!
    // filter : 배열에 조건을 줘서 새로운 배열을 생성한다.
  return (
    <div>
        <ul>
            {/*
                data :배열이 가지고 있는 요소가 순차적으로 들어옴
                index :배열 인덱스 값이 순차적으로 들어옴
            */}
            {menu.map((data, index)=><li key={index}>{data}사과</li>)}
            
            <hr />
            {/*메뉴 배열에서 특정 배열만 뺴고 출력하기 */}
            {menu.filter((data, index)=>data !="탕수육")
            .map((data, index)=><li key={index}>{data}사과</li>)}
        </ul>

    </div>
  )
}
export default MyMap;