package ae6;
//Herencia
public class LibroFiccion extends Libro{
	
	private String genero;

	public LibroFiccion(String titulo, String autor, int numPaginas, double tamanio, String genero) {
		super(titulo, autor, numPaginas, tamanio);
		this.genero = genero;
	}

	//Método abstracto, es obligación implementarlo
	@Override
	public void mostrarInformacion() {
		System.out.println("Libro Ficcion");
		System.out.println(super.obtenerInformacion()+", Tamanio: "+this.getTamanio()+", Genero: "+this.genero);
		
	}

}
