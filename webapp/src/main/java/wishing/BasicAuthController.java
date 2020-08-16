//package wishing;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import authenticate.AuthenticationBean;
//
//@CrossOrigin(origins="http://localhost:4200,http://localhost:8080")
//@RestController
//@RequestMapping(value="/api/v1")
//public class BasicAuthController {
//
//	
//	@GetMapping(path ="/basicauth")
//	@Autowired
//	public AuthenticationBean helloWorldBean() {
//		
//		HttpHeaders headers = new HttpHeaders();
//	    headers.add("Access-Control-Allow-Origin", "*");
//	    headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
//	    return new AuthenticationBean("You are authenticated");
//	    
//	}
//	
//	@Autowired
//	public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedOrigins("http://localhost:8080");
//    }
//	


    

	
