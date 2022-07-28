using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MembershipRolesMgmt
{
    public class Person
    {
        //For auto properties  complier  will add private member
        //as well getter and setter method

        public string Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }

        //Method Overloadin (Constructor Overloading)
        //Constructor Chaining
        public Person():this("Raj", "Malhotra")
        {
            //No need to duplicate
        }

      
        public Person(string fName, string lName)
        { 
            //Implicit Self reference
            this.Id = Guid.NewGuid().ToString();
            this.FirstName=fName;
            this.LastName=lName;
        }


        //Method Overriding
        public override string ToString()
        {
            //return  this.Id + "  "+ this.FirstName + " "+ this.LastName;
            string str = string.Empty;
            str = string.Format("Id={0} , First Name={1},  Last Name= {2}", Id, FirstName, LastName);
            return str;
        }

    }
}
