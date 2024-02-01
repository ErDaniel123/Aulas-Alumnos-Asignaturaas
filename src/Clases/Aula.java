package Clases;

import java.util.Arrays;

public class Aula {

	
	private Alumnos alumnos[];
	private int contador;
	
	public Aula() {
		
		alumnos = new Alumnos[5];
		contador=0;
	}
	
	public void addAlumno(Alumnos alumno) {
		
		
		
		alumnos[contador]=alumno;
		contador++;
	
	}

	@Override
	public String toString() {
		return " Aula [alumnos= " + Arrays.toString(alumnos) + ", contador= " + contador + "]";
	}
	
	
	
}
