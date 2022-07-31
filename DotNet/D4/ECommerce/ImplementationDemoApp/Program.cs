using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImplementationDemoApp
{
    //Consumer Class
    //Subscriber class
    internal class Program
    {
        static void Main(string[] args)
        {
            Shape shape=new Line();
            //Property intializer syntax
            Line l = shape as Line;
            shape.Width = 2;
            shape.Color = "red";
            l.StartPoint = new Point { X = 12, Y = 45 };
            l.EndPoint = new Point { X = 120, Y = 405 };
           
            shape.Draw();


            Profile userProfile = new Profile();

            //Provider instance has been invoked through interface methods

            userProfile.TrackOrder();
            userProfile.CancelOrder();

            ICustomerDetails icustDetails = userProfile;
            icustDetails.ShowDetails();

            IOrderDetails iorderDetails = userProfile;
            iorderDetails.ShowDetails();


            Console.ReadLine();

        }
    }
}
