const express = require("express");//(1)형태잡기
const router = express.Router();//(1)형태잡기

// 메인페이지에 접속했을 때(5)내가 여기로 접속했어
router.get("/", (req, res) => {
    res.render("main");
});

// 로그인 요청했을 때(7)정보가 들어왔어 
router.post("/login", (req, res) => {
    // 성공 실패(10)bp사용해서 이벤트로직만들어서 이동할거야
    let { id, pw } = req.body;
    if (id === "smhrd" && pw === "1234") {
        res.render("success", { id });
    } else {
        res.render("fail");
    }
});

module.exports = router;//(1)형태잡기
