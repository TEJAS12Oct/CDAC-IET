package Study.JpaRest.Controllers;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import Study.JpaRest.Entity.CourseEntity;
import Study.JpaRest.Repository.MyRepository;

@RestController
@RequestMapping(path = "/jpaex")
public class MyRestController {

	@Autowired
	MyRepository repo;

// http://localhost:8080/jpaex/show
	@GetMapping("/show")
	public List<CourseEntity> ShowCourse() {
		CourseEntity obj = new CourseEntity();
		List<CourseEntity> list = repo.findAll();
		return list;

	}

// http://localhost:8080/jpaex/change/PGDAC/RAM  =>Put Course  Name is Already Present
	@PutMapping("/change/{courseName}/{facultyName}")
	public ResponseEntity<List<CourseEntity>> change(@PathVariable String courseName,
			@PathVariable String facultyName) {
		List<CourseEntity> list = repo.findByCourseName(courseName);
		for (CourseEntity c : list) {
			c.setFacultyName(facultyName);
		}
		repo.saveAll(list);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

// http://localhost:8080/jpaex/add => write in body
	@PostMapping("/add")
	public String AddCourse(@RequestBody CourseEntity CE) {
		CourseEntity obj = new CourseEntity(CE.getID(), CE.getCourseName(), CE.getCourseDescription(),
				CE.getCourseDuration(), CE.getFacultyName());
		repo.save(obj);
		return "Insert Done";

	}

//	{
//    "id":"1",
//    "courseName":"DBDA",
//    "courseDescription":"C-DAC",
//    "courseDuration":"3",
//    "facultyName":"Santosh"
//}

//	http://localhost:8080/jpaex/delete/3
	@DeleteMapping("/delete/{id}")
	public String DeleteCourse(@PathVariable int id) {
		CourseEntity obj = new CourseEntity(id);
		repo.delete(obj);
		return "Delete Done ";

	}

}
