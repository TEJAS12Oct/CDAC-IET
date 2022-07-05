package Study.Rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/primary")
public class MyRestController {

	@GetMapping("/Get")
	public String f1() {

		return "hi From GET";
	}
//	http://localhost:8080/primary/Get => In Postman => select GET

	@PostMapping("/Post")
	public String F2() {
		return "hi From Post";
	}
//	http://localhost:8080/primary/Post => In Postman => select Post

	@PutMapping("/Put")
	public String F3() {
		return "hi From Put";
	}
//	http://localhost:8080/primary/Put => In Postman => select PUT

	@DeleteMapping("/Delete")
	public String F4() {
		return "hi From Delete";
	}
//	http://localhost:8080/primary/Delete => In Postman => select Delete

	@PutMapping("/Square")
	public int F5(@RequestParam int num) {

		return num * num;
	}
// http://localhost:8080/primary/Square?num=3 => In Postman => select PUT

	@PostMapping("sum/{n1}/{n2}/{n3}")
	public int F6(@PathVariable("n1") int x, @PathVariable("n2") int y, @PathVariable("n3") int z) {
		return x + y + z;
	}
// http://localhost:8080/primary/sum/10/20/30=> In Postman => select Post

	@GetMapping("/Welcome")
	public String F7(@RequestBody User U) {
		return "welcome  " + U.getUname() + " from " + U.getCity();
	}
// http://localhost:8080/primary/welcome => In Postman => select get
	
	@GetMapping("/User")
	public User f9(@RequestBody User u) {

		User u1=new User();
		u1.setUname("Ganesh");
		return u1;
	}
// http://localhost:8080/primary/User => In Postman => select get
	
	@GetMapping("/getUser1")
	public java.util.ArrayList<User>  f9()
	{
		java.util.ArrayList<User> al =new java.util.ArrayList<User>();
	
		User u1=new User();
		u1.setUname("Mayur");
		u1.setCity("BARAMATI");
		User u2=new User();
		u2.setUname("Sayali");
		u2.setCity("Nashik");
				al.add(u1);
				al.add(u2);
		return al;
	}
// http://localhost:8080/primary/getUser1 => In Postman => select get
	
}
