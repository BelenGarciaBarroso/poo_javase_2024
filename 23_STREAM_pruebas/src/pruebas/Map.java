package pruebas;

import java.util.List;

public class Map {

	public static void main(String[] args) {
		List<String> cads=List.of("cadena","otra","fin","sale","casa","pariso");
		// Muestra las longitudes de todas las cadenas, sin repetir longitudes
		cads.stream()// Stream <String>
			.map(n->n.length())//Stream<Integer>
			.distinct()
			.forEach(System.out::println);
	}
	
	

}
