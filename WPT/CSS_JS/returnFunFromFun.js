function message(choice)
{
    if(choice == 1) //returning anon func
      return function(name){ console.log("good morning",name)} 

    if(choice==2)  //return fat arrow func
        return (n)=>{console.log("good afternoon",n)}
    
    if(choice==3)
    {
        function abc(nm)
        {
            console.log("good evening",nm)
        }
        return abc   //return named function
    }    

    if(choice ==4)
    {
        var x = function(n){console.log("good night",n)}
        return x  //returning a function type variable
    }

}

var f1 =message(3)
f1("kathy")

message(2)("Tejas")

message(1)("twitter")

message(3)("telegram")

message(4)("whatsapp")
