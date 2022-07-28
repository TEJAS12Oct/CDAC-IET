using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Catalog
{
    public class Product
    {
        /*private int id;

        public int Id //Property
        {
            get { return id; }
            set { id = value; } 
        }*/
        public int Id { get; set; } //auto property
        
        public string Title { get; set; }   
        public string Description { get; set; } 

        public double Price { get; set; }   

        public int Quantity { get; set; }   
    
        
    
    
    }
}
