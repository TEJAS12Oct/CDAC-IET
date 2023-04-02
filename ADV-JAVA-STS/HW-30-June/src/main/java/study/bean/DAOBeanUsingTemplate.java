package study.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import study.Do.Appointment;

@Component
public class DAOBeanUsingTemplate {
	
	
	@Autowired
	private JdbcTemplate template;
	public void insert (String name,String pass,String reason)
	{
		//use for any dml query
		
	   template.update("insert into appointment1 values(?,?,?)",name,pass,reason);
	}
	
	public void update (String name,String reason)
	{
		//use for any dml query
		
	   template.update("update  appointment1 set reason=? where username=?",reason,name);
	}
	
	public List<Appointment>getAppointment()
	{
		List<Appointment>list=template.query("table appointment1", (rs,rownum)->{return new Appointment(rs.getString(1),rs.getString(2),rs.getString(3));});
	     return list;
	}
}
