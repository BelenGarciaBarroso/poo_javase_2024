package pruebas;

import java.util.List;

public class Peek_2 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(11,4,5,8,32,7,-5,8);
		System.out.println("¿Negativos? "+
		nums.stream()
			.peek(n->System.out.println(n)) //Stream<Integer>
			.anyMatch(n->n<0)); // cuando llega al negativo deja de imprimir
	}

}
