package ejemploHashMap;

import java.util.Iterator;
import java.util.Map;

public class Agenda {
	private Map<Contactos, Integer> lista;

	public Agenda(Map<Contactos, Integer> lista) {
		super();
		this.lista = lista;
	}

	public Map<Contactos, Integer> getLista() {
		return lista;
	}

	public void setLista(Map<Contactos, Integer> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}

	public void add(Contactos c, Integer num) {
		lista.put(c, num);
	}

	public void mostrarTodo() {
		for (Contactos c : lista.keySet()) {
			System.out.println(lista.get(c));
			System.out.println(c);
		}
	}

	public Contactos findById(int id) {
		Contactos c;
		Iterator<Contactos> it = lista.keySet().iterator();
		while (it.hasNext()) {
			c = it.next();
			if (c.getIdContacto() == id) {
				return c;
			}
		}
		return null;
	}

	public void remove(int id) {
		lista.remove(findById(id));
	}

}
