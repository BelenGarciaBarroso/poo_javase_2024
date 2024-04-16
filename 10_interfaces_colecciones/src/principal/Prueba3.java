package principal;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Prueba3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(11);nums.add(7);nums.add(12);
		nums.add(31);nums.add(4);nums.add(3);nums.add(8);
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(11);nums2.add(71);nums2.add(12);
		nums2.add(31);nums.add(6);nums2.add(30);nums.add(8);
		System.out.println(conjunto (nums,nums2));
		
		//

	}
	
	// Realizar un método que recibe dos colecciones de enteros
	// y devuelve un conjunto con los números contenidos en ambas
	// colecciones
	
	public static Set <Integer> conjunto   (Collection <Integer> nums, Collection <Integer> nums2) {
		Set <Integer>todos =  new HashSet <Integer> ();
		
		
		for (Integer n:nums) {
			todos.add(n);	
		}
		for (Integer n:nums2) {
			if (!nums2.contains(todos)){
			todos.add(n);		
			}

		}
		
		/*for (Integer n:nums) {
			if (!nums2.contains(n)) {
				todos.add(n);
			}
		}*/
		
		return todos;
	}

}
