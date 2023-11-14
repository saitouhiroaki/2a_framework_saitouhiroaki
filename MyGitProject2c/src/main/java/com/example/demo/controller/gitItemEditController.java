package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {
	
	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String itemedit() {

		return "gititemedit";
	}

	@RequestMapping(path = "/gititemedit", method = RequestMethod.POST)
	public String tenthPostUpdate(Model model, String item_name, String item_price) {
	    
		System.out.println(item_name);
		System.out.println(item_price);
		model.addAttribute("name", item_name);
	    model.addAttribute("price", item_price);
	    return "itemeditkekka";
	}

	
		
		@RequestMapping(path = "/itemeditkekka", method = RequestMethod.GET)
		public String itemeditkekka() {

			return "itemeditkekka";
		}

}
