package Study.JpaRest.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Study.JpaRest.Entity.UserEntity;

@Repository
public interface MyRepositoryUser extends JpaRepository<UserEntity, String> {

	List<UserEntity> findBypass(String pass);

}
