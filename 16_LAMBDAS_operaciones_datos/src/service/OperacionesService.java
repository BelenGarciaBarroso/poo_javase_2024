package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class OperacionesService {
	/*// método que recibe una lista de números enteros
	// y devuelve la suma de los pares
	
	public int sumaPares (List<Integer>numeros) {
		int suma=0;
		for (Integer n:numeros) {
			if (n%2==0) {
				suma+=n;
			}
			
		}
		return suma;
	}
	// método que recibe una lista de números enteros
	// y devulve la suma de los positivos
	public int sumaPositivos (List<Integer>numeros) {
		int suma=0;
		for (Integer n:numeros) {
			if (n>0) { 
				suma+=n;
			}
			
		}
		return suma;
	
	}
	
	// método que recibe una lista de números enteros
	// y devulve la suma de los múltiplos de 5
	*/
	// Método que recibe una lista de números y una condicion
	// y devuelve la suma de los números que cumples esa condicion
	
	public int sumaPorCondicion(List<Integer> numeros,Predicate<Integer> condicion) { // Predicate es una interface por defecto de Java
		int suma=0;
		for (Integer n:numeros) {
			if (condicion.test(n)) { 
				suma+=n;
			}
			
		}
		return suma;
	}
	
	//método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos 
	
	public void operaciones (Collection<Integer> numeros, Predicate<Integer>condicion, Consumer<Integer>salida) {
		for (Integer n:numeros) {
			if (condicion.test(n)) {
				salida.accept(n);
			}
		}
	}
	
	
	
}
