package Day_18JUNE;
/*
 2. Write a Java client that fetches all names of the products
	add all the names in an ArrayList 
	show the size of the arrayList 
	Ask the user to enter a name
    print whether the name is in the ArrayList or not
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO2 {
	ArrayList<String> al = new ArrayList<String>();

	public Connection myGetConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/adv_java";
			String uname = "root";
			String pass = "Sajet@1299";

			con = DriverManager.getConnection(url, uname, pass);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void showRows() {
		Connection con = myGetConnection();
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from product");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int cost = rs.getInt(3);

				System.out.println("Rows : " + id + "," + name + "," + cost);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void ShowNameArrayList() {

		Connection con = myGetConnection();
		ResultSet rs = null;

		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select * from product");

			while (rs.next()) {
				al.add(rs.getString(2));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	public int checkSize() {
		return al.size();
	}

	public boolean checkName(String name) {
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i)).equalsIgnoreCase(name)) {
				return true;
			}

		}
		return false;
	}

}