using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImplementationDemoApp
{

    //Interface is used to define contract

    //interface enforces all methods to be implemented

    //inside interface all methods are private

    public  interface ICustomerDetails
    {
        //Rules : Constraints
        void ShowDetails();
        void CancelOrder();
        void TrackOrder();
        void ChangePassword(string newPassword,string oldPasssword, string loginName);
    }
}
