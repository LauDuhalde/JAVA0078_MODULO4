package ae2;

import java.util.Scanner;

public class Presentacion {

	public static void main(String[] args) {
		//Solicitar y mostrar sus datos personales
		//Nombre, apellido, edad, dirección
		//Mostrar mensake con toda la información.
		
		//Scanner está leyendo desde la entrada estándar (System.in)
		Scanner sc = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Ingrese su nombre:");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese su apellido:");
		String apellido = sc.nextLine();
		
		System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();
		
		sc.nextLine(); //Limpiar el salto de línea pendiente
		System.out.println("Ingrese su direccion:");
		String direccion = sc.nextLine();
		
		sc.close(); //Se cierra el objeto Scanner sc
		
		//Proceso
		//"Interpolación de string" con String.format();
		//%s string %d para int %.2f
		
		String saludo = String.format("Hola %s %s, tienes %d años y tu dirección es %s", nombre, apellido, edad, direccion);
		
		//Salida
		System.out.println(saludo);
	}

}
