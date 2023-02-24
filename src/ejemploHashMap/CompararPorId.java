package ejemploHashMap;

import java.util.Comparator;

public class CompararPorId implements Comparator<Contactos>{

	@Override
	public int compare(Contactos c1, Contactos c2) {
		// TODO Auto-generated method stub
		if(c1.getIdContacto()>c2.getIdContacto()) {
			return 1;
		}else if (c1.getIdContacto()<c2.getIdContacto()) {
			return -1;
		}else {
			return 0;
		}
	}
	

}
