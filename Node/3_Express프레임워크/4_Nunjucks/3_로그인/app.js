const express = require("express");//(1)형태잡기
const app = express();//(1)형태잡기
const nunjucks = require("nunjucks");//(2) 사용할거야~
const mainRouter = require("./routes/mainRouter");//(3)이다음 설정이야
const bp = require("body-parser")//(8)bp사용할거구

// app에서 post
app.use(bp.urlencoded({extended:true})) //(9)세팅까지 app에서 잡을거야


// 라우터 등록
app.use("/", mainRouter);//(4)경로는 여기로 할거야

app.set("view engine", "html");//(2)html로 뷰잡을거야~
nunjucks.configure("views", {
    express: app,
    watch: true
});


app.listen(3000);//(1)