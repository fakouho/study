// 접속한 사용자의  ip체크
const http =require('http');
http.createServer((req,res)=>{
    // req(클라이언트),res(서버)
    // 사용자가 서버에 접속하면 <h1>태그로 접속을 환영합니다!
    // 1. 헤드 정보에 한글 인코딩
    // 응답코드 200,400,500
    // 200= 통신성공 
    // 400=500=통신 실패-> 400(프론트),500(백앤드)문제
    res.writeHead(200,{"Content-Type" : "text/html; charset=utf-8"})
    let html = `
        <h1>접속을 환영합니다!</h1>
        <h2>접속을 환영합니다!</h2>
        <h3>접속을 환영합니다!</h3>
        <h4>접속을 환영합니다!</h4>
    `
    res.write(html);
    res.end()
    //. 서버를 생성하고 응답을 할 때 주의점!
    // 1. 한글을 지원하려면 반드시 인코딩해주기 -> writedHead
    // 2. 응답이 끝나면 반드시 end()를 사용해주기 -> 무한로딩 방지!
}).listen(3000);

