package ae3;

import java.util.Arrays;

public class ArreglosEstaticos {

	public static void main(String[] args) {
		// Arreglo unidimensional
		/* tipoDato[] nombreArreglo = new tipoDato[tamaño]
		 * (también llamado array de una dimensión) 
		 * es una estructura que permite almacenar múltiples elementos del mismo tipo 
		 * en una única variable indexada.
		 * comienzan en la posición 0
		 * */
		int[] numerosImpares = new int[5];
		numerosImpares[2] = 30;
		numerosImpares[0] = 10;
		numerosImpares[1] = 20;
		
		System.out.println("Elementos del arreglo: "+Arrays.toString(numerosImpares));
		System.out.println("Longitud del arreglo: "+numerosImpares.length);
		
		for (int i = 0; i < numerosImpares.length; i++) {
			System.out.println("Elemento "+i+": "+numerosImpares[i]);
		}
				
		int[] numeros = {2,4,6,8,10}; 
		//foreach
		for (int numero : numeros) {
			System.out.println(numero);
		}
		//System.out.println(numero);// no existe esa variable en este lugar

		int[] numerosPares = numeros; //referencia al mismo espacio de memoria que numeros, no hace una copia
		
		numerosPares = Arrays.copyOf(numeros, numeros.length); //Es una copia superficial.
		/*Puedes copiar solo parte del arreglo si quieres:
		Ejemplo: Arrays.copyOf(numeros, 2) → copia solo los primeros 2 elementos.*/
		
		numerosPares = numeros.clone(); //También hace una copia superficial.
		/*
		Esto está bien para arreglos de tipos primitivos (como int[], double[], etc.).
		Pero si tienes un arreglo de objetos (String[], Persona[]), los objetos internos no se copian, solo sus referencias.
		 */
		
		/*
		//Otra forma de copiar
		int[] numerosPares = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
    		numerosPares[i] = numeros[i];
		}
		*/
		
		numeros[4] = 12;
		
		System.out.println("Numeros pares: "+Arrays.toString(numerosPares));
		
		
		String[] vocales = {"a","e","i","o","u"};
		
		for (String vocal : vocales) {
			System.out.println(vocal);
		}
		
		/**
		 * Arreglo Bidimensional
		 * **/
		//el primer elemento esta en la posicion 0 (cero)
		
		int[][] matriz = {
				{1,2,3},//fila 0
				{4,5,6,7},//fila 1
				{8,9,0}
		};
		System.out.println(matriz[0][0]);
		System.out.println(matriz[1][0]);
		
		System.out.println("Imprimir los elementos de la matriz");
		System.out.println("Matriz: "+Arrays.deepToString(matriz));
		
		/*for (int fila = 0; fila < 2 ; fila++) {
			System.out.println(matriz[fila][0]);
		}*/
		for (int fila = 0; fila < matriz.length ; fila++) {
			for (int columna = 0; columna < matriz[fila].length ; columna++) {
				System.out.print(matriz[fila][columna]);
			}
			System.out.println();
		}
		
	}

}
