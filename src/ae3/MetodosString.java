package ae3;

public class MetodosString {

	public static void main(String[] args) {
		/*
		 * Inmutable: Cualquier modificación en un String resulta en la creación de un nuevo objeto String.
		 * 
		 */

		String frase = "  Java es GENIAL  ";
		/*1 eliminar espacios al inicio y final: trim o strip
		
			trim() elimina caracteres con código menor o igual a U+0020 (espacio estándar).
			strip() usa el estándar Unicode y elimina todos los caracteres de espacio en blanco reconocidos por Unicode, incluyendo espacios no visibles o especiales
		*/
		//2 toda al frase a minúscula: toLowerCase
		frase = frase.trim().toLowerCase();
		System.out.println(frase);
		
		//3 longitud
		System.out.println("Longitud de la frase: "+frase.length()); //14
		
		//4 buscar genial
		System.out.println("Contiene 'genial'? "+frase.contains("genial"));//true
		
		//5 reemplazar 'genial' por poderoso
		frase= frase.replace("genial", "poderoso");
		System.out.println(frase);
		
		//6 posición de 'es'
		System.out.println("Posición palabra 'es': "+frase.indexOf("es"));//5
		
		//concat
		String str1 = "Hola";
		String str2 = "Mundo";
		String resultado = str1.concat(str2); // Concatena "Hola" y "Mundo"
		System.out.println(resultado); // Salida: "HolaMundo"
		
		//toUpperCase
		String str = "hola mundo";
		String enMayusculas = str.toUpperCase(); // Convierte la cadena a mayúsculas
		System.out.println(enMayusculas); // Salida: "HOLA MUNDO"
		
		//equals
		String string1 = "Hola";
		String string2 = "Hola";
		boolean sonIguales = string1.equals(string2); // Compara si las cadenas son iguales
		System.out.println(sonIguales); // Salida: true
	}

}
