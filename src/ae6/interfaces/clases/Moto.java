package ae6.interfaces.clases;

public class Moto implements Vehiculo{
	private int velocidad;
	

	public Moto() {
		super();
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public void acelerar() {
		this.velocidad += 15;
		System.out.println("La velocidad actual es: "+ velocidad);
	}

	@Override
	public void frenar() {
		this.velocidad = 0;
		System.out.println("Moto detenida");
	}

	@Override
	public int obtenerVelocidad() {
		return velocidad;
	}

	@Override
	public String toString() {
		return "Moto [velocidad=" + velocidad + "]";
	}
	
	

}
