using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HR
{
    internal class Person
    {
        private int id;
        private string name;
        private int age;
        private string email;
        private string phone;

        public int ID
        {
            get 
            { 
                return id; 
            }

            set
            {
                id = value;
            }
        }
        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public Person() 
        {
            this.id = 1;
            this.name = "Tejas";
            this.age = 23;
            this.email = "Tejas@gmail.com";
            this.phone = "7420871899";
        }

        public Person(int id, string name, int age, string email, string phone)
        {
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
            this.phone = phone;
        }

        

        static void Main(string[] args)
        {

            Person P = new Person();
            Console.WriteLine(P.id);
            Console.WriteLine(P.name);
            Console.WriteLine(P.age);
            Console.WriteLine(P.email);
            Console.WriteLine(P.phone);

            Person P1 = new Person(2,"Santosh",23,"Santosh@gmail.com","8965327451");
            Console.WriteLine("\n" + P1.id + " ," + P1.name + " ," + P1.age + " ," + P1.email + " ," + P1.phone);
            

            Person P2 = new Person();
            P2.ID = 3;
            P2.Name = "RAM";
            Console.WriteLine(P2.ID);
            Console.WriteLine(P2.Name);
            Console.ReadLine();

        }
    }
}
