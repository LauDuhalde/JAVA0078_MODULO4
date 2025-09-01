package ae2;

import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] args) {
		/*
		Inicio
   			Leer A, B
   			Resultado = A + B
   			Imprimir Resultado
		Fin*/
		
		//Definir la variable sc, encargada de capturar datos ingresados por consola
		//Scanner está leyendo desde la entrada estándar (System.in)
		Scanner sc = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Ingrese el primer número:");
		int numero1 = sc.nextInt();
		
		System.out.println("Ingrese el segundo número:");
		int numero2 = sc.nextInt();
		
		sc.close(); //Se cierra el objeto Scanner sc
		
		//Proceso
		int resultado = numero1 + numero2;
		
		//Salida
		System.out.println("El resultado de la suma es: "+resultado);
	}
}
