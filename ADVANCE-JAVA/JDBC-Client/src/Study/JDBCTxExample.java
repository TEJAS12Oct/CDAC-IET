package Study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTxExample {

	public static void main(String[] args) throws SQLException {
		DAO dao = new DAO();

		Connection con = dao.myGetConnection();
		PreparedStatement pstmt = con.prepareStatement("update account set balance=? where accno=?");

		try {
			con.setAutoCommit(false);

			pstmt.setInt(1, 1500);
			pstmt.setString(2, "A");

			pstmt.executeUpdate();

			pstmt.setInt(1, 7500);
			pstmt.setString(2, "B");
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 300000);
			pstmt.setString(2, "C");
			pstmt.executeUpdate();

			System.out.println("SUCCEDED...!!!");
			con.commit();
		} catch (SQLException E) {
			System.out.println("FAILED....!!!");
			con.rollback();
		}
	}

}
