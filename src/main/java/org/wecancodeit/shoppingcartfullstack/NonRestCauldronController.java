package org.wecancodeit.shoppingcartfullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NonRestCauldronController {
	
	@Resource
	private CartRepository cartRepo;
	
	@Resource
	private PotionRepository potionRepo;
	
	@RequestMapping("/potionsList")
	public String getAllPotions(Model model) {
		model.addAttribute("potionsModel", potionRepo.findAll());		
		
		return "index";
	}
	
	
}
