package ae5.clases;

public class Alumno {
	//atributos
	/* Alcance predeterminado de los atributos (package-private): 
	 * Los atributos con alcance predeterminado (sin un modificador de acceso explícito) 
	 * son accesibles sólo dentro del mismo paquete en el que se encuentra la clase. 
	 * No se utiliza una palabra clave para declararlos.
	 */
	String nombre;
	
	
	/*Alcance privado (private): Los atributos privados sólo son accesibles dentro de la misma clase 
	 * en la que se definen. No pueden ser accedidos desde clases externas, ni siquiera desde subclases. 
	 * Se declaran usando la palabra clave private. 
	 */
	private int edad;
	
	
	Curso curso; //asociacion
	int numeroLista;
	
	/*Alcance público (public): Los atributos públicos pueden ser accesibles desde cualquier parte del programa, 
	 * tanto dentro como fuera de la clase en la que se definen. Se declaran usando la palabra clave public. 
	 */
	public String email;
	
	
	//constructor
	//Alumno alumno1 = new Alumno();
	public Alumno() {
		this.nombre = "no definido";
		this.edad = 0;
	}
	
	//sobrecarga de metodo constructor
	//Alumno alumno2 = new Alumno("Lucas");
	public Alumno(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	
	//Alumno alumno3 = new Alumno(25);
		public Alumno(int edad) {
			this.nombre = "no definido";
			this.edad = edad;
		}
	
	//Alumno alumno4 = new Alumno("Patricio", 28);
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Alumno alumno5 = new Alumno(31, "Patricia");
	public Alumno(int edad, String nombre) {
		this.nombre = nombre;
		this.edad = edad;
	}
		
	//Alumno alumno6 = new Alumno("Jacinta", 28, objeto Curso, 2, "jacinta@email.cl");
	public Alumno(String nombre, int edad, Curso curso, int numeroLista, String email) {
		this.nombre = nombre; //uso del this
		this.edad = edad;
		this.curso = curso;
		this.numeroLista = numeroLista;
		this.email = email;
	}
	
	//métodos
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + 
				", edad=" + edad + 
				", curso=" + curso + 
				", numeroLista=" + numeroLista +
				", email=" + email + "]";
	}
	
	private void estudiar() {
		System.out.println("Estudiando...");
	}
	
	public void saludar() {
		System.out.println("Hola");
		this.estudiar(); //uso del this
		Persona persona = new Persona();
		persona.enseniar(this); //uso del this
	}
	
	
	
}
