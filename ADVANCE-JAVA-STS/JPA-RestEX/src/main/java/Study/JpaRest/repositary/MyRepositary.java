package study.jparest.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.jparest.entity.ProductEntity;

@Repository
public interface MyRepositary extends JpaRepository<ProductEntity, Integer> {

	public List<ProductEntity> findByName(String n);
	public List<ProductEntity> findByCost(int c);
	
	@Query(value = "from study.jparest.entity.ProductEntity p where p.cost < :cost")
	public List<ProductEntity>  findLessThanCost(@Param("cost") int cost);
		
}
