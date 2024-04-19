package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOredenarTextos {

	public static void main(String[] args) {
		List<String> textos=new ArrayList<String>(List.of("hello","by","adoro"));
		
		//ordenar de menor a mayor, de la a a la z
		textos.sort((a,b)->a.compareTo(b));
		textos.forEach(n->System.out.println(n));
		System.out.println();
		
		//ordena de mayor a menor, de la z a la a
		textos.sort((a,b)->b.compareTo(a));
		textos.forEach(n->System.out.println(n));
	}

}
