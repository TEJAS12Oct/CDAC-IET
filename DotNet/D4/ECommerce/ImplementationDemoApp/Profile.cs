using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImplementationDemoApp
{
    //Explicit Initerface Inheritance
    //Multiple interface Inheritance

    //Provider
    //Publisher
    public class Profile : ICustomerDetails,IOrderDetails
    {
  
        //FullyQualified Name
        void ICustomerDetails.ShowDetails()
        {
            Console.WriteLine("Showing Customer Details...");
        }
        void IOrderDetails.ShowDetails()
        {
            Console.WriteLine("Showing Orders Details...");
        }

        public  void CancelOrder()
        {
            Console.WriteLine("Requesting for canceling order which is placed...");

        }

       public  void ChangePassword(string newPassword, string oldPassword, string loginName)
        {
            Console.WriteLine("Customer Password is changed.....");

        }
        public  void TrackOrder()
        {
            Console.WriteLine("Requesting for tracking order which have been processed.");
        }


        
    }
}
