using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSFeaturesDemoApp
{
    public class Books
    {
        private string[] titles = new string[5];


        //Indexer 
        //Smart Array
        public string this[int index] { 

            get { return titles[index]; }
            set { titles[index]=value; }
         } 
    }
}
