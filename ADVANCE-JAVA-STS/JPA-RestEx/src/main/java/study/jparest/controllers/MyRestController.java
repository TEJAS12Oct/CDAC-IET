package study.jparest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.ProductEntity;
import study.jparest.repositary.MyRepositary;

@RestController
@RequestMapping(path="/jpaex")
public class MyRestController {

	@Autowired
	MyRepositary repo;
	
	@PostMapping("/add/{id}/{name}/{cost}")
	public String insertProduct(@PathVariable int id,@PathVariable String name,@PathVariable int cost)
	{
		ProductEntity obj = new ProductEntity(id,name,cost);
		repo.save(obj);
		//repo.save(obj);
		/*
		 * Optional<ProductEntity> obj2 = repo.findById(1); if(obj2.isPresent()) {
		 * ProductEntity p = obj2.get(); //...process it here }
		 */
		return "insert done";
	}

	
	@GetMapping("/getproduct/{id}")
	public ProductEntity f2(@PathVariable int id)
	{
		Optional<ProductEntity> opt = repo.findById(id);
		return opt.get();
		

	}
	
	@GetMapping("/getproductbyname/{name}")
	public List<ProductEntity> f3(@PathVariable String name)
	{
		List<ProductEntity> list = repo.findByName(name);
		return list;
		

	}
	
	@GetMapping("/getproductbycost/{cost}")
	public List<ProductEntity> f3(@PathVariable int cost)
	{
		//List<ProductEntity> list = repo.findByCost(cost);
		List<ProductEntity> list = repo.findLessThanCost(cost);
		return list;
		

	}
	
}





