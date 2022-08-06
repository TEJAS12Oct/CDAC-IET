var express = require('express')
var router = express.Router();

// direct go on postman and run
//localhost:8080/math/table/2
router.get("/table/:number", function (req, res) {
    var num = req.params.number
    res.send("table of " + num)
})

// direct go on postman and run
router.post("/doJob", function (req, res) {
    var n1 = parseInt(req.body.num1)
    var n2 = parseInt(req.body.num2)
    var op = req.body.op
    var result = 0
    console.log(op)
    switch (op) {
        case '+': result = n1 + n2; break;
        case '-': result = n1 - n2; break;
        case '*': result = n1 * n2; break;
        case '/': result = n1 / n2; break;
        default: result = 'incorrect operation';
    }

    res.send(n1 + op + n2 + "=" + result)
})

// localhost:8080/math/square
// in postman body
// {
//     "num":3
// }
router.put('/square', (req, res) => {
    var num = parseInt(req.body.num);
    res.send("The square of " + num + " is=" + (num * num))
})


router.delete('/remove', (req, res) => {

    res.send("Removed all")
})
module.exports = router;