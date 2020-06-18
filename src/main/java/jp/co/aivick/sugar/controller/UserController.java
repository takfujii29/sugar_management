package jp.co.aivick.sugar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.aivick.sugar.entity.User;
import jp.co.aivick.sugar.service.UserService;

@Controller
@RequestMapping("/admin/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		
		return "admin/users/list.html";
	}
}
