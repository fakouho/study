const express =require("express")
const router = express.Router();    

router.get("/",(req,res)=>{
    // 넌적스 파일을 생성할 때는 , render함수 사용하기
    res.render("main",{name : "정형"})
})

module.exports = router;