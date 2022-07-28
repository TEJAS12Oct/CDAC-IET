using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Catalog
{
    //Perform CRUD Operations
    public  class ProductManager
    {
        //Automic Operation

        private List<Product> products = new List<Product>();
        public bool Initialize()
        {
            bool status = false;
            Product product = new Product();
            product.Id = 1;
            product.Title = "Gerbera";
            product.Description = "Wedding flower";
            product.Price = 12;
            product.Quantity = 4000;
            products.Add(product);

            product = new Product();
            product.Id = 2;
            product.Title = "Rose";
            product.Description = "Valentine flower";
            product.Price = 24;
            product.Quantity = 24000;
            products.Add(product);

            product = new Product();
            product.Id = 3;
            product.Title = "Jasmine";
            product.Description = "Semlling flower";
            product.Price = 1;
            product.Quantity = 654000;
            products.Add(product);

            product = new Product();
            product.Id = 4;
            product.Title = "Lotus";
            product.Description = "Worship flower";
            product.Price = 25;
            product.Quantity = 14000;
            products.Add(product);

            status = true;
            return status;

        }
        public bool Insert(Product product)
        {
            bool status=false;
            this.products.Add(product);
            status=true;
            return status;
        }
        public bool Update(Product product)
        {
            bool status = false;
            Product foundProduct= products.Find(x => x.Id == product.Id);
            if (foundProduct != null)
            {
                products.Remove(foundProduct);
                products.Add(product);
                status=(true);
            }
            return status;
        }
        public List<Product> GetAll()
        {
            return products;
        }
        public Product GetById(int id)
        {
            #region basic style of searching product from list
            // this is basic style of iterating and searching product based on condition

            /* foreach( Product p in products)
             {
                 if(p.Id == id)
                     return p;
             }*/
            #endregion

            return products.Find(x => x.Id == id); //inline function (arrow function)
        }
        public bool Delete(int id)
        {
            products.Remove(products.Find(x => x.Id == id));
            return true;
        }
    }
}
