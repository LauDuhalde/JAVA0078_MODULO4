package ae6.polimorfismo;

import ae6.polimorfismo.clases.Animal;
import ae6.polimorfismo.clases.Gato;
import ae6.polimorfismo.clases.Perro;
import ae6.polimorfismo.interfaz.Circulo;
import ae6.polimorfismo.interfaz.Cuadrado;
import ae6.polimorfismo.interfaz.Figura;

public class Aplicacion {
	public static void main(String[] args) {
		Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.hacerSonido(); // El perro ladra
        a2.hacerSonido(); // El gato maúlla
        
        
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Circulo(3);

        System.out.println(f1.calcularArea()); // 16.0
        System.out.println(f2.calcularArea()); // 28.27...
	}

}
