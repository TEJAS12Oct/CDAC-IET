using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Catalog;
namespace ShoppingConsole
{
    internal class Program
    {
        // Design Pattern : MVC  (Model View Controller)
        static void Main(string[] args)
        {
            ProductManager productManager = new ProductManager(); // Business Logic
          
            ProductsController controller = new ProductsController(productManager); // Controller
            
            //Request Controller to send me list of products

            List<Product> products = controller.Index();  //Model

            //View
            Console.WriteLine("****************Product Catalog **************");

            foreach (Product product in products)
            {
                Console.WriteLine("ID: "+product.Id);
                Console.WriteLine("Title:"+product.Title);
                Console.WriteLine("Description"+product.Description);
                Console.WriteLine("UnitPrice"+product.Price);
                Console.WriteLine("Quantity:"+ product.Quantity);
            }

            Console.WriteLine("*************************************************");
            Console.ReadLine();

        }
    }
}
