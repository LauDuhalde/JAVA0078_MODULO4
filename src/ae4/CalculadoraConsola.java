package ae4;

public class CalculadoraConsola {
	/*
	 * Nombres de clases: deben empezar con mayúscula y usar camel case.
	 * Nombres de variables y métodos: comienzan en minúscula, también en camel case.
	 * Constantes: todas en mayúsculas y con guiones bajos.
	 * Indentación: usar cuatro espacios por nivel.
	 * Comentarios: deben ser descriptivos y útiles.
	 */
	public static void main(String[] args) {
		int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
        
        int IVA = 19; //Ejemplo de constante
        System.out.println(IVA);
	}
	
	/**
	 * Método que retorna un int como resultado de la suma de dos enteros 
	 * @param a primer número entero
	 * @param b segundo número entero
	 * @return La suma de ambos números
	 */
	public static int sumar(int a, int b) {
        return a + b;
    }
	
	/*
	 * javadoc -d ruta_destino/ archivo.java
	 * así la generación de documentación queda en la ruta_destino
	 */

}
