package ae6.interfaces;

import ae6.interfaces.clases.Coche;
import ae6.interfaces.clases.CocheElectrico;
import ae6.interfaces.clases.Moto;
import ae6.interfaces.clases.Vehiculo;
import ae6.interfaces.clases.VehiculoElectrico;

public class Aplicacion {
	public static void main (String [] args) {
		//instancia de la clase
		//crear objeto
		
		//la interfaz puede comportarse como cualquiera de sus clases que la implementa
		Vehiculo coche = new Coche(); //polimorfismo
		Vehiculo moto = new Moto(); //polimorfismo
		
		//implementación múltiple
		Vehiculo cocheElectrico =  new CocheElectrico();//polimorfismo
		VehiculoElectrico cocheElectrico2 =  new CocheElectrico();
		
	}
}
