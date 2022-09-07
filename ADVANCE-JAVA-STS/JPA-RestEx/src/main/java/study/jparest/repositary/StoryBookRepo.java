package study.jparest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.StoryBook;

@Repository
public interface StoryBookRepo extends JpaRepository<StoryBook, Integer> {

}
