package Study.JpaRest.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Study.JpaRest.Entity.CourseEntity;

@Repository
public interface MyRepository extends JpaRepository<CourseEntity, Integer> {
	
	List<CourseEntity> findByCourseName(String courseName);

}
