package study.jparest.controllers;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.Course;
import study.jparest.entity.Student;
import study.jparest.repositary.CourseRepo;

@RestController
public class ManyToManyController{
	
	@Autowired
	CourseRepo  repo;
	
	@PostMapping("/addcourse")
	public void add()
	{
		
		Course c = new Course();
		c.setCourseName("DBT MONGO");
		c.setCourseDesc(" NO SQL prog");
		c.setCourseDuration(50);
		
		Set<Student> set = new HashSet<Student>();
		
		Student s = new Student();
		s.setStudName("PPP");
		s.setEmail("p@12");
		set.add(s);
		
		Student s1 = new Student();
		s1.setStudName("QQQ");
		s1.setEmail("q@12");		
		set.add(s1);
		
		
		Student s2 = new Student();
		s2.setStudName("DDD");
		s2.setEmail("d@12");
		set.add(s2);
		
//		Student s3 = new Student();
//		s3.setStudId(22);
//		s3.setStudName("TTT");
//		s3.setEmail("TTTT@12");
//		
//		set.add(s3);
		
		c.setStudents(set);
		
		
		Course savedCourse =repo.save(c);
		savedCourse.setStudents(set);
		
		repo.save(savedCourse);
		
		
		
	}
	
	@GetMapping("/showcourses")
	public String get()
	{
		Course c = repo.findById(22).get();
		
		String names="";
		for(Student s : c.getStudents())
		{
			names+=s.getStudName()+" ";
		}
		
		return c.getCourseName() + "  students :"+names;
	}
	
	
	

}
