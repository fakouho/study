//회원정보를 db에 연결해서 관리하는 라우터
const express = require("express")
const router = express.Router();
const conn = require("../config/db");

//1.회원가입 경로로 접근했을때!
router.post("/join", (req, res) => {
    //1. 프론트에서 넘어온 데이터 확인하기!
    // * 포스트로 넘긴 데이터는 req안에 body로 존재한다.
    console.log("넘어온 데이터 :", req.body);

    let { id, pw, nick } = req.body;
    //컬럼의 키값 순서대로 넣어야한다

    //2. DB와 연결해서 데이터 처리 (설정폴더안에 db파일 가져와야함 최상단 const conn)
    // -1 : 처리할 sql 문장
    // -2 : 입력할 데이터가 필요한 경우 -> 값을 넣어주기!
    // -3 : 처리할 콜백함수

    let sql = "insert into member values (?,?,?)";
    // 항상 컬럼의 갯수만큼 ? 넣어주어야한다

    conn.query(sql, [id, pw, nick], (err, rows) => {
        console.log("디비 insert :", rows);
        if (rows) {
            //가입에 성공했을때, 메인으로 이동!
            res.redirect("/")
        } else {
            //가입에 실패했을때, 알림창
            res.send("<script>alert('회원가입 실패!')</script>")
        }
    });
});

// 2. 로그인하는 로직
router.post("/login", (req, res) => {
    //사용자가 보낸 id,pw로 DB를 검증하는 로직
    console.log("넘어온 데이터 : ", req.body);
    let { id, pw } = req.body;

    //실습!
    //1. sql 쿼리문 작성 -> select 활용 조건 (id=? and pw =?)
    //2. conn쿼리문 실행 (sql, [데이터],(err,rows))
    //3. id와 pw가 일치하면 콘솔창에 로그인성공!/ 불가능 로그인 실패!
    //* select 문을 실행할때 반드시 rows의 length로 조건을 부여할것!
    //why?? 조건이 성립하면 데이터가 들어있는 배열 리턴, 성립하지 않으면 데이터가 비어있는 배열 리턴, 비어있든 비어있지 않든 <리턴은 된다> 길이를 꼭 체크해줄것!!!
    //then? 반드시 데이터의 길이가 0보다 크다 == 데이터가 담겨있다

    let sql = "select * from member where id=? and pw =?"

    conn.query(sql, [id, pw], (err, rows) => {
        console.log('DB연결결과:', rows);
        if (rows.length > 0) {
            console.log("로그인성공!");
            // 사용자의 닉네임 정보를 세션에 저장
            // 사용자의 데이터는 db에서 저장했기 떄문에 rows 변수에서 데이터 꺼내기
            req.session.nick = rows[0].nick;
            res.redirect("/");
        } else {
            console.log("로그인실패!");
        }
    })
})

//3. 회원정보 수정
router.post("/update", (req, res) => {
    console.log(req.body);
    let { id, pw, nick } = req.body;

    // 쿼리문생성
    // update문을 활용해서 조건을 부여할때는 affectedRows를 활용할것!
    // 조건이 잘못되더라도 응답은 넘어온다 ->0
    // 조건을 부여할때 affected> 0 -> 영향이 받은 행이 존재한다.

    let sql = "update member set nick = ? where id = ? and pw = ?";

    conn.query(sql, [nick, id, pw], (err, rows) => {
        console.log(rows);
        if (rows.affectedRows>0) {
            console.log("정보수정성공");
            res.redirect("/");
        } else {
            console.log('정보수정실패!');
        }
    })
})

//4. 회원 탈퇴
router.post("/delete", (req, res)=>{
    console.log(req.body);
    let{id,pw} = req.body;

    let sql = "delete from member where id=? and pw =?"

    conn.query(sql, [id,pw],(err, rows)=>{
        console.log(rows);
        if(rows.affectedRows>0){
            console.log("회원 탈퇴 성공!");
            res.redirect("/")
        }else{
            console.log('회원 탈퇴 실패!');
        }
    })
})

router.get("/logout",(req,res)=>{
    req.session.name="" // 
    req.session.destroy();
    res.redirect("/");
})


module.exports = router;