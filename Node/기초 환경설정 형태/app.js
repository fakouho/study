const express = require("express");//(1)
const app = express();//(1)
const nunjucks = require("nunjucks");//(1)
const mainRouter = require("./routes/mainRouter");

app.use("/",mainRouter);

// 넌적스 세팅(보여지는 뷰세팅)(2)
app.set("view engine", "html")
nunjucks.configure("views",{
    express : app,
    watch: true
})

app.listen(3000);//(1)