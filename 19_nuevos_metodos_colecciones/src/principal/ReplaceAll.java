package principal;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(1,6,9,-3));
		nums.replaceAll(n->n/2);
		nums.forEach(n->System.out.println(n));

	}

}
