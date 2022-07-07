package jumbo.mumbo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.Holiday;


@Repository
public interface AnotherRepo extends JpaRepository<Holiday, Integer> {

}
