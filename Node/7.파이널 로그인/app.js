const express = require("express");
const app = express();
const mainRouter = require("./routes/index.js");

// body-parser 등록 대신 express 내장된 미들웨어 사용
app.use(express.urlencoded({ extended: true }));

// 라우터 사용
app.use("/", mainRouter);

app.listen(8000);
