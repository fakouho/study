// 실제 node로 서버를 만들기 위해서 사용하는 모듈 -> http
// 로컬 서버를 제작할 때 사용된다.(서버의 이름 -> 로컬 컴퓨터의 ip)
// 모듈을 불러드릴 때는 const(상수)안에 저장해서 사용하자!
const http = require("http");
//  서버를 만들때 주의할 점!
// 1) 매개변수가 2개 req,res -> req(클라이언트가 넘겨준 데이터) / res(서버가 넘겨줄 데이터)
// 2) listen("포트번호") -> 서버의 주소를 구별하기 위해서
http.createServer((req,res)=>{
    console.log("자자 드가자~")
}).listen(3000)