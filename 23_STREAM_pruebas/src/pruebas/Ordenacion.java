package pruebas;

import java.util.Arrays;
import java.util.Comparator;

public class Ordenacion {

	public static void main(String[] args) {
		String[] textos = {"helo","by","car","send","enter","clear","in","step"};
		// Mostrar las palabras ordenadas de menos a más caracteres
		// Si tienen el mismo número de caracteres, se ordenan alfabeticamente
		
		// Compara la longitud de los caracteres para ordenarlos
//		Comparator<String> c1=((a,b)->a.length()-b.length());
//		// Si encuentra dos con el mismo número de caracteres, lo ordena alfabeticamente
//		Comparator<String> c2=c1.thenComparing((a,b)->a.compareTo(b));
//		Arrays.stream(textos)
//			//.sorted(Comparator.comparingInt(a->a.length()))
//			.sorted(c2) 
//			.forEach(System.out::println);
			
		Arrays.stream(textos)
			.sorted(Comparator.comparingInt((String a)->a.length()).thenComparing((a,b)->a.compareTo(b)))
			.forEach(System.out::println);
		

	}

}
