package pruebas;

import java.util.List;

public class Limit {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,8,-3,2,4,11,-1,-20,8);
		//Imprimir los 5 primeros números sin incluir repetidos
		nums.stream()
			.distinct() // Stream intermedia
			.limit(5) // Stream intermedia
			.forEach(n->System.out.println(n)); // Stream final
		
	}

}
