var express = require('express');
var router = express.Router();

// Home page route.
router.get('/', function (req, res) {
  res.send('Book home page');
})

// About page route.
// direct go on postman and run
// localhost:8080/book/about
router.get('/about', function (req, res) {
  res.send('About this book');
})

// using path params
// direct go on postman and run
// localhost:8080/book/savebook/1/Tejas
router.post('/savebook/:bookId/:bookName', function (req, res) {

  var id = req.params.bookId;
  var name = req.params.bookName;
  res.send("your book with id=" + id + " and name=" + name + " is saved");
});


// using query params
// direct go on postman and run
// localhost:8080/book/changebook?bookId=1&bookCost=300
// In postman params
// id        value
// bookId     3
// bookCost  300
router.put('/changebook', function (req, res) {
  var id = req.query.bookId
  var cost = req.query.bookCost

  res.send("id=" + id + " cost updated to cost=" + cost)

});

//using json object
// direct go on postman and run
// localhost:8080/book/deletebook
// In Postman Body
// {
//   "bookId":"1"
// }
router.delete('/deletebook', function (req, res) {
  console.log("delete", req.body)
  var id = req.body.bookId // for this to work add  app.use(express.json()); before the route handler
  res.send("your book with id=" + id + " is deleted")

});

module.exports = router;