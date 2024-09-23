import React, { useState } from 'react';
import api from '../api';

const JoinForm = () => {
    const [id, setId] = useState('');
    const [pw, setPw] = useState('');
    const [nickname, setNickname] = useState('');

    const handleChange = (e) => {
        const { name, value } = e.target;
        if (name === 'id') {
            setId(value);
        } else if (name === 'pw') {
            setPw(value);
        } else if (name === 'nickname') {
            setNickname(value);
        }
    };

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            const response = await api.post('/joinForm', {
                id,
                pw,
                nickname
            });
            console.log('입력 성공:', response.data);
        } catch (err) {
            console.error('입력 실패:', err);
        }
    };

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>아이디</label>
                    <input type="text" name='id' onChange={handleChange}/>
                </div>
                <div>
                    <label>비밀번호</label>
                    <input type="password" name='pw' onChange={handleChange}
                    />
                </div>
                <div>
                    <label>닉네임</label>
                    <input type="text" name='nickname' onChange={handleChange}
                    />
                </div>
                <button type="submit">회원가입</button>
            </form>
        </div>
    );
};

export default JoinForm;
