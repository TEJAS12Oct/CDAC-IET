function alpha( s1,s2,s3)
{
    s1("Tejas Habibi..!!!")
    s2(10,20,30)
    s3(100,200,300)
}



//   passing function  arrow fat
alpha((p1)=>{ console.log(p1) },(p1,p2)=>{console.log(p1*p2)},(p1,p2,p3)=>{console.log(p1+p2+p3)})
//  passing function  anonyms function
alpha(
function(p1) {console.log(p1)},
function(p1,p2) {console.log(p1*p2)},
function(p1,p2,p3) {console.log(p1+p2+p3)}
)

alpha(s1,s2,s3)


function s1( f1)
{
    console.log(f1);

}

function s2( f1,f2)
{
    console.log(f1*f2);

}




function s3(f1,f2,f3)
{
    console.log(f1+f2+f3);

}

// Run = node Q4.js