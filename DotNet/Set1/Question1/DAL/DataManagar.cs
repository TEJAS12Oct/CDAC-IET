using System;
using System.Collections.Generic;
using System.Data;
using MySql.Data.MySqlClient;
using Question1.Models;

namespace Question1.DAL
{
    public class DataManagar
    {
        public static List<Presenter> getData()
        {
            List<Presenter> list = new List<Presenter>();
            string data = @"server=localhost;user=root;password=Sajet@1299;database=dotnet";
            MySqlConnection con = new MySqlConnection(data);
            string query = "select * from topic";
            MySqlCommand cmd = new MySqlCommand(query, con);
            cmd.CommandType = CommandType.Text;
            try
            {
                con.Open();
                MySqlDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    Presenter model = new Presenter();
                    model.Id = int.Parse(reader["Id"].ToString());
                    model.Topic = reader["Topic"].ToString();
                    model.Description = reader["Description"].ToString();
                    model.Faculty = reader["Faculty"].ToString();
                    model.Location = reader["Location"].ToString();

                    list.Add(model);

                }
            }
            catch (MySqlException e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                con.Close();
            }
            return list;
        }

        public static bool Insert(string Topic, string Description, string Faculty, string Location)
        {
            bool status = false;
            string data = @"server=localhost;user=root;password=Sajet@1299;database=dotnet";
            MySqlConnection con = new MySqlConnection(data);
            string query = "insert into topic(Topic,Description,Faculty,Location) values(@Topic,@Description,@Faculty,@Location);commit";
            MySqlCommand cmd = new MySqlCommand(query, con);
            cmd.Parameters.AddWithValue("@Topic", Topic);
            cmd.Parameters.AddWithValue("@Description", Description);
            cmd.Parameters.AddWithValue("@Faculty", Faculty);
            cmd.Parameters.AddWithValue("@Location", Location);
            cmd.CommandType = CommandType.Text;

            try
            {
                con.Open();
                int rows = cmd.ExecuteNonQuery();
                if (rows > 0)
                {
                    status = true;
                }
                else
                {
                    status = false;
                }

            }
            catch (MySqlException e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                con.Close();
            }
            return status;
        }

        public static bool Update(Presenter model)
        {
            bool status = false;
            string data = @"server=localhost;user=root;password=Sajet@1299;database=dotnet";
            MySqlConnection con = new MySqlConnection(data);
            string query = "update topic set Description=@Description,Faculty=@Faculty,Location=@Location where Topic=@Topic;commit";
            MySqlCommand cmd = new MySqlCommand(query, con);
            cmd.Parameters.AddWithValue("@Topic", model.Topic);
            cmd.Parameters.AddWithValue("@Description", model.Description);
            cmd.Parameters.AddWithValue("@Faculty", model.Faculty);
            cmd.Parameters.AddWithValue("@Location", model.Location);
            cmd.CommandType = CommandType.Text;

            try
            {
                con.Open();
                int rows = cmd.ExecuteNonQuery();
                if (rows > 0)
                {
                    status = true;
                }
                else
                {
                    status = false;
                }

            }
            catch (MySqlException e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                con.Close();
            }
            return status;
        }

            
        }
}

