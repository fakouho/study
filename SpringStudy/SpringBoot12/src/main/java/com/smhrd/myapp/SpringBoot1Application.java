package com.smhrd.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// SpringBoot 프로젝트의 시작지점
@SpringBootApplication
// @SpringBootConfiguration
// : SpringBoot의 전반적인 환경설정을 담당
// @EnableAutoCpnfiguration
// : jar파파일을 경로상에 로드하면, 필요한 객체들을 자동으로 생성하고 사용
// @ComponentScan 
// : 해당 경로를 기준으로 하위 패키지에 있는 Bean을 자동으로,
//	SpringbootContainer에 등록
// 위 3개의 annotaion을 하나로 합해놓은 @SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

}
