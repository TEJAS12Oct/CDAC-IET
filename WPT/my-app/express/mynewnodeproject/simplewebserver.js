const express = require('express');
const path = require('path');

let app = express()

var bookroutes = require('./routemodule1.js');
app.use(express.json());
app.use('/book', bookroutes);

app.get('/', (request, response) => {
    return response.send('Welcome to the express web server');
  });



app.get('/data', (request, response) => {
    return response.send({"name":"prachi","gender":"female"});
  });


app.listen(5000, () => {
    console.log('App is listening on port 5000');
  });

  
