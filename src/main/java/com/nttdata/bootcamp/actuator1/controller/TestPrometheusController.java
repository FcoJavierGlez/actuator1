package com.nttdata.bootcamp.actuator1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class TestPrometheusController {
	
	private Counter counter;

	public TestPrometheusController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
	}
	
	@GetMapping(path = "helloworld")
	public String helloWorld() {
		counter.increment();
		return "Hello world";
	}

}
