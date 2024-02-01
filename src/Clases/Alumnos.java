package Clases;

import java.util.Arrays;

public class Alumnos {

	private String nombre;
	
	private String Apellido;
	
	private int telefono;
	
	private Asignaturas Asignaturas[];

	private int contador;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	@Override
	public String toString() {
		return " \n\nAlumnos [nombre= " + nombre + ", Apellido= " + Apellido + ", telefono= " + telefono + ", calificaciones="
				+ Arrays.toString(Asignaturas) + "]";
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Asignaturas[] getCalificaciones() {
		return Asignaturas;
	}

	public void setCalificaciones(Asignaturas[] calificaciones) {
		this.Asignaturas = calificaciones;
	}
	
	public void addAsignatura(Asignaturas asignatura) {
		
		Asignaturas[contador]=asignatura;
		contador++;
		
	}
	
	public Alumnos (String nombre, String apellido,int telefono) {
		this.Apellido=apellido;
		this.nombre=nombre;
		this.telefono=telefono;
		Asignaturas = new Asignaturas[4];
		contador=0;
	}
	
}
