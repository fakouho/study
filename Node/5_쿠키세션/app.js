const express = require("express"); // (1) express 모듈을 가져옵니다
const app = express(); // (1) express 애플리케이션을 생성합니다
const nunjucks = require("nunjucks"); // (1) nunjucks 모듈을 가져옵니다
const mainRouter = require("./routes/mainRouter"); // 메인 라우터를 가져옵니다
const cookieRouter = require("./routes/cookie"); // 쿠키 라우터를 가져옵니다
const sessionRouter = require("./routes/session");
// 메인 라우터를 맨위에서 컨트롤한다.



// 쿠키 설정
const cookieParser = require("cookie-parser");
app.use(cookieParser()); // cookie-parser 미들웨어를 사용합니다

// 세션 세팅
const session = require("express-session");
const fileStore =require("session-file-store")(session);
app.use(session({
    httpOnly : true, // http로 들어온 요청만 처리하겠다.
    resave : false, // 세션을 항상 재 저장하겠다.
    secret : "secret", // 암호화할때 사용하는 키값
    store : new fileStore(), //세션을 저장하기 위한 저장소 셋팅
    saveUninitialized : false //세션에 저장할 내용이 없더라도 저장 여부!
    
}))

// 라우터 설정
app.use("/session",sessionRouter);
app.use("/", mainRouter); // 메인 라우터를 사용합니다
app.use("/cookie", cookieRouter); // 쿠키 라우터를 사용합니다


// 넌적스 설정 (보여지는 뷰 설정) (2)
app.set("view engine", "html");
nunjucks.configure("views", {
    express: app,
    watch: true
});

// 서버 시작
app.listen(3000); // (1) 서버를 포트 3000에서 실행합니다
