const express = require("express");
const app = express();
const bp = require("body-parser");//(1)

// 1. 정적 파일 등록
app.use(express.static("public"));

// body-parser 등록
app.use(bp.urlencoded({ extended: true }));

// 2. 서버 등록
app.get("/", (req, res) => {
    console.log("생성완료");
    res.sendFile(__dirname + "/public/login.html");
});

// get방식으로 넘어온 데이터 처리
app.get("/getLogin", (req, res) => {
    console.log("get방식 요청이 들어왔습니다.");
    console.log(req.url);
    
    // get방식으로 넘어온 데이터를 객체로 출력
    const { id, pw } = req.query;
    console.log(req.query);

    // 실습 (콘솔)
    // 1. 입력한 id가 "smhrd"이고, 비밀번호가 "1234" -> 로그인 성공
    if (id === "smhrd" && pw === "1234") {
        console.log("로그인 성공");
        // redirct-> url이 변동 -> 사용자 위치 공개 -> 절대경로 x
        // 위에서 static을 public에서 찾도록 작업
        res.redirect("/성공.html");
    } else {
        // 2. 아니면 -> 로그인 실패
        console.log("로그인 실패");
        res.sendFile(__dirname + "/public/실패.html");
    }
   
});

// post데이터 처리
app.post("/postLogin", (req, res) => {
    console.log("post방식 요청이 들어왔습니다.");
    // bp가 변환한 데이터를 활용
    console.log(req.body);//(2)
});

// 3.포트 등록
app.listen(3000, () => {
    console.log("서버가 포트 3000에서 실행 중입니다.");
});
