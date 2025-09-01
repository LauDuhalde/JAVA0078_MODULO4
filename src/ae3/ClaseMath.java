package ae3;

public class ClaseMath {

	public static void main(String[] args) {
		/* No necesita ser importada, acepta distintos tipos de datos numéricos en sus métodos
		 * Constantes útiles
		 * 		Math.PI ≈ 3.141592653589793
		 * 		Math.E ≈ 2.718281828459045
		 */
		
		//Valor absoluto: distancia entre el número y 0 en una recta
		int a = -10;
		System.out.println("Valor absoluto: "+Math.abs(a)); // 10
		
		//Máximo y mínimo entre dos valores
		System.out.println("Máximo entre 5 y 8: "+Math.max(5, 8)); // 8
		System.out.println("Mínimo entre 3.5 y 2.9: "+Math.min(3.5, 2.9)); // 2.9
		
		//Redondeo
		System.out.println("Round 4.6: "+Math.round(4.6)); // 5, redondea al entero más cercano, sin decimal
		System.out.println("Ceil 4.2: "+Math.ceil(4.2));  // 5.0, redondeo hacia arriba
		System.out.println("Floor 4.9: "+Math.floor(4.9)); // 4.0, redondea hacia abajo
		
		//Potencias y raíces
		System.out.println("Potencia 2^3: "+Math.pow(2, 3)); // 8.0
		System.out.println("Raíz cuadrada de 16: "+Math.sqrt(16));  // 4.0
		System.out.println("Cubo de -27: "+Math.cbrt(-27));
		
		//Números aleatorios
		double aleatorio = Math.random(); // Valor entre 0.0 y 1.0
		System.out.println("Random: "+aleatorio);
		int entre1y10 = (int)(Math.random() * 10) + 1;
		System.out.println("Numero aleatorio entre 1 y 10: "+entre1y10); // Número aleatorio entre 1 y 10
		
		//Trigonometría
		double anguloGrados = 45;
		double anguloRadianes = Math.toRadians(anguloGrados); //grados a radianes
		System.out.println("Seno de 45°: "+Math.sin(anguloRadianes)); // 0.7071...
		System.out.println("Coseno de 45°: "+Math.cos(anguloRadianes));
		System.out.println("Tangente de 45°: "+Math.tan(anguloRadianes));
		System.out.println("Hipotenusa: "+Math.hypot(3.0, 4.0));
		
		//Logaritmos y Exponencial
		System.out.println("Logaritmo natural de 1: "+Math.log(1));    // 0.0 (logaritmo natural)
		System.out.println("Logaritmo en base 10 de 100: "+Math.log10(100)); // 2.0
		System.out.println("Exponencial e^1: "+Math.exp(1));
		
		//Uso de constante PI
		System.out.println("Área de un círculo con radio 3: "+Math.PI * Math.pow(3, 2));
		System.out.println("PI: "+Math.PI);
		System.out.println("E: "+Math.E);
		System.out.println("TAU: "+Math.TAU);
	}

}
