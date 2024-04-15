package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Prueba1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(25);nums.add(200);nums.add(20);
		System.out.println(suma(nums));
		System.out.println(media(nums));
		
		
		
	}
	// Crear un  método que reciba una lista de Ingeger
	// y devuelva la suma de los pares de dicha lista
	public static int suma (List <Integer> numeros) {
		int pares=0;
		for (Integer n:numeros) {
			if (n%2==0) {
				pares+=n;
			}
		}
		
		return pares;
	}
	
	// Crear un  método que reciba una colección de Ingeger
	// y devuelva la media.
	public static double media (Collection <Integer> numeros) {
		int media=0;
		for (Integer n:numeros) {
			media+=n;
		}
		return (media/numeros.size());
	}

}
