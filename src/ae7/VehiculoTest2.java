package ae7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ae6.herencia.clases.Vehiculo;

class VehiculoTest2 {
	private Vehiculo vehiculo;
	@BeforeEach
	public void setUp(){
		vehiculo = new Vehiculo("Nissan",2024);
	}

	@Test
	void testToString() {
		assertEquals("Vehiculo [marca=Nissan, año=2024]",vehiculo.toString());
	}
	
	@Test
	void testGetAnio() {
		assertEquals(2024,vehiculo.getAnio());
	}

}
