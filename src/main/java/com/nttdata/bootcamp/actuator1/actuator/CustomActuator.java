package com.nttdata.bootcamp.actuator1.actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "custom")
public class CustomActuator {
	
	@GetMapping("/pruebacustom")
	public int getPrueba() {
		return 10;
	}
	
	@GetMapping("/cpu/heat")
	public double getCpuHeat() {
		return 62.1;
	}
	
	@GetMapping("/ram/use")
	public Long getRamUse() {
		return 4274254621L;
	}
	
}
