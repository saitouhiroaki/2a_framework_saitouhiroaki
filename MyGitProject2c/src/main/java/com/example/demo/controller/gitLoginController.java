package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class gitLoginController {
	
	//ログインページ
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String login() {
		return "gitlogin";
	}

	//ログインPOST
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String log(String id,String pass, RedirectAttributes redirectAttributes) {
	System.out.println(id+"     "+pass);
		if(  id.equals("idlogin") && "gitpw".equals(pass)) {
			System.out.println("ok");
			return "redirect:/gititemlist";
		}
		System.out.println("ダメ");
		return "redirect:/gitpralogin";
	}
		
}