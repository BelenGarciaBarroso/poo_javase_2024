package pruebas;

import java.util.List;

public class MapToDouble {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		// Suma de todos los números negativos
		
		System.out.println(nums.stream()
			.filter(n->n<0) // Stream<Integer>
			.mapToInt(n->n.intValue())//IntStream
			.sum());
			
		
		// Media de los positivos, sin duplicados
		nums.stream()
			.filter(n->n>0) //Stream<Integer> - coge los positivos
			.distinct() //Stream<Integer> - quita duplicados
			.mapToInt(n->n) //IntStream - los convierte en primitivos
			.average() //OptionalDouble -calcula la media
			.ifPresentOrElse(r->System.out.println(r),()->System.out.println("No hay media"));
				
		

	}

}
