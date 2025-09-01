package ae6.interfaces.clases;

public class CocheElectrico implements Vehiculo, VehiculoElectrico{
	private int velocidad;
	private int bateria = 50;
	
	public CocheElectrico() {
		super();
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public void recargar() {
		bateria = 100;
		System.out.println("Carga completa");
	}

	@Override
	public void acelerar() {
		this.velocidad += 25;
		this.bateria -= 5;
		System.out.println("La velocidad actual es: "+ velocidad);
		System.out.println("La bateria actual es: "+ bateria);	
	}

	@Override
	public void frenar() {
		this.velocidad = 0;
		System.out.println("Coche Electrico detenido");
	}

	@Override
	public int obtenerVelocidad() {
		return velocidad;
	}

	@Override
	public String toString() {
		return "CocheElectrico [velocidad=" + velocidad + ", bateria=" + bateria + "]";
	}

	
}
