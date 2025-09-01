package ae3;

public class Condicionales {

	public static void main(String[] args) {
		
		//If
		int numero1= 5;

		/*if (numero1 % 2 == 0) {
			System.out.println("El número es par");
		}*/
		
		if (numero1 % 2 == 0) { //0 se considera par.
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		
		int puntaje = 78;
		
		if (puntaje >= 90) {
            System.out.println("Nota: A");
        } else if (puntaje >= 80) {
            System.out.println("Nota: B");
        } else if (puntaje >= 70) {
            System.out.println("Nota: C");
        } else if (puntaje >= 60) {
            System.out.println("Nota: D");
        } else {
            System.out.println("Nota: F");
        }
		
		int numero = -10;
		if (numero > 0) {
		   System.out.println("El número es positivo.");
		} else if (numero < 0){
		   System.out.println("El número es negativo.");
		} else {
			System.out.println("El número es 0");
		}
		
		
		int x = 5;
		int y = 5;
		boolean resultado = (x == y); // Devuelve true
		
		int a = 10;
		int b = 20;
		resultado = (a != b); // Devuelve true

		int num1 = 10;
		int num2 = 5;
		resultado = (num1 > num2); // Devuelve true

		int m = 7;
		int n = 7;
		resultado = (m >= n); // Devuelve true
		
		int p = 3;
		int q = 6;
		resultado = (p < q); // Devuelve true
		
		int r = 8;
		int s = 8;
		resultado = (r <= s); // Devuelve true
		
		//Operador “and” (&&): Devuelve true si ambas expresiones boleanas son verdaderas; de lo contrario, devuelve false.
		boolean expresion1 = true;
		boolean expresion2 = false;
		resultado = expresion1 && expresion2;// Devuelve false
		System.out.println("Resultado &&: "+resultado);
		
		//Operador “or” (||): Devuelve true si al menos una de las expresiones booleanas es verdadera; devuelve false solo si ambas expresiones son falsas.
		expresion1 = true;
		expresion2 = false;
		resultado = expresion1 || expresion2; // Devuelve true
		System.out.println("Resultado ||: "+resultado);
		
		//Operador “not” (!): Invierte el valor de la expresión boleana. Devuelve true si la expresión es false, y viceversa.
		boolean expresion = true;
		resultado = !expresion; // Devuelve false
		System.out.println("Resultado !: "+resultado);
		
		//Operador ternario
		int edad = 20;
		String ternario = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
		System.out.println(ternario);
				
		//Switch
		int opcion = 4;
		switch (opcion) {
		//en el case se evalua el contenido de la variable
		case 1:
			System.out.println("Es el Lunes");
			break;
		case 2:
			System.out.println("Es el Martes");
			break;
		case 3:
			System.out.println("Es el Miercoles");
			break;
		case 4:
			System.out.println("Es el Jueves");
			break;
		case 5:
			System.out.println("Es el Viernes");
			break;
		case 6:
			System.out.println("Es el Sabado");
			break;
		case 7:
			System.out.println("Es el Domingo");
			break;
		default:
			System.out.println("Indeterminado o no es un dia de la semana");
			break;
		}

	}

}
