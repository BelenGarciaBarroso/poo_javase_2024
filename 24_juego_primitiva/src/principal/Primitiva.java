package principal;

import java.util.stream.Stream;

public class Primitiva {

	public static void main(String[] args) {
		//realizar un programa que muestre las combinación ganadora
		//de la primitiva (6 numeros aleatorios no repetidos
		//entre 1 y 49. Ordenados de menor a mayor
		
		Stream.generate(()->(int)(Math.random()*49+1))
				.distinct()
				.limit(6)
				.sorted()
				.forEach(n->System.out.println(n));
		

	}
}
