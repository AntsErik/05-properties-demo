package ee.praktika.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//expose a slash endpoint that will return "Hello World!"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
	//adding a new mapping to test DevTools.
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5 K";
	}
	
	//adding a second endpoint for testing - fortune
	@GetMapping("/fortune")
	public String getFortune() {
		return "Today is allrighty!";
	}
	
	

}
	