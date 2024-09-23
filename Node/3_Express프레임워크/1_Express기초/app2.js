// 1. express버전으로 서버 생성
const express = require("express")
const app = express();
// 2. 정적 파일 등록
app.use(express.static("public"));

app((res,req)=>{
    res.sendFile(__dirname + "/index2.html");
    console.log(req.query);
})
app.listen(3000)