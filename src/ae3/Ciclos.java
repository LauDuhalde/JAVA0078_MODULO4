package ae3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		//For
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("i = " + i);
		}
		
		int[] numeros = {2,4,6,8,10};
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento "+i+": "+numeros[i]);
		}
		//foreach
		List<String> colores = List.of("azul", "rojo", "blanco"); //inmutable, java 9+
		//colores.add("verde"); //error
		System.out.println(colores);
		
		ArrayList<String> listaColores = new ArrayList<>(colores); //mutable
		listaColores.add("negro");
		for (String color : listaColores) {
			System.out.println("El color es: "+color);
		}

		//While
		int j = 1;
		while (j <= 5) {
			System.out.println("j = " + j);
			j++;
		}

		//Do-while
		int k = 1;
		do {
		   System.out.println("k = "+k);
		   k++;
		} while (k <= 5);
		
		//Realizar un menú donde el usuario elija opciones (ej. calculadora con opciones suma, resta, multiplicacion y division)
		Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Menú
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = sc.nextDouble();

                double num2;
                if (opcion == 4) {
                    // Verificación: el divisor no puede ser cero
                    do {
                        System.out.print("Ingrese el segundo número (distinto de cero): ");
                        num2 = sc.nextDouble();
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por cero. Intente nuevamente.");
                        }
                    } while (num2 == 0);
                } else {
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextDouble();
                }

                // Operaciones
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + (num1 / num2));
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Hasta luego");
            } else {
            	System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
		
	}

}
