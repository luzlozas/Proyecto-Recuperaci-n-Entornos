package es.edix.ed.recuperacion;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClase {
	
	Clase name = new Clase();

	@Test
	void TestAlDarleASaludarUnNumero() {
		
		String esperado = "Lo que me mandas es un numero";
		String obtenido = name.saludar("20");
		
		
		assertEquals(esperado,obtenido,"Debería devolver Lo que me mandas es un número");
	}
	
	@Test
	void TestAlDarleASaludarUnString() {
		
		String esperado = "Hola Luz";
		String obtenido = name.saludar("Luz");
		
		assertEquals(esperado,obtenido,"Debería devolver Hola Luz");
		
	}
	
	@Test
	void TestAlDarleUnValorVacio() {
		
		String esperado = "Lo que me mandas está vacío";
		String obtenido = name.saludar("");
		
		assertEquals(esperado,obtenido,"Debería devolver el mensaje Lo que me mandas es un vacío");
	}
	
	@Test
	
	void TestAlDarleUnValorNuméricoYUnNombre() {
		
		String esperado = "Hola 12 Luz";
		String obtenido = name.saludar("12 Luz");
		
		assertEquals(esperado,obtenido,"Debería devolver Hola 12 Luz");
	}
	
	@Test
	
	void TestSuma() {
		
		int x = 1;
		int y = 2;
		String op = "sumar";
		int esperado = 3;
		
		assertEquals(esperado, name.matematicas(x, y, op), "Debería devolver un 3");
		
	}
	
	@Test
	
	void TestResta() {
		
		int x = 3;
		int y = 2;
		String op = "restar";
		int esperado = 1;
		
		assertEquals(esperado, name.matematicas(x, y, op), "Debería devolver un 1");
		
	}
	
	@Test
	
	void TestMultiplica() {
		
		int x = 3;
		int y = 2;
		String op = "multiplicar";
		int esperado = 6;
		
		assertEquals(esperado, name.matematicas(x, y, op), "Debería devolver un 6");
		
	}
	
	@Test
	
	void TestDivide() {
		
		int x = 8;
		int y = 4;
		String op = "dividir";
		int esperado = 2;
		
		assertEquals(esperado, name.matematicas(x, y, op), "Debería devolver un 2");
	
		
	}
	
	@Test
	
	void TestSiNoLeDamosLasOperacionesEsperadas() {
		
		int x = 8;
		int y = 4;
		String op = "hola";
		double esperado = 8.4;
		
		assertEquals(esperado, name.matematicas(x, y, op), "Debería devolver un 8.4");
		
	}
	
	@Test
	
	void TestSiEscribimosMalLaOperación() {
		
		int x = 10;
		int y = 2;
		String op = "sUMA";
		double esperado = 10.2;
		
		assertEquals(esperado, name.matematicas(x, y, op), "Debería devolver un 10.2");
		
	}
	
	
	
	
	
	

}
