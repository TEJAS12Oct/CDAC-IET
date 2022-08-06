const express = require('express');
const path = require('path');

let app = express()

//We help the express server to redirect to the routemodule1.js
//WHEN any request of type /book occurs 
var bookroutes = require('./routemodule1.js');
app.use(express.json());
app.use('/book', bookroutes);

var mathroutes = require('./routemodule2.js');
app.use('/math', mathroutes);

app.get('/', (request, response) => {
  return response.send('Welcome to the express web server');
});

//server runs continuously waiting for request on port 8080
// Run => node simplewebserver.js
// on Chrome => localhost:3000
app.listen(3000, () => {
  console.log('App is listening on port 3000');
});

//one more request mapping
// Run => node simplewebserver.js
// on Chrome => localhost:3000/data
app.get('/data', (req, resp) => {
  return resp.send({ "name": "Tejas", "gender": "Male" });
});




