

// 1.Write a Javascript  mylib.js [Hint include this js file using <script src=....  >  ]
//     create a class Product using ES6 class keyword
//     the product has a name,desc and cost properties
//     the product has a show method that shows all properties

// Write an html that has 3 textfields to accept name desc and cost
// when user clicks a save button create a product object using values from textfields and add it to an array 
//     show the array in a table format below

class Product
{
    constructor(pname,pdesc,pcost)
    {
        this.pname=pname;
        this.pdesc =pdesc;
        this.pcost=pcost;
    }

    show()
    {
        console.log(this.pname, this.pdesc,this.pcost)
    }
    

}



