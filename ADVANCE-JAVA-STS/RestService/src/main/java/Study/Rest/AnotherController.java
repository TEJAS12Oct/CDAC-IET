package Study.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="/another")
public class AnotherController {

	@GetMapping("/Get")
	public String f1() {

		return "hi From Another GET";
	}

}
// http://localhost:8080/another/Get => In Postman =>Select GET