using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Utility;
namespace MembershipRolesMgmt
{
    //Multilevel inheritance
    public sealed  class Customer:User
    {
        public Address ResidentialAddress { get; set; }
        public Address DeliveryAddress { get; set; }

        public Customer(string fName, string lName, string loginName, string password,
                        Address resAddress, Address delAddress):base(fName,lName,loginName,password)
        {
            this.ResidentialAddress = resAddress;
            this.DeliveryAddress = delAddress;
            

        }
        public override string ToString()
        {
            string str = string.Empty;
            str = string.Format(" {0} , Residential Address ={1} ,DeliveryAddresss={2}",
                                 base.ToString(), ResidentialAddress, DeliveryAddress);
            return str;
        }
    }
}
