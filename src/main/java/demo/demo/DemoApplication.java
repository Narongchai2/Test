package demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class DemoApplication {

	
		@RequestMapping("/simple")
		@ResponseBody
		 String home(){
			return "Hello World!";
		 }
		@RequestMapping("/test")
		@ResponseBody
	
		 
		 String test(){
			return"test";
		 }

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}