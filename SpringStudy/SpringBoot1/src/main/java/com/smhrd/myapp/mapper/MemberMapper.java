package com.smhrd.myapp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.myapp.entity.MemberEntity;

//@Mapper // Bean으로 등록하기 위한 어노테이션
@Repository
public interface MemberMapper extends JpaRepository<MemberEntity, Long>{
	//                                                 table       id
	// JPA에서 제공해주는 기본 CRUD 메소드
	// 1. findAll()
	// -> SELECT * FROM MEMBER_ENTITY;
	// 2. findById(pk값)
	// --> SELECT * FROM MEMBER_ENTITY WHERE PK컬럼명 = 매개변수
	// 3. save(받아올 매개변수 순서대로 OR Entity형태)
	// -> INSERT INTO MEMBER_ENTITY VALUES(?,?,?,?)
	// 4. delete()
	//--> DELETE FROM MEBER_ENTITY WHERE PK컬럼명 = 매개변수
	
	// 메소드명을 기준으로 sql구문을 생성
	// SELECT구문 규칙
	// find + 테이블명(생략가능) + By+컬럼명+And(Or)+ 컬럼명 -> 반드시 카멜식
	
	//SELECT * FROM MEMBER_ENTITY
	// WHERE ID =?
	// AND PW =?
	
	public MemberEntity findByIdAndPw(String id,String pw);
	//     리턴타입         sql문
	//** 주의점!! Sellect구문의 조건절 테이러를 채울때는
	//          매개변수의 순서대로 채워진다!!!!
	
	
	// Spirng MVC
	// SqlSessionFactoryBean 구현체를 만들어서 사용
	// Springboot
	// Hibernate 구현체를 만들어서 사용
	// --> SpringbootContainer안쪽에 해당 클래스가 등록되어있어야함.
	
	
	
	
	
	
	
}
