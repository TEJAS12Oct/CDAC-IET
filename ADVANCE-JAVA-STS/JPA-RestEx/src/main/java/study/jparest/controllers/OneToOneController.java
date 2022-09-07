package study.jparest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.User;
import study.jparest.entity.UserProfile;
import study.jparest.repositary.UserProfileRepo;
import study.jparest.repositary.UserRepo;

@RestController
public class OneToOneController {

	@Autowired
	UserProfileRepo repo;
	
	@Autowired
	UserRepo  urepo;
	
	@PostMapping("/add/{uname}/{pass}/{fn}/{ln}")
	public void add(@PathVariable String uname,@PathVariable String pass
					,@PathVariable String fn,@PathVariable String ln)
	{
		UserProfile up = new UserProfile();
		up.setFirstName(fn);
		up.setLastName(ln);
		up.setEmail("Tejas@123");
		
		User u = new User();
		u.setPassword(pass);
		u.setUserName(uname);
		
		System.out.println("Before saving "+u.getUserId());
		
		User savedUser = urepo.save(u);
		
		System.out.println("After saving "+savedUser.getUserId());
		
		up.setUser(savedUser);
		
		repo.save(up);
	}
	
	@PostMapping("/add2/{uname}/{pass}/{fn}/{ln}")
	public void add2(@PathVariable String uname,@PathVariable String pass
					,@PathVariable String fn,@PathVariable String ln)
	{
		UserProfile up = new UserProfile();
		up.setFirstName(fn);
		up.setLastName(ln);
		up.setEmail("TEJAS@12345");
		
		User u = new User();
		u.setPassword(pass);
		u.setUserName(uname);
		up.setUser(u);
		u.setProfile(up);
		
		User savedUser = urepo.save(u);
	
	}
	
	
	@DeleteMapping("/rem/{id}")
	public void removeUser(@PathVariable int id)
	{
		User u = urepo.findById(id).get();
		System.out.println("AFter fetching User --"+u.getUserName()+"  profile:"+u.getProfile().getFirstName());
		urepo.delete(u);
	}
	
	
	
	
	
	
	
	
	
	
}
