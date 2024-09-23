const express = require("express");
const router = express.Router();
const path = require("path");
const file_path = path.join(__dirname, "../public");

router.get("/", (req, res) => {
    res.sendFile(file_path + "/main.html");
});

router.get("/result", (req, res) => {
    const number = req.query.number;
    let table = '<table>';
    for (let i = 1; i <= 9; i++) {
        table += `<tr><td>${number} x ${i} =${number * i}</td></tr>`;
    }
    table += '</table>';
    res.send(`
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>구구단 결과</title>
        </head>
        <body>
            <h1>${number}단 결과</h1>
            ${table}
        </body>
        </html>
    `);
});

module.exports = router;
