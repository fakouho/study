// express의 핵심파일, 몸동, 컨트롤타워
// 서버생성, 연결을 시켜주기, 미들웨어 등록
// 1. express버전으로 서버 생성
const express = require("express")
const app = express();

// app에게 알려주기 - 미들웨어 등록
// 정적파일을 public으로 등록
app.use(express.static("public"))

// 2. 사용자가 접속했을 때 서버를 생성하겠다!
// "/"는 사용자가 메인페이지로 들어 왔을 때!
app.get("/",(req,res)=>{
    console.log("서버생성 완료됫다람지!")
    //res.send("<h1>오늘도 성공하자</h1>")
    // 사용자에게 파일로 데이터를 보내주기  -> fs모듈과 같은 기능
    // express에서 경로는 절대경로를 사용한다
    // 현재 작업중인 파일의 절대경로를 알아오는 키워드 -> __dirname
    //console.log(__dirname)
    res.sendFile(__dirname + "/index2.html");
    //res.end()
    // Epress에서 정적인파일(css,js,img)는 반드시 public에서 관리
    // 명령어로 제약 -> app에서 반드시 사용자가 정적인 파일 요청하면 public
})
// 3. 마지막에 항상 포트번호 등록하기
app.listen(3000)