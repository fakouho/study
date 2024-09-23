import React from 'react'
import { useParams } from 'react-router-dom'

const ProductDetailPage = () => {

  const {prd_no} =useParams()

  console.log(prd_no)

  return (
    <div>
      <div>ProductDetailPage</div>
      <p>{prd_no}번 상품</p>
    </div>
    
  )
}

export default ProductDetailPage