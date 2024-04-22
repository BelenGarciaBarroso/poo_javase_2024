package pruebas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		
		// Crear una tabla donde esté agrupados los negativos y los positivos por otro.
		Map<Boolean, List<Integer>> tabla=nums.stream()
				.collect(Collectors.partitioningBy(n->n>0));
		
		//Crear una tabla donde estén agrupados las suma de los negativos
		// por un lado y la suma d elos positivos por otro
		
		Map<Boolean,Integer> tablaSuma = nums.stream()
				.collect(Collectors.partitioningBy(n->n>0,
						Collectors.summingInt(n->n)));
			
		}

}


