const express = require("express")
const app = express();

const mainRouter = require("./routes/mainRouter")

app.use("/",mainRouter);

app.listen(8000);