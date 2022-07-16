//Object Constructor - function constructor

function Person(name,age)
{
    this.name=name;
    this.age = age;

    this.show = function(){console.log(this.name,this.age)}

}

let student = new Person("ppp",20);
console.log(student)

let mother = new Person("mmm",45);
console.log(mother)

student.branch = "computer";
console.log(student)
