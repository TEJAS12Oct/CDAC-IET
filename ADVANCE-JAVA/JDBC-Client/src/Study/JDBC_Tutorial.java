package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Tutorial {

	public static void main(String[] args) throws SQLException, IOException {

		Connection con = null;
		ResultSet RS = null;
		Statement stmt = null;
		PreparedStatement pstmt1 = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id, cost = 0;
		String name;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ adv_java", "root", "Sajet@1299");
			if (con != null) {
				System.out.println("Connection sccessfull");
				stmt = con.createStatement();
				// Read Query
				RS = stmt.executeQuery("Select * from product");
				while (RS.next()) {
					System.out.println("id : " + RS.getInt(1));
					System.out.println("name : " + RS.getString(2));
					System.out.println("cost : " + RS.getInt(3) + "\n");
				}

				// update query
				pstmt1 = con.prepareStatement("update product set name=? , cost=? where id=? ");
		
				System.out.println("Enter the ID No to Modify");
				id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter name which you want to set");
				name = br.readLine();
				
				System.out.println("Enter the Cost No to Modify");
				cost = Integer.parseInt(br.readLine());
				
				pstmt1.setInt(3, id);
				pstmt1.setString(1, name);
				pstmt1.setInt(2, cost);

				System.out.println(pstmt1.executeUpdate());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pstmt1.close();
			RS.close();
			con.close();
			br.close();
		}

	}

}
