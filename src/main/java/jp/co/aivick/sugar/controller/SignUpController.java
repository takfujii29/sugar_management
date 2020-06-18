package jp.co.aivick.sugar.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.aivick.sugar.entity.User;
import jp.co.aivick.sugar.form.UserForm;
import jp.co.aivick.sugar.service.UserService;

@Controller
@RequestMapping("/signup")
public class SignUpController {
	@Autowired
	UserService userService;
	
	@GetMapping
	public String showSignup(Model model) {
		model.addAttribute("userForm", new UserForm());
		return "signup/index.html";
	}
	
	@PostMapping
	public String register(@Validated UserForm userForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "signup/index.html";
		}
		
		User user = new User();
		user.setPassword(userForm.getPassword());
		user.setLoginId(userForm.getLoginId());
		user.setName(userForm.getName());
		user.setEmail(userForm.getEmail());
		user.setRole("USER");
		userService.create(user);
		
		return "redirect:/home.html";
	}
	
}
