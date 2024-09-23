import React, { useState } from 'react';
import api from '../api'; // axios 인스턴스

const LoginFrom = () => {
    const [formData, setFormData] = useState({
        id: '',    
        pw: ''     
    });
    const [nickname, setNickname] = useState('');

    const handleChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            let res = await api.post("/loginFrom", formData);
            console.log('서버에서 받은 응답', res.data);
            if (res.data.result === "success") {
                setNickname(res.data.nickname);
                console.log('Nickname 업데이트:', res.data.nickname); // 상태 값 출력
            } else {
                setNickname('');
                console.log('로그인 실패');
            }
        } catch (error) {
            console.log('로그인 실패', error);
            setNickname('');
        }
    };

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>아이디: </label>
                    <input 
                        type='text' 
                        name='id' 
                        value={formData.id} 
                        onChange={handleChange} 
                    />
                </div>
                <div>
                    <label>비밀번호: </label>
                    <input 
                        type='password' 
                        name='pw' 
                        value={formData.pw} 
                        onChange={handleChange} 
                    />
                </div>
                <input type='submit' value='로그인' />
            </form>
            {nickname && <div>환영합니다, {nickname}님!</div>} 
        </div>
    );
};

export default LoginFrom;
