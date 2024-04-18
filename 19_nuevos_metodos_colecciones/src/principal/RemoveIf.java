package principal;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		//List<Integer> nums=List.of(1,6,9);
		//nums.removeIf(n->n<0); // no se puede aplicar sobre un of pq es inmutable.
		List<Integer> nums=new ArrayList<>(List.of(1,6,9,-3));
		nums.removeIf(n->n<0);
		nums.forEach(n->System.out.println(n));
		

	}

}
