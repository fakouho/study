// 서버에서 가장 기본이 되는 이정표
const express = require("express")
const router = express.Router();
// 경로 수정을 도와주는 모듈
const path = require("path")
const file_path=path.join(__dirname,"../public")

router.get("/",(req,res)=>{
    //__dirname -> 현재 작성중인 파일을 기준으로 절대경로를 생성
    res.sendFile(file_path+"/main.html")

})

// 라우터를 제작하면 반드시 export해줄것

module.exports = router;