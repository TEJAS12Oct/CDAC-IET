package Day_18JUNE;
/*
Write a Java client that gives following Menu
	Do it using study.hw.DAO + PrepareStatement 
	Write main class as study.hw.Client3

	1. update name of a given id
	2. update cost of given id
	3. update both name and cost of given id
	4. delete a record of given
	5. show only the info of row of given id
	6. quit
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO1 {

	public Connection myGetconnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/adv_java";
			String uname = "root";
			String pwd = "Sajet@1299";

			con = DriverManager.getConnection(url, uname, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("The Connection Could Not Be Made" + e);
		}
		return con;
	}

	public ResultSet getRows(String sql) {
		Connection con = myGetconnection();
		ResultSet rs = null;
		Statement stmt;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}

	public void ShowResultset(ResultSet rs) {
		try {
			while (rs.next()) {
				int pid = rs.getInt("id");
				String pName = rs.getString("name");
				int cost = rs.getInt(3);
				System.out.println("row: " + pid + "," + pName + "," + cost);
			}

		} catch (SQLException e) {
			System.out.println("problem showing resultset" + e);
		}
	}

	public void updateName(int id, String name) {
		Connection con = myGetconnection();
		PreparedStatement ps;
		{
			try {
				ps = con.prepareStatement("update product set name=? where id=?");
				ps.setInt(2, id);
				ps.setString(1, name);
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void updatCost(int id, int cost) {
		Connection con = myGetconnection();
		PreparedStatement ps;
		{
			try {
				ps = con.prepareStatement("update product set cost=? where id=?");
				ps.setInt(2, id);
				ps.setInt(1, cost);
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void updatNameCost(String name, int id, int cost) {
		Connection con = myGetconnection();
		PreparedStatement ps;
		{
			try {
				ps = con.prepareStatement("update product set name=?,cost=? where id=?");
				ps.setString(1, name);
				ps.setInt(3, id);
				ps.setInt(2, cost);
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void deleteRecord(int id) {
		Connection con = myGetconnection();
		PreparedStatement ps;
		{
			try {
				ps = con.prepareStatement("delete from product where id=?");

				ps.setInt(1, id);
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void givenId(int id) {
		Connection con = myGetconnection();
		PreparedStatement ps;
		{
			try {
				ps = con.prepareStatement("select * from product where id =?");

				ps.setInt(1, id);
				ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
