package Study.JpaRest.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Study.JpaRest.Entity.UserEntity;
import Study.JpaRest.Repository.MyRepositoryUser;

@RestController
@RequestMapping(path = "/jpa")
public class MyRestControllerUser {

	@Autowired
	MyRepositoryUser repo;

// http://localhost:8080/jpa/Login => write in body
//	{
//	"uname":"Tejas",
//	"pass":"1234"
//}
// check  in postman => status => 404=bad request , 200= ok
	@PostMapping("login")
	public ResponseEntity<Integer> loginUser(@RequestBody UserEntity u) {
		ResponseEntity<Integer> res = null;
		Optional<UserEntity> obj = repo.findById(u.getUname());
		if (obj.isPresent() && u.getPass().equals(obj.get().getPass())) {
			return new ResponseEntity(obj, HttpStatus.OK);

		} else {
			return new ResponseEntity(obj, HttpStatus.BAD_REQUEST);
		}

	}

//  http://localhost:8080/jpa/user
	@GetMapping(value = "/user")
	public String showUser() {
		ArrayList<String> a1 = new ArrayList<String>();
		List<UserEntity> obj = repo.findAll();
		String str = " ";
		for (UserEntity u1 : obj) {
			str += u1.getUname() + ",";
		}
		return str;
	}

// http://localhost:8080/jpa/change/1234/5678 =>change password all user
	@PutMapping("/change/{pass}/{newpass}")
	public ResponseEntity<List<UserEntity>> change(@PathVariable String pass, @PathVariable String newpass) {
		List<UserEntity> list = repo.findBypass(pass);
		for (UserEntity c : list) {
			c.setPass(newpass);
		}
		repo.saveAll(list);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

// http://localhost:8080/jpa/delete/Tejas/1234	
	@PostMapping("/delete/{uname}/{pass}")
	public String DeletePASS(@PathVariable String uname, @PathVariable String pass) {

		Optional<UserEntity> obj = repo.findById(uname);
		UserEntity e1 = obj.get();
		if (obj.isPresent() && pass.equals(e1.getPass()))
			repo.deleteById(uname);
		return "Delete Done";

	}

}
