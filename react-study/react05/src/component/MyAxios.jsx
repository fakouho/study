import React, { useState, useEffect } from 'react';
import axios from 'axios';

const MyAxios = () => {
    const [movieData, setData] = useState([]);

    const getData = () => {
        // 비동기 통신으로 데이터 가져오기
        axios({
            url: 'https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=82ca741a2844c5c180a208137bb92bd7&targetDt=20120101', // 통신할 주소
            method: 'GET',  // 통신 방식 (GET, POST, PUT...) 기본은 GET
        }).then((res) => {
            // 통신 성공 시 로직
            alert('통신 성공');
            setData(res.data.boxOfficeResult.dailyBoxOfficeList); // 데이터를 상태에 저장
        })
    };
    {/*const getData = async () => {
        try {
            // 비동기 통신으로 데이터 가져오기
            const res = await axios({
                url: 'https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=82ca741a2844c5c180a208137bb92bd7&targetDt=20120101', // 통신할 주소
                method: 'GET',  // 통신 방식 (GET, POST, PUT...) 기본은 GET
            });
            
            // 통신 성공 시 로직
            alert('통신 성공');
            setData(res.data.boxOfficeResult.dailyBoxOfficeList); // 데이터를 상태에 저장

        } catch (error) {
            // 통신 실패 시 로직
            console.error('통신 실패', error);
            alert('통신에 실패했습니다.');
        }
    }; */}
    

    useEffect(() => {
        console.log('저장된 데이터:', movieData);
    }, [movieData]);  // movieData가 변경될 때마다 실행

    return (
        <div>
            {/* 영화 데이터를 화면에 출력 */}
            <button onClick={getData}>정보 가져오기</button>
            <table border={1}>
                <tr>
                    <td>순위</td>
                    <td>영화 이름</td>
                    <td>관객 수</td>
                </tr>
                {movieData.map((data, index) => 
                    <tr key={index}>
                        <td>{data.rank}</td>
                        <td>{data.movieNm}</td>
                        <td>{data.audiAcc}</td>
                    </tr>
                )}
            </table>
        </div>
    );
}

export default MyAxios;
