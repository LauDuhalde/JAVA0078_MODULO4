package ae6;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
	public static void main(String[] args) {
	   List<LibroAbstracto> biblioteca = new ArrayList<>();
	   
	   biblioteca.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1000, 35.0));
	   
	   LibroFiccion libroFiccion = new LibroFiccion("1984", "George Orwell", 328, 25.0, "Distopía");
	   biblioteca.add(libroFiccion);
	   
	   Libro libroPolimorfico =  new LibroFiccion("1984", "George Orwell", 328, 25.0, "Distopía");
	   biblioteca.add(libroPolimorfico);
	  
	   for (LibroAbstracto libro : biblioteca) {
		   libro.mostrarInformacion();
	   }
	}

}
