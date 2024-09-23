/*
    nunjucks(템플릿 엔진)사용하는 이유
    - html페이지는 정적인 페이지
    - 사용자마다 각각 페이지를 만들어 주는건 불가능
    - 하나의 템플릿(페이지)를 가지고 페이지를 제작
    - 템플릿 엔진(종류는 다양함)
    - nunjcuks 장점 : HTML코드에 JS코드를 더해서 사용한다

    넌적스 사용하기 위한 기초 설정
    - npm i nunjucks, npm i nunjucks chocidar
    - view폴더 생성 -> 동적인 HTML 파일 생성
*/

const express = require("express");
const app = express();
const mainRouter = require("./routes/mainRouter");
const nunjucks = require("nunjucks");

// 라우터 등록
app.use("/", mainRouter);

// 넌적스(nunjucks) 설정
app.set("view engine", "html"); // 뷰 엔진으로 HTML 사용 설정
nunjucks.configure("views", {   // 뷰 파일이 위치할 디렉토리 지정
    express: app,
    watch: true
});

app.listen(3000);