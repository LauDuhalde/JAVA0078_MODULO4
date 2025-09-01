package ae3;

public class TiposDatos {

	public static void main(String[] args) {
		/*En Java, una variable es una referencia a un espacio de memoria 
		que contiene un valor. 
		Debe declararse con un tipo de dato
		*/
		/**
		Tipos de datos primitivos
		 	byte: Representa valores enteros de 8 bits, con un rango de -128 a 127.
			short: Representa valores enteros de 16 bits, con un rango de -32,768 a 32,767.
			int: Representa valores enteros de 32 bits, con un rango de -2^31 a (2^31)-1.
			long: Representa valores enteros de 64 bits, con un rango de -2^63 a (2^63)-1.
			float: Representa valores de punto flotante de precisión simple de 32 bits.
			double: Representa valores de punto flotante de precisión doble de 64 bits.
			char: Representa un solo carácter Unicode de 16 bits.
			boolean: Representa un valor booleano, que puede ser true o false.
		 **/
		
		
		boolean estaPresente = true;//logico, verdado o falso
		char vocal_a = 'a';// carácter (comillas simples)
		//byte -128 al 127
		//short -32...
		int edad = 10; //entero
		//float,
		float precio = 12345.4f;
		double altura = 1.79;//decimal
		long numero_grande = 12345678912345678L;
		
		System.out.println("int edad = " + edad);
		System.out.println("double altura = " + altura);
		System.out.println("boolean estaPresente = "+ estaPresente);
		System.out.println("char vocal_a = " + vocal_a);
		System.out.println("float precio = "+ precio);
		System.out.println("long numero_grande = " + numero_grande);
	}

}
