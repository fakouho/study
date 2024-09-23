const express = require("express");
const router = express.Router();

// 메인페이지에 접속했을 때
router.get("/",(req,res)=>{
    res.render("main");
})
// 축구페이지를 접속했을 때
router.get("/soccer",(req,res)=>{
    res.render("soccer");
})
// 야구페이지를 접속했을 때
router.get("/baseball",(req,res)=>{
    res.render("baseball")
})
// 과자페이지 접속
router.get("/co",(req,res)=>{
    res.render("co")
})

module.exports = router;