package ae3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArreglosDinamicos {

	public static void main(String[] args) {
		// Crear un ArrayList vacío (tamanño dinámico)
	    ArrayList<Integer> numeros = new ArrayList<>();
	    var listaNumeros = new ArrayList<Integer>();
	    System.out.println("Tamaño del ArrayList var: " + listaNumeros.size());

       // Agregar elementos al ArrayList (al final)
       numeros.add(10); //indice 0
       numeros.add(20); //indice 1
       numeros.add(30); //indice 2
       System.out.println(numeros);
       
       //Agregar en un indice particular
       numeros.add(1,40); //Nuevo elemento 1
       System.out.println(numeros);
       numeros.add(50);
       numeros.add(40); //Numero repetido
       System.out.println(numeros);

       // Imprimir el tamaño del ArrayList
       System.out.println("Tamaño del ArrayList: " + numeros.size());
       
       //Eliminar elemento por indice
       numeros.remove(1);
       
       //Eliminar elemento por objeto (el primero que encuentra)
       numeros.remove(Integer.valueOf(40));
       System.out.println(numeros);
       
       //Recuperar el elemento (por indice)
       System.out.println("Indice 1 contiene: "+numeros.get(1)); //20
       
       //Reemplazar por indice
       numeros.set(1, 60); //20 es reemplazado por 60
       System.out.println(numeros);
       
       //Verifica si un elemento existe
       System.out.println("Contiene 20? "+numeros.contains(20)); //false
       
       //Retorna el indice del primer elemento encontrado, retorna -1 al no encontrar coincidencia
       System.out.println("60 está en el indice: "+numeros.indexOf(60));
       
       //Recorrer los elementos
       System.out.println("For-each");
       for (Integer numero : numeros) {
    	   System.out.println(numero);
       }
       System.out.println("For");
       for (int i = 0; i < numeros.size(); i++) {
    	    System.out.println(numeros.get(i));
       }
       System.out.println("For-each lambda");
       numeros.forEach(numero -> System.out.println(numero));
       
       System.out.println("método de referencia");
       numeros.forEach(System.out::println);
       
       System.out.println("Iterador");
       Iterator<Integer> iterador = numeros.iterator();
       while (iterador.hasNext()) {
           int numero = iterador.next();
           System.out.println(numero);
       }
       
       //Lista orden invertido (no modifica el arreglo)
       System.out.println(numeros.reversed());
       
       //Elimina todos los elementos
       numeros.clear();
       
       //Para saber si el arreglo está vacio
       System.out.println("Está vacio? "+numeros.isEmpty());
       
	}

}
