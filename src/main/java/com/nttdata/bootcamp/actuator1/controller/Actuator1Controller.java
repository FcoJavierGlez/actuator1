package com.nttdata.bootcamp.actuator1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Actuator1Controller {
	
	@GetMapping("/saludo")
	public String getSaludo() {
		return "Hola";
	}
	
	@GetMapping("/config/profile")
	public String getConfig() {
		return "Esta es la configuración del perfil";
	}

}
