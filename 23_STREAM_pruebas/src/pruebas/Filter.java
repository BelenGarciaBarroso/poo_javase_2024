package pruebas;

import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//¿Cuántos números positivos no repetidos existe?
		System.out.println(nums.stream()
			.distinct()
			.filter(n->n>0)
			.count()
		);
		
		nums.stream()
				.distinct()
				.filter(n->n>0)
				.forEach(n->System.out.println(n)

			);
			

	}

}
