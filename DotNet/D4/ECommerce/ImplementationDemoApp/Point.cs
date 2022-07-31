using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImplementationDemoApp
{
    public class Point
    {
        public int X { get; set; }
        public int Y { get; set; }

        public override string ToString()
        {
            string result=string.Empty;
            result=string.Format("X={0}, Y={1}",X,Y);
            return result;
        }
    }
}
