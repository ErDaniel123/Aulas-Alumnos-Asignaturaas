package Clases;

public class Start {

	public static void main(String[] args) {

		Aula aula = new Aula();
		Alumnos juan = new Alumnos("Juan","Rodriguez",3493592);
		Alumnos maria = new Alumnos("Maria","Fernandez",675687945);
		
		Asignaturas fol = new Asignaturas("Fol");
		Asignaturas marcas = new Asignaturas("Marcas");
		Asignaturas prog = new Asignaturas("Programacion");
		Asignaturas sistemas = new Asignaturas("Sistemas");
		
		
		
		Asignaturas folMaria = new Asignaturas("Fol");
		Asignaturas marcasMaria = new Asignaturas("Marcas");
		Asignaturas progMaria = new Asignaturas("Programacion");
		Asignaturas sistemasMaria = new Asignaturas("Sistemas");
		 
		juan.addAsignatura(sistemas);
		juan.addAsignatura(prog);
		juan.addAsignatura(marcas);
		juan.addAsignatura(fol);

		fol.setNota1(6);
		fol.setNota2(4);

		fol.setNota3(4);
		
		prog.setNota1(2);
		prog.setNota2(3);

		prog.setNota3(4);
		
		marcas.setNota1(2);
		marcas.setNota2(10);

	marcas.setNota3(4);
		
	sistemas.setNota1(7);
		sistemas.setNota2(8);

		sistemas.setNota3(4);
		
		
		
		folMaria.setNota1(2);
		folMaria.setNota2(2);

		folMaria.setNota3(4);
		
		progMaria.setNota1(6);
		progMaria.setNota2(5);

		progMaria.setNota3(7);
		
		marcasMaria.setNota1(1);
		marcasMaria.setNota2(10);

	marcasMaria.setNota3(4);
		
	sistemasMaria.setNota1(1);
		sistemasMaria.setNota2(1);

		sistemasMaria.setNota3(4);
		
		
		aula.addAlumno( juan);
		maria.addAsignatura(sistemasMaria);
aula.addAlumno(maria);
maria.addAsignatura(prog);
		maria.addAsignatura(marcasMaria);
		maria.addAsignatura(folMaria);
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(aula);
		System.out.println("Nota media 1 evaluacion ="+(fol.getNota1()+sistemas.getNota1()+prog.getNota1()+marcas.getNota1())/4);
	
	
	}

}
