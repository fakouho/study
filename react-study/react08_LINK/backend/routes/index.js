const express = require('express')
const router = express.Router()
const path = require('path')
const conn = require('../config/db.js')

router.get('/', (req, res) => {
    console.log('main router!');
    res.sendFile(path.join(__dirname, '..', '..', 'frontend', 'build', 'index.html'));
})

router.post('/getData', (req, res) => {
    console.log('front에서 요청 들어옴', req.body)

    let sql = 'INSERT INTO NODEJS_MEMBER VALUES(?,?,?)';

    conn.query(sql, ['admin', 1234, req.body.data], (err, rows) => {
        if (err) {
            console.log('입력 오류 발생')
        }
        if (rows) {
            res.send({ result: "success" })
        } else {
            res.send({ result: "failed" })
        }
    });

    conn.end();
});

// 회원가입 처리 로직 구현
router.post('/joinForm', (req, res) => {
    const { id, pw, nickname } = req.body;
    console.log('회원가입 정보', req.body);

    let sql = 'INSERT INTO NODEJS_MEMBER (id, pw, nickname) VALUES (?, ?, ?)';
    conn.query(sql, [id, pw, nickname], (err, rows) => {
        if (err) {
            console.log('입력 오류 발생')
        }
        if (rows) {
            res.send({ result: "success" })
        } else {
            res.send({ result: "failed" })
        }
    });
});

// 로그인 관련 로직 구현
router.post('/loginFrom', (req, res) => {
    const { id, pw } = req.body;
    console.log('로그인 정보', req.body);

    let sql = 'SELECT * FROM NODEJS_MEMBER WHERE id = ? AND pw = ?';
    conn.query(sql, [id, pw], (err, rows) => {
        if (err) {
            console.log('입력 오류 발생')
        }
        if (rows) {
            res.send({ result: "success" })
        } else {
            res.send({ result: "failed" })
        }
    });
});



module.exports = router;
