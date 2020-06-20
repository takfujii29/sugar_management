package jp.co.aivick.sugar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.aivick.sugar.entity.User;
import jp.co.aivick.sugar.entity.UserProductJoin;
import jp.co.aivick.sugar.service.UserProductJoinService;
import jp.co.aivick.sugar.service.UserService;

@Controller
@RequestMapping("/user_product")
public class UserProductController {
	
	@Autowired
	UserProductJoinService userProductJoinService;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public String index(Model model, @AuthenticationPrincipal UserDetails userDetails) {
		User user = userService.findByLoginId(userDetails.getUsername());
		List<UserProductJoin> userProducts = userProductJoinService.findAllwhereUser(user.getUserId());
		model.addAttribute("userProducts", userProducts);
		return "user_product/list.html";
	}
}
