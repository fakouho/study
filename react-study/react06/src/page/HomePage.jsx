import React from 'react'
import { Link, useNavigate } from 'react-router-dom'

const HomePage = () => {

  const navigate = useNavigate();
  const goTo = () => {
    navigate("/product/1")
  }

  return (
    <div>
      <div>HomePage</div>
      <Link to={"./about"}>About이동하기</Link>
      <button onClick={goTo}>product이동</button>
      <Link to={'/mypage'}>mypage로 이동</Link>
    </div>
  )
}

export default HomePage