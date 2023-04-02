package study.bean;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DAOBean {

	@Autowired
	private DataSource ds;


	public void insert(String name,String password,String reason)
	{
		try {
			Connection con=ds.getConnection();
			PreparedStatement psmt=con.prepareStatement("insert into appointment1 values(?,?,?)");
			psmt.setString(1, name);	
			psmt.setString(2, password);
			psmt.setString(3, reason);
			psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}



	public void Update(String name,String reason)
	{
		try {
			Connection con=ds.getConnection();
			PreparedStatement psmt=con.prepareStatement("update  appointment1 set reason=? where username=?");
			psmt.setString(1, reason);	
			psmt.setString(2, name);
			psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void showall()
	{

		try {
			Connection con=ds.getConnection();
			PreparedStatement psmt=con.prepareStatement("table appointment1");
			ResultSet rs=psmt.executeQuery();
			while(rs.next())
			{
				String name=rs.getString(1);
				String pass=rs.getString(2);
				String reason=rs.getString(3);
				System.out.println(name+" ,"+pass+" ,"+reason);
			}

		} catch (SQLException e) {

			e.printStackTrace();}
	}

	public void showUsers(String user)
	{

		try {
			Connection con=ds.getConnection();
			PreparedStatement psmt=con.prepareStatement("select * from appointment1 where username=?");
			psmt.setString(1, user);
			//psmt.executeUpdate();
			ResultSet rs=psmt.executeQuery();
			while(rs.next())
			{
				String name=rs.getString(1);
				String pass=rs.getString(2);
				String reason=rs.getString(3);
				System.out.println(name+" ,"+pass+" ,"+reason);
			}

		} catch (SQLException e) {

			e.printStackTrace();}
	}


}
