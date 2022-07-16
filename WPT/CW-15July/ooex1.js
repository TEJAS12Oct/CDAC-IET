//JSON 
let obj ={
    'name' : 'ppp',
    '_age' : 30,  //private

    //user is supposed to access the public age
     set age(a){
        if(a>10 && a<100)
        {
            this._age=a;
        }
        else {console.log("wrong age")}
    },

    get age(){
            console.log("the getter of age is called")
            return this._age;
    },

    'show':function()
    {
        console.log("show executing :",this.name,this.age)
    },

    'changeName':function(n)
    {
        this.name = n;
    }

}

console.log(obj.name,obj.age,obj.show)
obj.show();
obj.changeName("qqq")
obj.show()

obj.profession='plumber'
console.log(obj.name,obj.age,obj.show,obj.profession)
console.log(obj)

obj.age=300   //setter is called automatically 
console.log(obj.age)  //getter is called automatically

obj.age=34;
console.log(obj.age)  //getter is called automatically
