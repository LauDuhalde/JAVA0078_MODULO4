package ae7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ae6.herencia.clases.Vehiculo;

class VehiculoTest {

	@Test
	void testMostrarDetalles() {
		//fail("Not yet implemented");
		Vehiculo vehiculo = new Vehiculo();
		assertEquals("Vehiculo [marca=null, año=0]",vehiculo.toString());
	}
	
	@Test
	void testMostrarDetalles2() {
		//fail("Not yet implemented");
		Vehiculo vehiculo = new Vehiculo("Nissan",2024);
		assertEquals("Vehiculo [marca=Nissan, año=2024]",vehiculo.toString());
	}
	
	@Test
	void testMostrarDetalles3() {
		//fail("Not yet implemented");
		Vehiculo vehiculo = new Vehiculo("Nissan",2024);
		assertEquals(2024,vehiculo.getAnio());
	}
	

}
