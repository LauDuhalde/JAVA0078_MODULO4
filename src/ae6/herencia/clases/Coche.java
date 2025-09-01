package ae6.herencia.clases;
/**
 * Clase hija
 * */
public class Coche extends Vehiculo {

	private int numeroDePuertas;
	
	public Coche(String marca, int año, int numeroDePuertas) {
		super(marca, año); // Llamada al constructor de la superclase
		this.numeroDePuertas = numeroDePuertas;
	}
	
	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}



}
