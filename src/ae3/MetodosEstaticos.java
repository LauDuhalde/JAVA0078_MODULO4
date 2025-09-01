package ae3;

public class MetodosEstaticos {
	/*
	 * metodos estáticos dentro de una misma clase equivale a funciones
	 * sobrecarga: varios métodos con el mismo nombre pero con parámetros distintos
	 */
	
	//accesador; invocacion; tipo de retorno; nombre_metodo(tipo_dato nombre_parametro)
	public static void main(String[] args) {
		restaNumeros(30,10);
		
		System.out.println(sumaNumeros(20, 30)); // Imprime 50
		System.out.println(sumaNumeros(20, 30, 40)); // Imprime 90   
		System.out.println(sumaNumeros(20.5, 30.5)); // Imprime 51.0
		System.out.println(sumaNumeros(20.5, 30.5, 40.5)); // Imprime 91.5 
	}
	
	public static void restaNumeros(int num1, int num2) { //void: no retorno
		System.out.println("La resta es: "+(num1-num2));
	}
	public static int sumaNumeros(int num1, int num2){
       return num1 + num2;
    }
	public static int sumaNumeros(int num1, int num2, int num3) {
	   return num1 + num2 + num3;
	}
	public static double sumaNumeros(double num1, double num2) {
		return num1 + num2;
	}
	public static double sumaNumeros(double num1, double num2, double num3) {
	   return num1 + num2 + num3;
	}
}
