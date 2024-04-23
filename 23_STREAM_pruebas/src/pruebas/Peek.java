package pruebas;

import java.util.List;

public class Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(11,4,5,8,32,7,5,8);
		//muestra cada número de la lista, sin contar duplicados, y
		// después el número total de números
		System.out.println("Total de números "+nums.stream()
		.distinct()
		.peek(n->System.out.println(n)) //Stream<Integer>
		.count());
	}

}
