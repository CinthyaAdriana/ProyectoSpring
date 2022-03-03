package com.generation.SpringSecurityJWT;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SpringSecurityJWTTests {

	@Test
	void contextLoads() {
	}

	@Test
	void pruebaMetodoSuma() {
		//inatanciamos la clase para poder usar el metodo
		SpringSecurityJWT metodoSuma = new SpringSecurityJWT(); 
		int prueba = metodoSuma.suma(); 
		
		assertEquals(15, prueba);
	
	}
	
}
