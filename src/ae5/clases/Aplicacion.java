package ae5.clases;

public class Aplicacion {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		System.out.println(alumno.nombre); //atributo accesible porque estamos dentro del mismo pac
		//System.out.println(alumno.edad); //No funciona porque edad es privada
		
		alumno.saludar();
		//alumno.estudiar(); //No funciona porque es privado
		
		Reloj reloj = new Reloj(20,42,55); //objeto reloj
		reloj.establecerAlarma(20, 43);
		
		reloj.setHora(-1);
		System.out.println("Hora: "+reloj.getHora());
		
		while(reloj.isAlarmaActiva()) {
			reloj.tickSegundo();
			reloj.mostrarHora();
		}
		
		
		

	}

}
