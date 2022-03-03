package com.generation.SpringSecurityJWT;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; 
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


public class PostControllerTest {

	@Test
	@DisplayName("Probando Mockito")
	void pruebaMockiyo() {
		//creacion del Mock (objeto falso o de burla) 
	
		List<String>listaFalsa = mock(List.class); 
		
		//usar el objeto 
		listaFalsa.add("Uno");
		listaFalsa.clear(); 
		
		//Verificar el uso de los metodos 
		verify(listaFalsa).add("Uno");
		verify(listaFalsa).clear(); 
		
	}
	@Test
	@DisplayName("Provando Mockito version 2")
	void pruebaMockitov2() {
		//crear un objeto simulado 
		List<String> listaFalsa = mock(List.class); 
		
		//Whem & thenReturn 
		//Estos elementos nos permiten fijar valores y resultados esperados 
		when(listaFalsa.get(0)).thenReturn("Hola Mundo"); 
		
		String resultado = listaFalsa.get(0);
		
	    //System.out.println(resultado); 
		
		verify(listaFalsa).get(0);
		
		//Prueba JUnit
		assertEquals("Hola Mundo", resultado);
	}
	
}
