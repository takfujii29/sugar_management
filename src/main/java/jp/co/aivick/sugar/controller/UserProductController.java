package jp.co.aivick.sugar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.aivick.sugar.entity.Product;
import jp.co.aivick.sugar.entity.User;
import jp.co.aivick.sugar.entity.UserProduct;
import jp.co.aivick.sugar.entity.UserProductJoin;
import jp.co.aivick.sugar.form.UserProductForm;
import jp.co.aivick.sugar.service.UserProductJoinService;
import jp.co.aivick.sugar.service.UserProductService;
import jp.co.aivick.sugar.service.UserService;
import jp.co.aivick.sugar.service.ProductService;

@Controller
@RequestMapping("/user_product")
public class UserProductController {

	@Autowired
	UserProductJoinService userProductJoinService;

	@Autowired
	UserService userService;

	@Autowired
	ProductService productService;

	@Autowired
	UserProductService userProductService;

	private Map<Integer, String> getSelectedProducts() {
		List<Product> productList = productService.findAll();
		return productList.stream().collect(
				Collectors.toMap(Product::getProductId, Product::getName));
	}

	@GetMapping("/list")
	public String index(Model model, @AuthenticationPrincipal UserDetails userDetails) {
		User user = userService.findByLoginId(userDetails.getUsername());
		List<UserProductJoin> userProducts = userProductJoinService.findAllwhereUser(user.getUserId());
		model.addAttribute("userProducts", userProducts);
		return "user_product/list.html";
	}

	@GetMapping("/create")
	public String showCreate(Model model) {

		model.addAttribute("userProductForm", new UserProductForm());
		model.addAttribute("selectedProducts", getSelectedProducts());

		return "/user_product/create.html";
	}

	@PostMapping("/create")
	public String create(@Validated UserProductForm userProductForm, BindingResult bindingResult,
			@AuthenticationPrincipal UserDetails userDetails, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("selectedProducts", getSelectedProducts());
			return "/user_product/create.html";
		}

		User user = userService.findByLoginId(userDetails.getUsername());
		UserProduct userProduct = new UserProduct();
		userProduct.setUserId(user.getUserId());
		userProduct.setProductId(userProductForm.getProductId());
		userProduct.setAmount(userProductForm.getAmount());
		userProduct.setDate(userProductForm.getDate());
		userProductService.create(userProduct);

		return "redirect:/user_product/create";
	}
}
