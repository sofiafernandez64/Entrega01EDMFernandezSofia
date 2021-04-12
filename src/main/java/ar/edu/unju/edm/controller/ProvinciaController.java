package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;

@Controller
public class ProvinciaController {
	
	@Autowired
	Provincia unaProvincia;
	
	
	@GetMapping({"/provincia"})
	
	public String cargarProvincia(Model model) {
		//Provincia unaProvincia = new Provincia();
		
		unaProvincia.setNombre("Catamarca Argentina");
		
		model.addAttribute("prov", unaProvincia);
		return "provincia";
	}
	
}
