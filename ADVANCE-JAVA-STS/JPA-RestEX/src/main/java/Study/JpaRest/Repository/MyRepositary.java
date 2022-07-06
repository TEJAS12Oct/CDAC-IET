package Study.JpaRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Study.JpaRest.Entity.ProductEntity;

@Repository
public interface MyRepositary extends JpaRepository<ProductEntity, Integer> {

}
