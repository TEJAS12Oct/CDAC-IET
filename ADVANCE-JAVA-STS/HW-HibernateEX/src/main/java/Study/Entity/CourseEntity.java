package Study.Entity;

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
	private String CourseName;

	@Column(name = "Course_Desc")
	private String CourseDescription;

	@Column(name = "Course_Duration")
	private int CourseDuration;

	@Column(name = "Faculty_Name")
	private String FacultyName;

	public CourseEntity() {
	}

	public CourseEntity(int iD, String courseName, String courseDescription, int courseDuration, String facultyName) {
		ID = iD;
		CourseName = courseName;
		CourseDescription = courseDescription;
		CourseDuration = courseDuration;
		FacultyName = facultyName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
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
		return "CourseEntity [ID=" + ID + ", CourseName=" + CourseName + ", CourseDescription=" + CourseDescription
				+ ", CourseDuration=" + CourseDuration + ", FacultyName=" + FacultyName + "]";
	}

}
