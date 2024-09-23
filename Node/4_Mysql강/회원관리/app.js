const express = require("express");
const app = express();
const nunjucks =require("nunjucks");

//넌적스 셋팅
app.set("view engine","html")
nunjucks.configure("views",{
    express : app,
    watch : true
})

app.listen(3000);