package study.jparest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.User1;

@Repository
public interface UserRepo extends JpaRepository<User1, Integer> {

}
