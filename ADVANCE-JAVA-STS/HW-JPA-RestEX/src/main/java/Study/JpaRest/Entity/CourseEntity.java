package Study.JpaRest.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class CourseEntity {

	@Id
	@Column
	private int ID;

	@Column(name = "Course_Name")
	private String courseName;

	@Column(name = "Course_Desc")
	private String CourseDescription;

	@Column(name = "Course_Duration")
	private int CourseDuration;

	@Column(name = "Faculty_Name")
	private String FacultyName;

	public CourseEntity() {
	}

	public CourseEntity(int iD) {
		super();
		ID = iD;
	}
	
	

	public CourseEntity(String courseName, String facultyName) {
		super();
		this.courseName = courseName;
		this.FacultyName = facultyName;
	}

	public CourseEntity(int iD, String courseName, String courseDescription, int courseDuration, String facultyName) {
		super();
		this.ID = iD;
		this.courseName = courseName;
		this.CourseDescription = courseDescription;
		this.CourseDuration = courseDuration;
		this.FacultyName = facultyName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return CourseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		CourseDescription = courseDescription;
	}

	public int getCourseDuration() {
		return CourseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		CourseDuration = courseDuration;
	}

	public String getFacultyName() {
		return FacultyName;
	}

	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}

	@Override
	public String toString() {
		return "CourseEntity [ID=" + ID + ", courseName=" + courseName + ", CourseDescription=" + CourseDescription
				+ ", CourseDuration=" + CourseDuration + ", FacultyName=" + FacultyName + "]";
	}

}
