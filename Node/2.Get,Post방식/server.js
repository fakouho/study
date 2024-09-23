const http = require('http');
const url = require('url');
const fs = require('fs');

const server = http.createServer((req, res) => {
    const parsedUrl = url.parse(req.url, true);
    const pathname = parsedUrl.pathname;
    const query = parsedUrl.query;

    if (pathname === '/') {
        fs.readFile('index.html', (err, data) => {
            if (err) {
                res.writeHead(500, {'Content-Type': 'text/plain'});
                res.end('500 Internal Server Error');
            } else {
                res.writeHead(200, {'Content-Type': 'text/html'});
                res.end(data);
            }
        });
    } else if (pathname === '/result') {
        const number = parseInt(query.number);
        if (number >= 1 && number <= 9) {
            let table = '<table border="1">';
            for (let i = 1; i <= 9; i++) {
                table += `<tr><td>${number} x ${i}</td><td>${number * i}</td></tr>`;
            }
            table += '</table>';
            
            res.writeHead(200, {'Content-Type': 'text/html'});
            res.end(`<html><body><h1>${number}단</h1>${table}</body></html>`);
        } else {
            res.writeHead(400, {'Content-Type': 'text/plain'});
            res.end('잘못된 입력입니다. 1부터 9까지의 숫자만 입력하세요.');
        }
    } else {
        res.writeHead(404, {'Content-Type': 'text/plain'});
        res.end('404 Not Found');
    }
});

server.listen(8000, () => {
    console.log('Server is running on http://localhost:8000');
});
