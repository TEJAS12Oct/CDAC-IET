let obj={name:"asha",age:"22",country:"india",gender:"female"}
let musician1 = {details : obj , stream : 'singer'}
//let musician2 = {...musician1}

// console.log("using musician 1 using print singer name : "+ musician1.details.name)
// console.log("using musician 2 using print singer name : "+ musician2.details.name)


let musician2 = Object.assign({}, musician1);

musician1.details.name = "lata";
musician1.details.age = 40;

musician2.stream = "bollywood singers";

console.log("m1", musician1);

console.log("m2", musician2);