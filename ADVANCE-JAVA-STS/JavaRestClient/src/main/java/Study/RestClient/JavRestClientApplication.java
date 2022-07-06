package Study.RestClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class JavRestClientApplication {

	public static void main(String[] args) {
		// SpringApplication.run(JavRestClientApplication.class, args);

		RestTemplate rs = new RestTemplate();

		String url = "http://localhost:8080/primary/Get";
		String responsevalue = rs.getForObject(url, String.class);
		System.out.println("The Rest API sent This : " + responsevalue);

//		url = "http://localhost:8080/primary/Post";
//		String responsevalue1 = rs.postForObject(url, null, String.class);
//		System.out.println("The Post Result is : " + responsevalue1);

//		ResponseEntity RE = rs.getForEntity("http://localhost:8080/primary/helloRE", String.class);
//		System.out.println(RE.getBody() + "  " + RE.getStatusCodeValue());

//		rs.put("http://localhost:8080/primary/Put", null);

//		rs.delete("http://localhost:8080/primary/Delete");
	}

}
