// 3.  Write  patterns that accept the following
// 	A]  strings having 1 or more occurences of only numbers 
//        B]  strings that have one or more occurences of only uppercase characters
// 	C] Java class name in camel case 
// 	     java method name in camel case
// 	D]  first char caps, second char should be a digit or nothing




let pattern1 = /^[0-9]+$/
var s1 = '15678'
console.log(s1.match(pattern1))


let pattern2 = /^[A-Z]+$/
var s2 = 'ABCDEFG'
console.log(s2.match(pattern2))

let pattern3 = /^[a-z]+[A-Z]/
var s3 = "studentName"
console.log(s3.match(pattern3))



let pattern4 = /^[A-Z][0-9]*$/
var s4 = 'A1234'
console.log(s4.match(pattern4))

