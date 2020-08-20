package Service;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import Model.UserDetail;

public interface UserService {
	
	public int saveUser(UserDetail userDetail);
	
	public UserDetail getUserDetail(int userId);
	
	public int store(MultipartFile file, int userID ,  HttpSession session);
	
	

}
