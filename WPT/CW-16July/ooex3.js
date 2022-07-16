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



class Student extends Person
{
    constructor(n,a,roll)
    {
        super(n,a)
        this.roll = roll
    }

    studentInfo()
    {
        console.log(this.name,this.age,this.roll)
    }

    static temp=10
    static display()
    {
        console.log(Student.temp)
    }



}

let stud = new Student("yyy",12,1)
console.log(stud,typeof(stud))

Student.display()
