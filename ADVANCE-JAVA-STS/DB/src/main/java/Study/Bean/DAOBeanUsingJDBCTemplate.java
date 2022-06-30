package Study.Bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import Study.Do.ProductDO;

@Component
public class DAOBeanUsingJDBCTemplate {

	@Autowired
	private JdbcTemplate template;

	public void insert(int pid, String name, int cost) {
		// use this for any DML query
		template.update("insert into product values(?,?,?)", pid, name, cost);
	}

	public List<ProductDO> getProducts() {
		List<ProductDO> list = template.query("select * from product", (rs, rownum) -> {
			return new ProductDO(rs.getInt(1), rs.getString(2), rs.getInt(3));
		});
		return list;
	}

	

}
