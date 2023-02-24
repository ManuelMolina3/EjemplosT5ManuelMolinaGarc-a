package ejemploHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		Contactos c1 = new Contactos (1, "Fernando Fanega", "a@a.com");
		Contactos c2 = new Contactos (2, "Luismi Lopez", "b@b.com");
		Contactos c3 = new Contactos (3, "Angél Naranjo", "c@c.com");
		Map <Contactos, Integer> lista= new HashMap<Contactos, Integer>();
		Map <Contactos, Integer> tree;
		
		lista.put(c1, 1111111111);
		lista.put(c2, 222222222);
		
		Agenda a= new Agenda (lista);
		a.add(c3, 333333333);
		a.mostrarTodo();
		
		System.out.println(a.findById(2));
		
		op=Leer.datoInt();
		switch(op) {
		case 1:
			tree= new TreeMap<Contactos, Integer>();
			tree.putAll(lista);
			for(Contactos c: tree.keySet()) {
				System.out.println("Clave: " +c + "Valor: " + tree.get(c));
			}
			break;
		case 2:
			tree= new TreeMap<Contactos, Integer>(new CompararPorId());
			tree.putAll(lista);
			for(Contactos c: tree.keySet()) {
				System.out.println("Clave: " +c + "Valor: " + tree.get(c));
			}
			
			break;
			
		}
	}

}
