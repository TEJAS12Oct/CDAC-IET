class Person
{
    constructor(name,age)
    {
        this.name=name;
        this._age =age;
    }

    /* constructor(name)
    {
        this.name = name;
        this._age = 100
    }
 */
    show()
    {
        console.log(this.name,this.age)
    }
    set age(a){
        if(a>10 && a<100)
        {
            this._age=a;
        }
        else {console.log("wrong age")}
    }

    get age(){
            console.log("the getter of age is called")
            return this._age;
    }

}

let p1 = new Person("ppp",12)
console.log(p1)
p1.age=122
console.log(p1.age)


