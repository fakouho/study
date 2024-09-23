const express = require("express");
const router = express.Router();
const path = require("path");

router.get("/", (req, res) => {
    res.sendFile(path.join(__dirname, "../public/index.html"));
});


router.post("/", (req, res) => {
    const { id, pw } = req.body;

    if (id === "admin" && pw === "1234") {
        res.send(`${id}님 환영합니다!`);  
    } else {
        res.send("아이디 또는 비밀번호를 확인해주세요.");
    }
});

module.exports = router;
