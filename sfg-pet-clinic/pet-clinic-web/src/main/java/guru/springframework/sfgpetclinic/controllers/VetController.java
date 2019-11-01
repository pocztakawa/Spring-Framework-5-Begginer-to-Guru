package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/vets" })
public class VetController {

	@RequestMapping({ "", "/", "/listVets", "/listVets.html" })
	public String listVets() {
		return "vets/index";
	}

}