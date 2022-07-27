using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HR
{
    public  class Person
    {
        private int id;
        private string name;
        private int age;
        private string email;
        private string contactNumber;

        //Property
        public int Id
        {
            get { return id; }  // getter block
            set { id = value; }  //setter block

        }

        public string Name
        {
            get { return name; }
            set {
                if(value != "")
                {
                    name = value;
                }
                else
                {
                    throw new Exception("name can not be blank");
                }
            }
        }

        public Person()
        {
            this.id = 1;
            this.name = "Sameer";
            this.age = 23;
            this.email = "sameer.pande@gmail.com";
            this.contactNumber = "9881735801";
        }

        public Person(int id, string name, int age, string email, string contactNumber)
        {
            this.id = id;   
            this.name = name;
            this.age = age;
            this.email = email;
            this.contactNumber = contactNumber;
        }

        ~Person()
        {

        }


        //method overriding
        public override string ToString()
        {
            return this.name + " " + this.email + " " + this.age;
        }
    }
}
