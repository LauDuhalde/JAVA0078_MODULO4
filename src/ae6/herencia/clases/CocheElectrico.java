package ae6.herencia.clases;

public class CocheElectrico extends Coche{
	private int bateria;

	public CocheElectrico(String marca, int año, int numeroDePuertas) {
		super(marca, año, numeroDePuertas);
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public void mostrarDetalles() {
		//super.mostrarDetalles();
		System.out.println("Método sobreescrito en CocheElectrico");
		System.out.println("Marca: "+getMarca()+
				", Año: "+getAnio()+
				", Número de puertas: "+getNumeroDePuertas()+
				", Bateria: "+getBateria());
	}
	
	
	
	
}
