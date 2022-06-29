package APPOINTMENT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	public Connection myGetConnection() {
		Connection connect = null;
		try {
			// Load the class from jar to RAM
			Class.forName("com.mysql.cj.jdbc.Driver");
			// url-->Protocol:dbvendor://IP:portname/database
			String url = "jdbc:mysql://localhost:3306/adv_java";
			String uname = "root";
			String pwd = "Sajet@1299";

			connect = DriverManager.getConnection(url, uname, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("the connection could not be made" + e);
		}
		return connect;
	}

	public ResultSet getRows(String sql) {
		Connection con = myGetConnection();
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}


	public void addAppointment(String date, String purpose, String category, String from, String time) {
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(" insert into appointment values(default,?,?,?,?,?);");
			pstmt.setString(1, date);
			pstmt.setString(2, purpose);
			pstmt.setString(3, category);
			pstmt.setString(4, from);
			pstmt.setString(5, time);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Problem: " + e);
		}
	}

}
