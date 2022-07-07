package Study.JpaRest.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Study.JpaRest.Entity.ProductEntity;
import Study.JpaRest.Repository.MyRepositary;

@RestController
@RequestMapping(path = "/jpaex")
public class MyRestController {

	@Autowired
	MyRepositary repo;

	@PostMapping("/add/{id}/{name}/{cost}")
	public String insertProduct(@PathVariable int id, @PathVariable String name, @PathVariable int cost) {
		ProductEntity obj = new ProductEntity(id, name, cost);
		repo.save(obj);
//		repo.count();
//		repo.delete(obj);
//		repo.deleteAll();
//		repo.findAll();
		Optional<ProductEntity> obj2 = repo.findById(1);
		if (obj2.isPresent()) {
			ProductEntity p = obj2.get();
			// ........Process it Here
		}
		return "insert done";

	}

}

// tomcat start
// http://localhost:8080/jpaex/add/1/Cheese/60 => in PostMan