package com.fjpu.apphellowebpost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author fpere
 *
 */
@Controller
public class MessageController {
	
	/**
	 * @Getmmaping("/")
	 * Esta es la petición por defecto. Devuelve una plantilla index con un enlace
	 * al formulario
	 */
	@GetMapping("/")
	public String greetingForm() {
				
		return "index";
	}
	
	/**
	 * @GetMapping("/message")
	 * Petición GET: que muestra el formulario.  A través de model se le pasa una instancia de la clase
	 * Message, nos permite asociar los campos de un formulario a un objeto, de tal manera que al recibir los datos
	 * tratamos la información del formulario como una instancia de Message.  Al final se muestra la plantilla del
	 * formulario.
	 */
	@GetMapping("/message")
	public String greetingForm(Model model) {
		Message message = new Message();
		message.setContent("Put someting here...");
		model.addAttribute("message", message);
		return "messageForm";
	}
	
	/** 
	 * @PostMapping(/message")
	 * Petición POST: en este método se reciben los valores del formulario cargados en la instancia Message
	 * Esto permite validación, internacionalización, etc.  Finalmente, se carga la plantilla pasándole la instancia
	 * Message para mostrar los valores que se introdujeron en el formulario.
	 * */
	@PostMapping("/message")
	public String greetingSubmit(@ModelAttribute Message greeting) {
		
		return "postResult";
	}
	
	

}
