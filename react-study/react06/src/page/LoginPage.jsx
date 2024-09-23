import React from 'react'
import { useNavigate } from 'react-router-dom'

const LoginPage = ({setLoginState}) => {

    const navigate = useNavigate();

    const gotoHome =  () =>{
        setLoginState(true)
        navigate('/')
    }
  return (
    <div>
        <div>LoginPage</div>
        <button onClick={gotoHome}>로그인</button>        
    </div>
    
  )
}

export default LoginPage;