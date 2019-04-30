package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; //Devuelve el nombre de la vista. Esto se encadenar� con la configuraci�n
							//Establecida en el xml
	}
	
}
