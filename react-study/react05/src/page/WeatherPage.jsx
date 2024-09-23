import React, { useState, useEffect } from 'react';
import axios from 'axios';

const WeatherPage = () => {
    // useState를 사용하여 상태 변수를 선언합니다.
    const [weather, setWeather] = useState(null);

    const getData = async () => {
        try {
            // 비동기 통신으로 데이터 가져오기
            let cityName = 'Gwangju'; // 도시 이름 변수 선언
            const API_key = process.env.REACT_APP_WEATHER_API_KEY;
            let weather_url = `https://api.openweathermap.org/data/2.5/weather?q=${cityName}&appid=${API_key}&units=metric`; 
            
            const res = await axios({
                url: weather_url, // 통신할 주소
                method: 'GET',  // 통신 방식 (GET, POST, PUT...) 기본은 GET
            });
    
            // 통신 성공 시 로직
            const data = res.data;
            setWeather(data); // 상태 업데이트
            console.log('날씨 정보', data);
    
        } catch (error) {
            // 통신 실패 시 로직
            console.error('날씨 정보를 가져오는 중 오류 발생:', error);
        }
    };

    useEffect(() => {
        getData();
    }, []); // 빈 배열을 사용하여 컴포넌트가 마운트될 때만 실행되도록 설정

    return (
        <div>
            <h1>WeatherPage</h1>
            {weather ? (
                <div>
                    <p>도시: {weather.name}</p>
                    <p>온도: {weather.main.temp} °C</p>
                    <p>날씨: {weather.weather[0].description}</p>
                    <p><img src={'https://openweathermap.org/img/wn/10d@2x.png'}/></p>
                </div>
            ) : (
                <p>날씨 정보를 로딩 중...</p>
            )}
        </div>
    );
};

export default WeatherPage;
