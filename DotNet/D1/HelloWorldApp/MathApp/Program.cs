using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HR
{
    internal class Program
    {
        static   void Main(string[] args)
        {
            Console.WriteLine("MathApp process is running");

            try
            {
                Person person = new Person();

                //this sytax is taken from VB language

                person.Name = "Jeevan Kumar";
                person.Id = 56;

                string objName = person.Name;

            }
            catch (Exception ex)
            {

            }
            finally
            {

            }
            Console.ReadLine();
        }
    }
}
