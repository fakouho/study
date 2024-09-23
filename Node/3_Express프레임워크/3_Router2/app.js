/*
    라우터란(Router)?
    -메인서버가 모든 경로를 처리를 하기 부담드럽다 -> 페이지가 많아지면 경로도 증가
    -각각의 경로에 관련된 일드은 라우터가 처리하겠다.
    -app.js에서는 사용할 router 등록만
*/
const express = require("express");
const app = express();
const mainRouter = require("./routes/mainRouter")
const subRouter = require("./routes/subRouter")
// app 알려주기
// 메인경로로 들어오는 모든 요청은 mainRouter에서 사용(미들웨어등록)
app.use("/",mainRouter);//(1)
app.use("/minor",subRouter);

app.listen(3000);