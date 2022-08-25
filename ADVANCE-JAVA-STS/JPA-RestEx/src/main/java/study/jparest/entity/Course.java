package study.jparest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int courseId;
	
	@Column
	private String courseName;
	
	@Column
	private String courseDesc;
	
	@Column
	private int courseDuration;

	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Student> students;
	
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public Set<Student> getStudents() {
		return students;
	}
	
	public Course(){}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	
	
	
	
	
}
