import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Container from 'react-bootstrap/Container';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

const AlProduce = () => {
  const { id } = useParams();
  const [data, setData] = useState({});  // 초기 상태를 객체로 설정

  const fetchData = async () => {
    try {
      const res = await axios({
        url: `http://localhost:3004/products/${id}`,
        method: 'GET',
      });
      setData(res.data);
      console.log('Received data:', res.data);
    } catch (error) {
      console.error('Failed to fetch data:', error);
    }
  };

  useEffect(() => {
    fetchData();
  }, [id]);  // 의존성 배열에 id 추가

  return (
    <Container>
      <Row>
        <Col>
          <img src={data.prd_img} alt="상품 이미지" />
        </Col>
        <Col>
          <p>{data.prd_brand}</p>
          <p>{data.prd_name}</p>
          <p>{data.prd_price}</p>
          {data.prd_options && data.prd_options.length > 0 ? (
            <Form>
             
                
                <Form.Select aria-label="Default select example">
                  <option>옵션을 선택하세요</option>
                  {data.prd_options.map((option, index) => (
                    <option key={index} value={option.prd_name}>
                      {option.prd_name} - {option.prd_price}원
                    </option>
                  ))}
                </Form.Select>
              
            </Form>
          ) : (
            <p>추가 상품 없음</p>
          )}
          <div>
            <Button variant='outline-danger'>장바구니</Button>
            <Button variant='danger'>바로구매</Button>
          </div>
        </Col>
      </Row>
    </Container>
  );
};

export default AlProduce;
