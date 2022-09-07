package study.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int studId;

	@Column
	private String studName;

	@Column
	private String email;

//	@ManyToMany(mappedBy = "students")
//	private Set<Course> courses;
//
//	public Set<Course> getCourses() {
//		return courses;
//	}
//
//	public void setCourses(Set<Course> courses) {
//		this.courses = courses;
//	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
