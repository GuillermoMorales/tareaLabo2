package com.uca.capas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;
@Controller
public class MainController {
	@GetMapping("/login")
	public String enviarForm(Usuario usuario)
	{
		return "Login";
	}
	@PostMapping("/validacion")
	public  String procesarForm(Usuario usuario)
	{
		String username = usuario.getNombre();
		String password = usuario.getPass();
		
		if("admin".equals(username) && "admin".equals(password))
		{
			return "MostrarMensajeV";
		}
		
		return "MostrarMensajeF";
		
	}
}
