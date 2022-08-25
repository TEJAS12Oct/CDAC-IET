package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load the driver class from jar to RAM
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ adv_java";
		String uname = "root";
		String pwd = "Sajet@1299";

		Connection con = DriverManager.getConnection(url, uname, pwd);

		int id;
		String name;
		int cost;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		id = sc.nextInt();
		System.out.println("Enter Product : ");
		name = sc.next();
		System.out.println("Enter Cost : ");
		cost = sc.nextInt();

		Statement stmt = con.createStatement();

		String sql = "insert into product values (" + id + ", '" + name + "' ," + cost + ")";

		stmt.executeUpdate(sql);
		System.out.println("Record Inserted");

	}

}
