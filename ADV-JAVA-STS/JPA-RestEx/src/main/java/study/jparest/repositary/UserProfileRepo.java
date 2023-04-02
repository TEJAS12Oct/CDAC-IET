package study.jparest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.UserProfile;

@Repository
public interface UserProfileRepo extends JpaRepository<UserProfile, Integer> {

}
