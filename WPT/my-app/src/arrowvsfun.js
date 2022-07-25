let obj = {

        myname : "prachi",
        getName :  function()
        {
            console.log(" get name called")
            console.log(this.myname)
            
        }

}

let f1 = obj.getName
  f1()  //unbound , it doesnt get a this

  f1  = f1.bind(obj)  
  f1()  //bound object , it has a this 



