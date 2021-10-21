package com.nttdata.bootcamp.actuator1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Actuator1Controller {
	
	@GetMapping("/saludo")
	public String getSaludo() {
		return "Hola";
	}
	
	@GetMapping("/usuario/{id}")
	public String getUser( @PathVariable final int id ) {
		return "Usuario: inventado";
	}
	
	@PostMapping("/usuario")
	public boolean addUser( @RequestBody String user ) {
		return true;
	}
	
	@GetMapping("/status")
	public boolean getStatus() {
		return true;
	}
	
	@GetMapping("/test/speed/{value}")
	public double getTestSpeed( @PathVariable final int value ) {
		return value * 1.05;
	}
	
	@GetMapping("/config/profile")
	public String getConfig() {
		return "Esta es la configuración del perfil";
	}

}
