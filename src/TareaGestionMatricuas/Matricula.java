package TareaGestionMatricuas;

import java.util.ArrayList;

public class Matricula extends Estudiante{
	
	private int codigo;
	private String fecha;
	private String cursoAsignado;
	private ArrayList<Asignatura> asignaturas = new ArrayList();
	
	public void masAsignaturas(asignatura){
		asignaturas.add(asignatura)
	}
}
