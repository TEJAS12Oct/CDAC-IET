package Study.Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import Study.Do.ProductDO;

public class DAOBean {

	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public void insert(int pid, String Name, int cost) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, pid);
			pstmt.setString(2, Name);
			pstmt.setInt(3, cost);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void show()
	{
		List<ProductDO> list = getDB();
		
		for (ProductDO p : list) 
		{
			System.out.println(p);
		}
	}
	
	public List<ProductDO> getDB() 
	{
		List<ProductDO> list = new ArrayList<>();
		
		try {
			Connection con = ds.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while(rs.next())
			{
				ProductDO obj = new ProductDO();
				obj.setPid(rs.getInt(1));
				obj.setPname(rs.getString(2));
				obj.setPcost(rs.getInt(3));
				
				list.add(obj);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

}
