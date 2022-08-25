package study.jparest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Holiday {

	@Id
	@Column
	private int id;
	@Column
	private String  name;
	@Column
	private Date date;
	
	public Holiday() {}

	public Holiday(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
