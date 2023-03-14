package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication	//Haz tu magia, spring
@RestController	//Contiene un controlador Rest la clase (Se prepara para recibir peticiones HTTP)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping("/")	//La / es cuando no tenga nada escrito
	String hello(){
		return "Hello World!";
	}

	@RequestMapping("/hola")	//La / es cuando no tenga nada escrito
	String hola(){
		return "¡Hola Mundo!";
	}

	@RequestMapping("/mimedicacion")	//La / es cuando no tenga nada escrito
	String mimedicacion(){
		return "¡Tómate las pastillas!";
	}


}
