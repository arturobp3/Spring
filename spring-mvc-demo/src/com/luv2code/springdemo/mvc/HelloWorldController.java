package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//Metodo para mostrar el formulario HTML inicial
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//Metodo para procesar el formulario HTML
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//Metodo para leer datos del formulario y añadirlos al Modelo
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//Leemos el parametro request del formulario HTML
		String name = request.getParameter("studentName");
			//(Buscar diferencia con getAttribute)
		
		//Convertimos todos los datos a mayusculas
		name = name.toUpperCase();
		
		//Creamos el mensaje
		String resultado = "Hey, " + name;
		
		//Añadimos el mensaje al modelo
		model.addAttribute("mensaje", resultado);
		
		return "helloworld";
	}
}
