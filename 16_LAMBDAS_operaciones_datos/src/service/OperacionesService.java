package service;

import java.util.List;



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
	
	public int sumaPorCondicion(List<Integer> numeros,Condicion condicion) {
		int suma=0;
		for (Integer n:numeros) {
			if (condicion.test(n)) { 
				suma+=n;
			}
			
		}
		return suma;
	}
	
	
	
	
	
}
