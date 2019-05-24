package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add an initbinder... to convert trim input strings
	//remove leading and trailing whitespace
	//convert issue for our validation
	
	@InitBinder
	//Esta funcion preprocesa todas las peticiones que lleguen a este controlador
	//y elimina los espacios en blanco iniciales y finales. Si el string es solo un espacio en blanco
	//lo convierte en null
	public void initBinder(WebDataBinder dataBinder) {
		
		//This object removes whitespaces - leading and trailing
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			//Valida los datos que contiene el objeto theCustomer y vuelca el resultado
			//de la validación en theBindingResult
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult){
		
		System.out.println("Last name: |" + theCustomer.getLastName() + "|");
		if(theBindingResult.hasErrors()) { //Si se han encontrado errores volvemos al formulario
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
	}
	
	
}
