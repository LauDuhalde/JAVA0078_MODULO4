package ae6.herencia;

import ae6.herencia.clases.Coche;
import ae6.herencia.clases.CocheElectrico;
import ae6.herencia.clases.Vehiculo;

public class Aplicacion {

	public static void main(String[] args) {
		//Instancia de clase
		Vehiculo vehiculo = new Vehiculo();
		System.out.println(vehiculo);
		
		vehiculo.setAnio(2025);
		vehiculo.setMarca("Nissan");
		System.out.println(vehiculo);
		
		Vehiculo vehiculo2 = new Vehiculo("Toyota",2026);
		System.out.println(vehiculo2);
		
		Coche coche = new Coche("Great Wall", 2023, 4);
		System.out.println(coche);
		coche.mostrarDetalles();
		
		CocheElectrico cocheElectrico = new CocheElectrico("Tesla", 2026, 5);
		cocheElectrico.setBateria(1000);		
		cocheElectrico.mostrarDetalles();	
		
	}

}
