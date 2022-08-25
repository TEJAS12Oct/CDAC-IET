package Study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// direct run
public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load the driver class from jar to RAM
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		String url ="jdbc:mysql://localhost:3306/ adv_java";
		String uname="root";
		String pwd = "Sajet@1299";

		Connection con = DriverManager.getConnection(url,uname,pwd);
		
		int id;
		String name;
	    int cost;
	    
//		int id =2;
//		String name = "Hard Disk";
//		int cost = 500;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		 id =sc.nextInt();
		System.out.println("Enter Product : ");
		 name =sc.next();
		System.out.println("Enter Cost : ");
		 cost = sc.nextInt();
		
		Statement stmt = con.createStatement();
		
//		String sql = "insert into product values (1 ,'PenDrive' , 300)";
		String sql = "insert into product values ("+id+", '"+name+"' ," +cost +")";
	
//		String sql = "update product set name='SSD' , cost=5500 where id=4 ";
//		String sql = "delete from product where id=4 ";
	
		
		stmt.executeUpdate(sql);
		System.out.println("Record Inserted");
		
		
//		System.out.println(con);
	}

}

/*
+----+-----------+------+
| id | name      | cost |
+----+-----------+------+
|  1 | PenDrive  |  300 |
|  2 | Hard Disk |  500 |
|  3 | watch     | 4800 |
|  4 | HARD-DISK | 4500 |
+----+-----------+------+
*/

// 1. We need MySQL Server ---- Ready made download install
// 2. We need the MySQL Driver Component that interacts with the DB ---- ready made
// 3. Create a Java Client --- We write
//    1. create a new Java project --- JdbcClient
//	  2. right click ---build path -----libraries ---- add external jars ---- 
//       select the mysql-connector(program files(86)->mysql->connector.j).....jar
//       ---- apply close
//    3. write a class study.Client
//       Main

