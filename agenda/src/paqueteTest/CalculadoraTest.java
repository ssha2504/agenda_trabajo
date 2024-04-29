package paqueteTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	/*@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	void testSuma() {
		
		Calculadora calculadora = new Calculadora(20,10);
		int result = calculadora.Suma();
		assertEquals(30, result);
	}

	@Test
	void testResta() {
		
		Calculadora calculadora = new Calculadora(20,10);
		int result = calculadora.Resta();
		assertEquals(30, result);
	}

	@Test
	void testMulti() {
		
		Calculadora calculadora = new Calculadora(20,10);
		int result = calculadora.Multi();
		assertEquals(30, result);
	}

	@Test
	void testDivi() {
		
		Calculadora calculadora = new Calculadora(20,10);
		int result = calculadora.Divi();
		assertEquals(30, result);
	}

}
