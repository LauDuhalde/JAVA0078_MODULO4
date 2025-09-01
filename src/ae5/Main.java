package ae5;

import java.util.ArrayList;
import java.util.Scanner;

import ae5.clases.Alumno;
import ae5.clases.Curso;
import ae5.clases.Persona;

public class Main {

	public static void main(String[] args) {
		//crear objeto desde la clase persona
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Laura","Duhalde",33, 1.56F, 85.0);
		
		//llamar a sus métodos
		persona1.hablar();
		persona1.caminar();
		
		persona2.hablar();
		persona2.caminar();
		
		//crear alumnos
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el nombre del alumno");
		String nombre = sc.nextLine();
		
		System.out.println("Ingresa la edad del alumno");
		int edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingrese el curso");
		String nombreCurso = sc.nextLine();
		
		System.out.println("Ingrse numero de lista");
		int numeroLista = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingrese el email");
		String email = sc.nextLine();
		sc.close();
		
		Curso curso = new Curso(nombreCurso,0);
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno(nombre);
		Alumno alumno3 = new Alumno(edad);
		Alumno alumno4 = new Alumno(nombre, edad);
		Alumno alumno5 = new Alumno(edad, nombre);
		Alumno alumno6 = new Alumno(nombre, edad, curso, numeroLista, email);
		alumno1.email = "email@email.cl"; //atributo público
		
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		alumnos.add(alumno4);
		alumnos.add(alumno5);
		alumnos.add(alumno6);
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		curso.setAlumnos(alumnos);
		
	}

}
