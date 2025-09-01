package ae6.herencia.clases;
/**
 * Clase padre
 * */
public class Vehiculo {
	private String marca;
	private int anio;

	public Vehiculo() {
	}

	public Vehiculo(String marca, int anio) {
		this.marca = marca;
		this.anio = anio;
    }
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void mostrarDetalles() {
		System.out.println("Marca: " + marca + ", Año: " + anio);
    }
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", año=" + anio + "]";
	}

}
