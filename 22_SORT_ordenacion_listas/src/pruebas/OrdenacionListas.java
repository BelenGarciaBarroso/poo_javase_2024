package pruebas;

import java.util.ArrayList;
import java.util.List;

public class OrdenacionListas {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(12,59,2,17,4,4));
		//Ordenación natural de menos a más
		nums.sort((a,b)->a-b);
		nums.forEach(n->System.out.println(n));
		
		//Ordenación de más a menos
		nums.sort((a,b)->b-a);
		nums.forEach(n->System.out.println(n));

	}

}
