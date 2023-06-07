package demo.demo;

import org.apache.coyote.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
			return"Simple";
		 }

		@GetMapping(path = "/students/{student_id}")
		 @ResponseBody
		 public String getGrade(@PathVariable("student_id")String studentId ){
			return "student id is " + studentId;
		 }

		 @GetMapping(path = "/students2/{student_id}")
		 @ResponseBody
		 public String getGrade2(@PathVariable("student_id")String studentId,
		 @RequestParam("semester") String semester){
			return "student id is " + studentId + "request params semester =" +semester;}

			@GetMapping(path = "/students3/{student_id}")
		 @ResponseBody
		 public ResponseEntity<String> getGrade3(@PathVariable("student_id")String studentId,
		 @RequestParam("semester") String semester){
			return new ResponseEntity<String>(studentId+"has got an A.", HttpStatus.OK);}

		 @PostMapping("/testPost")
		 @ResponseBody
		 String testPost(){
			return "testPost";
			
		 }

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		 }
		 }