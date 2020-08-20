package Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Model.UserDetail;
import Service.UserService;

@RestController
@RequestMapping("/api")
//@CrossOrigin("https://profile-analyzer.herokuapp.com")
//@CrossOrigin(origins = "http://localhost:8080")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public int saveUser(@RequestBody UserDetail userDetail)
	{
		return userService.saveUser(userDetail);
	}
	
	@PostMapping("/uploadImage/{userId}")
	public int handleFileUpload(@PathVariable int userId , @RequestParam("file") MultipartFile file, HttpSession session) {
		return userService.store(file, userId, session);		
	}
	
}