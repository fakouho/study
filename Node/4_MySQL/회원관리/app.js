const express = require("express");
const app = express();
const nunjucks = require("nunjucks");
const bp = require("body-parser");
const mainRouter = require("./routes/mainRouter");
const userRouter = require("./routes/userRouter");
// 세션을 쓰기 위한 모듈 호출
const session = require("express-session");
const fileStore = require("session-file-store")(session);

//post데이터 처리 등록
app.use(bp.urlencoded({extended : true}));

// 세션설정 
app.use(session({
    httpOnly : true, // http만 처리하겠다!
    resave : false, // 세션을 항상 재 저장하겠다!
    secret : "secret", // 암호화 할때 사용하는 키값
    store : new fileStore, // 세션을 저장할 저장소!
    saveUninitialized : false // 세션에 저장할 내요잉 없더라조 저장하겠냐 -> 기본값 true
}))

//라우터 등록(꼭! 인코딩이 된 데이터를 연결할수있게 코드 흐름을 잘 볼것!!!)
app.use("/", mainRouter);
app.use("/user",userRouter);

//넌적스 셋팅
app.set("view engine", "html")
nunjucks.configure("views",{
    express : app,
    watch : true
});

app.listen(3000);

//다음시간 예제!
//DB 연결정보를 활용해서 로그인, 정보수정, 회원가입, 조회 등등.....