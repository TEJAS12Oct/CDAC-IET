package Study.Rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/math")
public class MyRestController {

	@GetMapping("/factorial")
	public int F1(@RequestParam int num) {

		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;
	}
// http://localhost:8080/math/factorial?num=7  => In PostMan => Select Get Method	
	
	@GetMapping("/table/{num}/{from}/{to}")
	public ArrayList F2(@PathVariable int num, @PathVariable int from, @PathVariable int to) {
		ArrayList al = new ArrayList();

		for (int i = from; i <= to; i++) {
			al.add(num * i);
		}

		return al;
	}
// http://localhost:8080/math/table/2/1/5  => In PostMan => Select Get Method
	
	@GetMapping("/prime/{num}")
	public String F3(@PathVariable int num) {

		int i, c = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				c++;
			}
		}

		if (c == 2) {
			return num + " Is Prime No";
		} else
			return num + " Is Not Prime No";

	}
// http://localhost:8080/math/prime/21  => In PostMan => Select Get Method	
}
