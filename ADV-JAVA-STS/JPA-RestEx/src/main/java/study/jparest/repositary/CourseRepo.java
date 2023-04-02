package study.jparest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

}
