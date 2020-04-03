package net.robles.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String mostrarHome(Model model) {
		model.addAttribute("mensaje", "Bienvenidos a la pagina de maquillaje de Vanessa");
		model.addAttribute("fecha", new Date());
		return "home";
	}
	
	

}
