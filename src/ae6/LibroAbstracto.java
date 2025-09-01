package ae6;

//clase abstracta
abstract class LibroAbstracto {
	/*Protegido (protected): Los atributos protegidos son accesibles dentro de la misma clase, 
	 * de las subclases (clases hijas) y del mismo paquete en el que se encuentra la clase. 
	 * Se declaran usando la palabra clave protected.
	 */
	protected String titulo;
	protected String autor;
	protected int numPaginas;
	
	//Constructor
	public LibroAbstracto(String titulo, String autor, int numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	//Métodos abstractos (sólo la definición del método)
	public abstract void mostrarInformacion();
	
	//Método concreto
	public String obtenerInformacion() {
		return "Titulo: "+this.titulo+", Autor: "+this.autor+", Numero de paginas: "+this.numPaginas;
	}

}
