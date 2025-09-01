package ae3;

import java.util.ArrayList;

public class TiposDatosWrappers {

	public static void main(String[] args) {
		/**
		Clases envolturas o wrappers
			Integer: Envuelve el tipo de dato primitivo int y proporciona métodos para trabajar con números enteros.
			Long: Envuelve el tipo de dato primitivo long y proporciona métodos para trabajar con números enteros largos.
			Float: Envuelve el tipo de dato primitivo float y proporciona métodos para trabajar con números de punto flotante de precisión simple.
			Double: Envuelve el tipo de dato primitivo double y proporciona métodos para trabajar con números de punto flotante de precisión doble.
			Byte: Envuelve el tipo de dato primitivo byte y proporciona métodos para trabajar con números enteros de 8 bits.
			Short: Envuelve el tipo de dato primitivo short y proporciona métodos para trabajar con números enteros cortos.
			Character: Envuelve el tipo de dato primitivo char y proporciona métodos para trabajar con caracteres Unicode.
			Boolean: Envuelve el tipo de dato primitivo boolean y proporciona métodos para trabajar con valores booleanos (true o false).
			String: Representa una cadena de caracteres y proporciona métodos para trabajar con caracteres.
		 **/
		
		//Autoboxing: convertir un primitivo en un objeto
		int numero = 38;
		Integer numeroObjeto = numero;
		
		//Unboxing: convertir un objeto a primitivo
		int numero2 = numeroObjeto;
		
		System.out.println("numero: " + numero);
		System.out.println("objeto: "+ numeroObjeto);
		System.out.println("unboxing: "+numero2);
		
		//Wrapper
		String texto = "1234";
		int numero3 = Integer.parseInt(texto);
		String texto2 =  Integer.toString(numero3);//String.valueOf(numero3);//numero3+"";
		Integer numero4 = Integer.parseInt(texto);
		String texto3 = numero4.toString();
		
		System.out.println("texto: "+texto);
		System.out.println("texto2: "+texto2);
		System.out.println("texto3: "+texto3);
		
		double decimal = Double.parseDouble("8.8");
		System.out.println("decimal: "+decimal);
		
		boolean existe = Boolean.parseBoolean("True"); //cualquier cosa distinta de true es false
		System.out.println("Existe? "+existe);
		
		//ArrayList
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(10);
		listaNumeros.add(5);
		listaNumeros.add(20);
		System.out.println(listaNumeros);
		System.out.println(listaNumeros.size());
		
		//Recorrer lista
		for (Integer n : listaNumeros) {
			System.out.println("Elemento: "+n);
		}
		
		//Comparaciones
		int numeroA = 100;
		int numeroB = 100;
		
		System.out.println(numeroA == numeroB);//true; compara valores
		
		Integer numeroC = 200;
		Integer numeroD = 200;
		
		System.out.println(numeroC == numeroD);//false; compara objeto
		System.out.println(numeroC.equals(numeroD));//true; compara los valores
		
		String nombre = "Israel";
		String name= "Israel";
		
		System.out.println("== ." + nombre == name);//
		System.out.println("equals "+ name.equals(nombre));//true
		
		//Valores por defecto
		int edad = 0;
		System.out.println("la edad es: "+ edad);
		
		char letra = 0;// 'u0000' (el carácter nulo Unicode)
		System.out.println("La letra es: "+ letra);
		
		boolean valor = false;
		System.out.println("El de verdad es: "+ valor);
		

	}

}
