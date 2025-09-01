package ae6.interfaces.clases;

public class Coche implements Vehiculo{
	//atributos
	private int velocidad;
	
	//constructor
	public Coche() {
		super();
	}
	
	//Getters & setters
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	//metodos
	@Override
	public void acelerar() {
		this.velocidad += 10;
		System.out.println("La velocidad actual es: "+ velocidad);
		
	}

	@Override
	public void frenar() {
		this.velocidad = 0;
		System.out.println("Coche detenido");
	}

	@Override
	public int obtenerVelocidad() {
		return velocidad;
	}
	
	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + "]";
	}

}
