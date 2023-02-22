package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Alumno> listaAlumnos = new HashSet <Alumno> ();
		Alumno a= new Alumno ("Angel", 30, 4.9);
		
		listaAlumnos.add(a);
		System.out.println(listaAlumnos);
		listaAlumnos.add(new Alumno("Pepe", 35, 3.2));
		
	}

}
