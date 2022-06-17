package Day_17JUNE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Client1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String id;
		int cost, choice = 0;
		String name;

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ adv_java";
		String uname = "root";
		String pwd = "Sajet@1299";

		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement stmt = con.createStatement();

		do {
			System.out.println("0. Exit");
			System.out.println("1. Insert Product");
			System.out.println("2. Update Product");
			System.out.println("3. Delete Product");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter id : ");
				id = sc.next();
				System.out.println("Enter Product : ");
				name = sc.next();
				System.out.println("Enter Cost : ");
				cost = sc.nextInt();

				String sql = "insert into product1 values (" + id + ", '" + name + "' ," + cost + ")";

				stmt.executeUpdate(sql);
				System.out.println("Record Inserted");
				break;
			}
			case 2: {
				System.out.println("Enter id : ");
				id = sc.next();
				System.out.println("Enter Product : ");
				name = sc.next();
				System.out.println("Enter Cost : ");
				cost = sc.nextInt();

				String sql = "update product1 set name= ' " + name + " ' , cost=" + cost + " where id= " + id + "";

				stmt.executeUpdate(sql);
				System.out.println("Record Updated");

				break;
			}
			case 3: {
				System.out.println("Enter id which you want to delete: ");
				id = sc.next();

				String sql = "delete from product1 where id=" + id + "";

				stmt.executeUpdate(sql);
				System.out.println("Record Deleted");
				break;

			}
			default: {
				System.out.println("Invalid Choice....!!!!");
			}
			}
		} while (choice != 0);

	}

}
