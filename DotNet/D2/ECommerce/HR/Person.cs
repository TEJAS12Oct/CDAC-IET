using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HR
{
    public   class Person
    {
        private string fName;
        private string lName;
        private  DateTime birthDate;

        public Person()
        {
            this.fName = "Tejas";
            this.lName = "Jawale";
            this.birthDate = new DateTime(1999, 10, 12);

        }
        public Person(string f, string l , DateTime dt)
        {
            this.fName = f;
            this.lName = l;
            this.birthDate = dt;
        }

        public override string ToString()
        {
            return   fName + " " + lName + "  "+ birthDate.ToShortDateString();
        }
    }
}
