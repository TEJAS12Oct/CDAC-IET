package Study.Bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import Study.Do.ProductDO;

public class DAOBeanUsingJDBCTemplate {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void insert(int pid, String name, int cost) {

		template.update("insert into product values(?,?,?)", pid, name, cost);
	}

	public void show() {
		List<ProductDO> list = getDB();

		for (ProductDO p : list) {
			System.out.println(p);
		}
	}

	public List<ProductDO> getDB() 
	{
		List<ProductDO> list = template.query("select * from product", 
				(rs, rowNum) ->{return new ProductDO(rs.getInt(1),rs.getString(2),rs.getInt(3)); } );
		return list;
	}

}
