using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HR
{
    public  class SalesEmployee:Employee
    {
        public double Bonus { get; set; }
        public SalesEmployee():base()
        {

        }
        public SalesEmployee(string fName, string lName, string loginName,
                             string password, double bSalary, double hra,
                             double da,double bonus):base(fName, lName, loginName, 
                             password, bSalary, hra,da)
        {
            this.Bonus = bonus;
        }

        public override double ComputePay()
        {
            return base.ComputePay() + Bonus;
        }

        public override bool DoWork()
        {
            //Graceful termination of a program
            // by throwing Exception
            throw new NotImplementedException();
        }
    }
}
