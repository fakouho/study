// 접속한 사용자의  ip체크
const http =require('http');
// 접속한 ip를 확인하는 방법
const userip =require('request-ip');

http.createServer((req,res)=>{
    // req(request)역할 파악 -> 클라이언트가 넘겨준 정보를 담고 있는 공간
    //(접속시간,접속장소,ip,데이터)
    // 사용자의 접속 ip 확인
    let ip = userip.getClientIp(req);
    // ip앞에 붙어 있는 불필요한 7글자 삭제
    // ip를 조회할 때는 ip모듈과 req를 활용한다!
    let req_ip=ip.substring(7)
    if(req_ip=="2"){

    }else{
        
    }
    console.log(req_ip);
    
}).listen(3000)