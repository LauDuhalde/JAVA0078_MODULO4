package ae7;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora calc;
	@BeforeEach
	public void setUp() {
		calc = new Calculadora();
	}
	
	@Test
	void testSuma() {
		assertEquals(5,calc.sumar(3, 2));
		assertEquals(-2, calc.sumar(1, -3),"El resultado debe ser -2");
	}
	
	@Test
	void testDividir() {
		assertEquals(2,calc.dividir(4, 2));
		assertThrows(ArithmeticException.class, () -> calc.dividir(4, 0));
	}

}
