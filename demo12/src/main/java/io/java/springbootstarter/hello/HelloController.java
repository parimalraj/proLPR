package io.java.springbootstarter.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("api/hello")
	@CrossOrigin(origins="http://localhost:4200")
	public String[] sayHi() {
		return new String[] {"Hi, This is SpringBoot"};
	}
			
}
