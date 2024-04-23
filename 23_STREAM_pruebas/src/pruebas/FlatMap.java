package pruebas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<Integer[]> nums=List.of(new Integer[] {1,2,6,8},
				new Integer[] {8,3,4},
				new Integer[] {9,2,5,6,1,4,8},
				new Integer[] {7,5,4});
		
		// Nota media de todos los alumnos del curso
		
		System.out.println(nums.stream() //Stream<Integer>
				.flatMap(a->Arrays.stream(a)) //lo convierte en Stream<Integer>
				.collect(Collectors.averagingInt(n->n))); // calcula la media

			
	}
}
