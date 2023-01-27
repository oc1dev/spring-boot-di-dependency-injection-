package navarro.oc1.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import navarro.oc1.di.app.models.services.IServicio;

@Controller
public class IndexController {
	
	@Autowired //asi inyectariamos en el atributo
	private IServicio servicio;
	
	
	/*@Autowired //inyectando en el constructor
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/



	@GetMapping({"/","","/index"})
	public String index (Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	
	//inyectando en metodo setter
	/*@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
}
