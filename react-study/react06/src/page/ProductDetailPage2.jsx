import React from 'react'
import { useParams, useSearchParams } from 'react-router-dom'

const ProductDetailPage2 = () => {

  const [query,setQuery] = useSearchParams()

  console.log('전달받은 데이터', query.get("prd_no"),query.get('cate'));
  return (
    <div>
      <div>ProductDetailPage</div>
      <p>번 상품</p>
    </div>
    
  )
}

export default ProductDetailPage2