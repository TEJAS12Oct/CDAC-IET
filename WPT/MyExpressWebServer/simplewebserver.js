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

  //server runs continuously waiting for request on port 5000
app.listen(5000, () => {
    console.log('App is listening on port 5000');
  });

//one more request mapping
app.get('/data', (req, resp) => {
    return resp.send({"name":"prachi","gender":"female"});
  });
  

