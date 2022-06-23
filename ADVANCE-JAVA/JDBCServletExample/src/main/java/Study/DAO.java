package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	public Connection myGetConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ adv_java"; // Protocol : dbvendor://IP:portname/database
			String uname = "root";
			String pwd = "Sajet@1299";

			con = DriverManager.getConnection(url, uname, pwd);

		} catch (ClassNotFoundException | SQLException E) {
			System.out.println("The Connection Could Not be Made : " + E);
		}
		return con;
	}

	public void addProduct(int id, String Name, int cost) {

		// get Connection
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?) ");
			pstmt.setInt(1, id);
			pstmt.setString(2, Name); // Internally Single quote added or not if null
			pstmt.setInt(3, cost);
			pstmt.executeUpdate();
			con.close();
		} catch (SQLException E) {
			E.printStackTrace();
			System.out.println(E);
		}
	}

	public ResultSet getRows(String sql) {

		Connection con = myGetConnection();
		ResultSet rs = null;
		Statement stmt;

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException E) {
			E.printStackTrace();
		}

		return rs;
	}

}
