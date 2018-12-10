package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import pojo.User;
import service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login22.action")
	public String login0(ModelMap map){
		map.addAttribute("userid", "123");
		return "/List";
	}
	
	@RequestMapping("/login.action")
	public String login(String username){
		String name = userService.queryNameById(1);
		System.out.println(name);
		return "/List";
	}
	
	@RequestMapping("/update.action")
	public @ResponseBody String update(String username,HttpServletResponse resp){
		resp.setContentType("application/json;charset=utf8");
		return "{'result':'success'}";
	}
	@RequestMapping("/query.action")
	public @ResponseBody List<User> query(HttpServletResponse resp){
		resp.setContentType("application/json;charset=utf8");
		List<User> users = new ArrayList<User>();
		users.add(new User("111"));
		users.add(new User("xiaoming"));
		return users;
	}
	@RequestMapping("/query2.action")
	public @ResponseBody User query2( ){
		
		return new User("xiaoming");
	}
}
