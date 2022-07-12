package study.jparest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
