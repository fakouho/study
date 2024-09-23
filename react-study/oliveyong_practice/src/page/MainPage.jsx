import React, { useEffect, useState } from 'react';
import axios from 'axios';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Card from 'react-bootstrap/Card';
import { useNavigate } from 'react-router-dom';

/* 
  1. 화면최초 렌더링 api 호출하기
  2. 받아온데이터 콘소출력
  3. alData에 저장된 화장품정보를 map 함수를 활용하여 출력
    - 상품이미지(prd_img),브랜드명(prd_brand),상품명(prd_name),상품가격(prd_price),플래그(prd_flag)
  4. 화장품 이미지를 클릭 했을 때 상품 상세페이지로 이동하도록 구현
    - 페이지 이동시, 상품번호 전달
  */

// MainPage 컴포넌트 정의
const MainPage = () => {
  const [alData, setAldata] = useState([])

  const navigate = useNavigate();  // 올바른 함수명 'navigate' 사용
  
  const goTo = (itemId) => () => {
      navigate(`/preDetail/${itemId}`);  // 정확한 URL 패스 형식으로 수정
  }

  const fetchData = async () => {
    try {
      const res = await axios({
        url: 'http://localhost:3004/products',
        method: 'GET',
      });
      const data = res.data;
      console.log('올려진 데이터:', data);
      setAldata(data);
    } catch (error) {
      console.log('데이터를 가져오는데 실패했습니다', error);
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <Container>
      <Row>
        {alData.map((item) => 
          <Col key={item.id}>
            <Card className='card'>
              <Card.Img variant="top" src={item.prd_img} onClick={goTo(item.id)} />
              <Card.Body>
                <Card.Title className='card_tittle'>
                  <p>{item.prd_brand}</p>
                  <p className='card_prd_name'>{item.prd_name}</p>
                </Card.Title>
                <Card.Text className='card_text'>
                  {item.prd_price}
                </Card.Text>
                <p>
                  {item.prd_flag.map((flag, index) => (
                    <span key={index} className='prd_flag rounded-pill' 
                    style={{ backgroundColor: 
                      flag === '세일' ? '#f65c60' :
                      flag === '쿠폰' ? '#9bce26' :
                      flag === '증정' ? '#6fcff7' : '#f374b7',
                      width: flag === '오늘드림' ? '60px' : '40px'
                     }}>
                      {flag}</span>
                  ))}
                </p>
              </Card.Body>
            </Card>
          </Col>
        )}
      </Row>
    </Container>
  );
}

export default MainPage;
