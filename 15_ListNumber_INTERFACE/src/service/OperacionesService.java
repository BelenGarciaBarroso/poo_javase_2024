package service;

import java.util.List;



public class OperacionesService {
	
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
