import React from 'react'
import MyPage from './MyPage'
import LoginPage from './LoginPage'
import { Link, Navigate } from 'react-router-dom'

// Navigete 컴포넌트
// - 지정된 URL로 이동하는 컴포턴트
const PrivateRouter = ({state}) => {
  return state?<MyPage/>:<Navigate to ="/loginPage"/>
}

export default PrivateRouter