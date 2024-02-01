package Clases;

import java.util.Arrays;

public class Asignaturas {

	private String nombre;

	private int nota1;

	private int nota2;

	private int nota3;

	public Asignaturas(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "\n\nAsignaturas [ " + " nombre = " + nombre + ", nota 1= " + nota1 + ", nota 2 = " + nota2
				+ " nota 3 = " + nota3 + " nota final = " + (nota1 + nota2 + nota3) / 2 + "]";
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

}
