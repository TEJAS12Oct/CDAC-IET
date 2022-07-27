using System;
//package in Java

// C# carry heritage of C++
//it is object oriented programming languge like java


namespace HelloWorldApp
{
    //public, private, protected
    //internal ( like package scope in java)
    internal class Complex
    {
        public int real;
        public int imag;

        //Constructore overloading
        public Complex( )
        {
            this.real =0;
            this.imag = 0;
        }
        public Complex(int r, int i)
        {
            this.real = r;
            this.imag = i;
        }

        static void Main(string[] args)
        {
            int count = 45;
            bool status = false;
            double amount = 6000;
            //camel casing covention for variable declaration
            string firstName = "Tejas";
            string lastName = "Jawale";
            char character = 'G';
            string fullName=firstName + lastName;


            Console.WriteLine("Hello World in C# to " + fullName);

            int number1 = 567;
            int number2 = 567;
            


            int sum = Add(number1, number2);
            Console.WriteLine("Sum =" + sum);


            Complex  c1=new Complex(45,56);
            Complex c2 = new Complex(67, 34);

            Complex c3 = c1 + c2;
            Complex c4 = c1 - c2;

            Console.WriteLine(c3.real + "+i" + c3.imag);

            Console.ReadLine();
        }

        //Method overloading
        public static  int Add(int op1, int op2)
        {
            int result = op1 + op2;
            return result;

        }

        public static int Add(int op1, int op2, int op3)
        {
            int total = op1 + op2 + op3;
            return total;   
        }


        //Operator overloading
        public static Complex  operator+ (Complex op1, Complex op2)
        {
            Complex temp = new Complex();
            temp.real = op1.real+ op2.real;
            temp.imag = op1.imag+ op2.imag;

            return temp;

        }

        public static Complex operator -(Complex op1, Complex op2)
        {
            Complex temp = new Complex();
            temp.real = op1.real + op2.real;
            temp.imag = op1.imag + op2.imag;

            return temp;


        }

    }
}
