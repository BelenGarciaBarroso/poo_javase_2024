package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarDecimales {

	public static void main(String[] args) {
		List<Double> nums=new ArrayList<>(List.of(4.5,4.3,4.9,4.4,4.0,4.1));
		
		//para comparar decimales esta fórmula no funciona.
		nums.sort((a,b)->(int)(a-b));
		nums.forEach(n->System.out.println(n));
		System.out.println();
		
		// Se ordena con el compareTo de menos a mayor
		nums.sort((a,b)->a.compareTo(b));
		nums.forEach(n->System.out.println(n));
		
		// Se ordena con el Double.compare de menos a mayor
		nums.sort((a,b)->Double.compare(a, b));
		nums.forEach(n->System.out.println(n));

	}

}
