package Study.Bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import Study.Do.Appointment;

@Component
public class DAOBeanUsingJDBCTemplate {
	@Autowired
	private JdbcTemplate template;

	public void addApoint(String name, String date, String purpose, String type, String start, String end) {
		template.update("insert into appointment values(?,?,?,?,?,?)", name, date, purpose, type, start, end);
	}

	public void updateApoint(String name, String purpose) {
		template.update("update appointment set purpose=? where name=?", purpose, name);

	}

	public List<Appointment> showAppoint(String name) {
		List<Appointment> list = template.query("select * from appointment where name='" + name + "'", (rs, rownum) -> {
			return new Appointment(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
		});
		return list;
	}

	public List<Appointment> showAppoint() {
		List<Appointment> list = template.query("select * from appointment", (rs, rownum) -> {
			return new Appointment(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6));
		});
		return list;
	}

}
