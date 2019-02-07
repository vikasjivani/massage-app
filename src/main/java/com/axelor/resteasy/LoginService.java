package com.axelor.resteasy;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.axelor.pojo.Leave;
import com.axelor.pojo.User;
import com.axelor.service.Login;
import com.axelor.service.UserService;

@Path("login")
public class LoginService {

	@PUT
	@Path("userlogin")
	@Produces(MediaType.TEXT_PLAIN)
	public String login(User user) {
		boolean result = Login.ckeckLogin(user.getEmail(), user.getPassword());
		System.out.println(result);
		if(result) {
			return "login sucess !!!..."+user.getEmail();
		}
		return "invalid Email or Password";
	}
	
	
	@GET
	@Path("getalluser")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUser(){
		UserService user = new UserService();
		return user.getAllUser();
	}
}
