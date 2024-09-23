import React from 'react'
import { Link, useNavigate } from 'react-router-dom'
const ProductPage = () => {

  const navigate = useNavigate();
  const goTo = () => {
    //QueryString방식
    // - 다음 페이지로 이동할 때 데이터를 전달하는 방식
    //ex) (?key=value)
    navigate("/productQuery?prd_no=15&cate=10")
  }

  return (
    <div>
       <div>ProductPage</div>
       <button onClick={goTo}>ProductDetailPage2로 이동</button>
    </div>
   
  )
}

export default ProductPage