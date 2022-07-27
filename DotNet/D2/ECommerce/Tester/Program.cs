using System;

using HR;
using Banking;

namespace Tester
{
/*
    public class Counter
    {
        static void Main(string[] args)
        {
            Counter counter = new Counter();

            Console.WriteLine("This is seond entry point function");
            Console.ReadLine();
        }
    }
*/

    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to C#");
            DateTime dt = DateTime.Now;
            Console.WriteLine(dt.ToString());

            Person prn = new Person();
            Console.WriteLine(prn);


            Account acct = new Account(60000);
            acct.Deposit(10000);
            double result = acct.Balance;
            Console.WriteLine(result);
            Console.ReadLine();

        }
    }
}
