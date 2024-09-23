/*
    쿠키란 : 클라이언트가 브라우저에 저장하는 데이터 공간 -> 일정 시간 동안 유지됨
    - 서버의 자원을 사용하는 것이 아닌 브라우저 자원 사용
    - 쿠키는 사용자가 브라우저를 종료하더라도 존재함
    - 반드시 만료 기간을 설정해줌
    - 설치: npm i cookie-parser -> 쿠키 데이터를 변환하는 모듈
    - 주의점! 
    - 쿠키 생성,삭제 -> res
    - 쿠키 조회 -> req
    - 쿠키 생성시 생명주기 넣어주기 -> 누적이 x
    - 개인정보가 담긴 중요한 데이터는 쿠키에 저장하면 안된다.
*/

const express = require("express");
const router = express.Router();

// 1) 쿠키 등록하기
router.get("/setCookie", (req, res) => {
    console.log("쿠키 등록하기");
    // 쿠키를 등록하기
    res.cookie("nick", "cookieNickname"); // key, value
    // 1.1) 쿠키 만료 설정 -> 하지 않으면 계속 브라우저에 존재 -> 성능 저하
    // 방법 - maxAge -> ms단위로 설정
    res.cookie("name","hyung",{maxAge:5000});
    // 방법 - expires -> 현재날짜 + 초*분*시*일
    // 쿠리의 수명만료를 날짜로 설정
    res.cookie("age","20",{expires: new Date(Date.now()+60*60*24*3)});
    res.redirect("/"); // 저장하면 메인으로 이동
});

// 2) 쿠키 확인하기
router.get("/getCookie", (req, res) => {
    console.log("쿠키 확인하기", req.cookies.nick); // 쿠키 불러오기
    console.log("쿠키 생명주기", req.cookies.name); // 쿠키 불러오기
    console.log("쿠키 생명주기2", req.cookies.age); // 쿠키 불러오기
    res.redirect("/"); // 메인 페이지로 이동
    // 쿠키를 불러올 때는 req를 사용함
});

// 3) 쿠키 삭제하기
router.get("/clearCookie",(req,res)=>{
    console.log("쿠키 삭제하기")
    res.clearCookie("nick");
    res.clearCookie("age");
    res.redirect("/");
})

module.exports = router;
