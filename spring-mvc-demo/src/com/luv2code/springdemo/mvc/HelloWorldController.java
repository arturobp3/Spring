package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	//Metodo para leer datos del formulario y a�adirlos al Modelo
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//Leemos el parametro request del formulario HTML
		String name = request.getParameter("studentName");
		
		//Convertimos todos los datos a mayusculas
		name = name.toUpperCase();
		
		//Creamos el mensaje
		String resultado = "Hey, " + name;
		
		//A�adimos el mensaje al modelo
		model.addAttribute("mensaje", resultado);
		
		
		return "helloworld";
	}
	
	//Metodo para leer los datos del formulario utilizando la anotiacion RequestParam
	//Esta anotaci�n realiza lo mismo que getParameter arriba, pero por parametro
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String name, Model model) {
		
		
		//Convertimos todos los datos a mayusculas
		name = name.toUpperCase();
		
		//Creamos el mensaje
		String resultado = "Hey my friend! v3 " + name;
		
		//A�adimos el mensaje al modelo
		model.addAttribute("mensaje", resultado);
		
		
		return "helloworld";
	}
}
