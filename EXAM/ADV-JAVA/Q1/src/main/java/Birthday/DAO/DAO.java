package Birthday.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {

	public Connection myGetConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/exam";
			String uname = "root";
			String pwd = "Sajet@1299";

			con = DriverManager.getConnection(url, uname, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("the connection could not be made....." + e);
		}
		return con;
	}

	public void addKid(String fname, String lname, int age) {
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into kid values(?,?,?)");
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			pstmt.setInt(3, age);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// End Of addKid

	public void addAdult(String fname, String lname, int age) {
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into adult values(?,?,?)");
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			pstmt.setInt(3, age);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// End Of AddAdult
}
