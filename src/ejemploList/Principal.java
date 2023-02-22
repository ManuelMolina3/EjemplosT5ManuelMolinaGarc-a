package ejemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a= new Alumno ("Miguel Campos", 20, 9);
		
		List <Alumno> listado= new ArrayList <Alumno>();
		List <String> listado2 = new ArrayList <String>();
		List <Integer> listado3 = new ArrayList <Integer>();
		listado3.add(5678);
		System.out.println(listado3);
		listado2.add("Master And Comander quien es?");
		System.out.println(listado2);
		listado.add(new Alumno("Angel Naranjo", 30, 5));
		listado.add(0,a);
		System.out.println(listado);
		System.out.println(listado.get(0));/*te devuelve el elemento que hay en la posición que le has pasado*/
		System.out.println(listado.size());/*te devuelve el tamaño de la lista*/
		listado3.clear();/**/
		System.out.println(listado3);
		listado.remove(1);/*Borra el elemento que tu le has dicho de la lista*/
		System.out.println(listado2);
	}

}
