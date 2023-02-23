package ejemploHashMap;

import java.util.HashMap;
import java.util.Map;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contactos c1 = new Contactos (1, "Fernando Fanega", "a@a.com");
		Contactos c2 = new Contactos (2, "Luismi Lopez", "b@b.com");
		Contactos c3 = new Contactos (3, "Angél Naranjo", "c@c.com");
		Map <Contactos, Integer> lista= new HashMap<Contactos, Integer>();
		
		lista.put(c1, 1111111111);
		lista.put(c2, 222222222);
		
		Agenda a= new Agenda (lista);
		a.add(c3, 333333333);
		a.mostrarTodo();
		
		System.out.println(a.findById(2));
	}

}
