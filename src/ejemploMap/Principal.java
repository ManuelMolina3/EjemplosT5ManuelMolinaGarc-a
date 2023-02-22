package ejemploMap;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String, String> mapa = new HashMap <String, String>();
		mapa.put("one","1st");
		mapa.put("second", "2nd");
		mapa.put("third","3rd");
		//Sobrescribe la asignación anterior porque no admite claves repetidas
		mapa.put("third","III");
		mapa.remove("one");
		System.out.println(mapa);
		//Devuelve el conjunto de las claves y se guarda en set1
	}

}
 