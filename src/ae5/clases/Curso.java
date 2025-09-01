package ae5.clases;

import java.util.ArrayList;

public class Curso {
	private String nombre;
	private int cantidadAlumnos;
	private ArrayList<Alumno> alumnos;
	public Curso(String nombre, int cantidadAlumnos) {
		super();
		this.nombre = nombre;
		this.cantidadAlumnos = cantidadAlumnos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadAlumnos() {
		return cantidadAlumnos;
	}
	public void setCantidadAlumnos(int cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}
