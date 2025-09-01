package ae6.interfaces.clases;

public interface Vehiculo {
	
	//metodos para ser implementados
	//por defecto son public abstract
	void acelerar();
	void frenar();
	int obtenerVelocidad();
	
	default void pasarCambios() {
		System.out.println("Cuidado estoy cambiando marcha");
	}
	
	//java 8+ se pueden establecer métodos
	static void senializarGiro() {
		System.out.println("Cuidado que voy a girar");
	}

}
