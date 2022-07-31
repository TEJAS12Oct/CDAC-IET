using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImplementationDemoApp
{
    public abstract class Shape
    {

        public virtual void Print()
        {
            Console.WriteLine("Printing shape .....");
        }
        public abstract void Draw();
        public int Width { get; set; }
        public string Color { get; set; }
    }
}
