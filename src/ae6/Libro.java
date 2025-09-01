package ae6;

public class Libro extends LibroAbstracto {
	private double tamanio;

	public Libro(String titulo, String autor, int numPaginas, double tamanio) {
		super(titulo, autor, numPaginas);
		this.tamanio = tamanio;
	}

	//método abstracto heredado
	@Override
	public void mostrarInformacion() {
		System.out.println("Libro");
		System.out.println(super.obtenerInformacion()+", Tamaño: "+this.tamanio);
		
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	
}
