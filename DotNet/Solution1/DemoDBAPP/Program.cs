using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using MySql.Data.MySqlClient;

namespace DemoDBAPP
{
    internal class Program
    {

        public static void  ReadAllEmployees()
        {
            string conString = @"server=localhost;user=root; password=''; database=actsdb";
            MySqlConnection con = new MySqlConnection(conString);
            string query = "SELECT * FROM employees";
            MySqlCommand cmd = new MySqlCommand(query, con);
            cmd.CommandType = CommandType.Text;
            try
            {
                con.Open();
                MySqlDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    int id = int.Parse(reader["ID"].ToString());
                    string name = reader["Name"].ToString();
                    string designation = reader["Designation"].ToString();
                    double salary = double.Parse(reader["Salary"].ToString());
                    Console.WriteLine(id + " " + name + " " + designation + " " + salary);
                }
            }
            catch (MySqlException exp)
            {
                string message = exp.Message;
                Console.WriteLine(message);
            }

            finally
            {
                con.Close();
            }

        }
  
        public static bool DeleteEmployee(int id)
        {
            bool status = false;
            string conString = @"server=localhost;user=root; password=''; database=actsdb";
            MySqlConnection con = new MySqlConnection(conString);
            string query = "DELETE FROM employees WHERE ID=" + id;
            MySqlCommand cmd = new MySqlCommand(query, con);
            cmd.CommandType = CommandType.Text;
            try
            {
                con.Open();
               int rowsAffected = cmd.ExecuteNonQuery();
                if(rowsAffected > 0)
                {
                    status = true;  
                }
                
            }
            catch (MySqlException exp)
            {
                string message = exp.Message;
                Console.WriteLine(message);
            }

            finally
            {
                con.Close();
            }

            return status;
        }

        public static bool InsertEmplyee(int id, string name, string designation, double salary)
        {
            bool status = false;
            string conString = @"server=localhost;user=root; password=''; database=actsdb";
            MySqlConnection con = new MySqlConnection(conString);
            string query = "INSERT INTO  employees(ID, Name, Designation, Salary) values("+
                            id+ ",'"+ name + "','"+ designation+ "', "+ salary+ ")";

            MySqlCommand cmd = new MySqlCommand(query, con);
            cmd.CommandType = CommandType.Text;
            try
            {
                con.Open();
                int rowsAffected = cmd.ExecuteNonQuery();
                if (rowsAffected > 0)
                {
                    status = true;
                }
            }
            catch (MySqlException exp)
            {
                string message = exp.Message;
                Console.WriteLine(message);
            }
            finally
            {
                con.Close();
            }
            return status;
        }

        public static bool UpdateEmplyee(int id, string name, string designation, double salary)
        {
            bool status = false;
            string conString = @"server=localhost;user=root; password=''; database=actsdb";
            MySqlConnection con = new MySqlConnection(conString);
            string query = "UPDATE  employees SET Name='" + name + "', Designation='" + designation +
                            "',Salary=" + salary + " WHERE ID=" + id;

            MySqlCommand cmd = new MySqlCommand(query, con);
            cmd.CommandType = CommandType.Text;
            try
            {
                con.Open();
                int rowsAffected = cmd.ExecuteNonQuery();
                if (rowsAffected > 0)
                {
                    status = true;
                }
            }
            catch (MySqlException exp)
            {
                string message = exp.Message;
                Console.WriteLine(message);
            }
            finally
            {
                con.Close();
            }
            return status;
        }


        static void Main(string[] args)
        {
            ReadAllEmployees();
           // InsertEmplyee(777, "Sameer Pande", "Manager", 45000);
           // InsertEmplyee(779, "Manisha Patil", "Developer", 95000);
            Console.WriteLine("After Deletion....");
            // DeleteEmployee(779);
            UpdateEmplyee(777, "Rutuja Nene", "Tester", 76000);
            ReadAllEmployees();
            Console.ReadLine();
        }
    }
}
