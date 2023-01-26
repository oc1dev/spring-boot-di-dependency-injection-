package navarro.oc1.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import navarro.oc1.di.app.models.services.MiServicio;

@Controller
public class IndexController {
	
	@Autowired
	private MiServicio servicio;
	
	@GetMapping({"/","","/index"})
	public String index (Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
}
