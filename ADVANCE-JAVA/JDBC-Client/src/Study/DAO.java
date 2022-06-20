package Study;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

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

	public ResultSet getRows(String sql) {
		Connection con = myGetConnection();
		ResultSet RS = null;
		Statement stmt;
		try {
			stmt = con.createStatement();
			RS = stmt.executeQuery(sql);
		} catch (SQLException E) {
			E.printStackTrace();
		}
		return RS;
	}

	public void showResultSet(ResultSet RS) {
		try {
			while (RS.next()) {
				int pId = RS.getInt("id");
				String pName = RS.getString("name");
				int cost = RS.getInt(3);

				System.out.println(pId + " , " + pName + " , " + cost);
			}
		} catch (SQLException E) {

			System.out.println("Problem Showing ResultSet : " + E);
		}
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
		} catch (SQLException E) {
			E.printStackTrace();
			System.out.println(E);
		}
	}

	public void UpdateProduct(int id, int cost) {

		// get Connection
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("update product set cost=? where id=? ");
			pstmt.setInt(2, id);
			pstmt.setInt(1, cost);

			pstmt.executeUpdate();
		} catch (SQLException E) {
			E.printStackTrace();

		}
	}

	public void CallHistoredProc() {
		Connection con = myGetConnection();
		try {
			CallableStatement cstmt = con.prepareCall("call Hi()");
			ResultSet RS = cstmt.executeQuery();
			RS.next();
			String msg = RS.getString("message");
			System.out.println("You got : " + msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	create procedure `Hi`()
//  -> begin
//  -> select "HELLO TEJAS " as message;
//  -> end $
	
	public void CallNameProc(int id) {
		Connection con = myGetConnection();
		try {
			CallableStatement cstmt = con.prepareCall("{ call getName(?,?) } ");
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setInt(1, id);
			
			cstmt.execute();
			
			String msg = cstmt.getString(2);
			System.out.println("You got : " + msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	create  procedure getName(In pid int ,OUT pname varchar(100) )
//    -> begin
//    -> select name into pname from product where id=pid;
//    -> end $


}
