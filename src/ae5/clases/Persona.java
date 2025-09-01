package ae5.clases;

/**
 * Clase Persona
 */
public class Persona {
	//atributos (caracteristicas)
	String nombre;
	String apellido;
	int edad;
	float estatura;
	double peso;

	//constructor
	public Persona() {
	}
	public Persona(String nombre, String apellido, int edad, float estatura, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
	}
	
	//metodos (comportamientos)
	public void caminar() {
		System.out.println("Caminando...");
	}
	public void hablar() {
		System.out.println("Hola, soy "+this.nombre);
	}
	public void enseniar(Alumno alu) {
		System.out.println(alu.nombre);
	}
}
