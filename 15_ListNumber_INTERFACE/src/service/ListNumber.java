package service;

		/*Vamos a crear una clase, llamada ListNumber, para
		manejar listas de números enteros.
		La clase, heredará ArrayList<Integer>, e incorporará
		las siguientes mejoras:
		
		-Método first() que devuelve el primer elemento de la lista
		-Método last() que devuelve el último elemento de la lista
		(ambos devuelven null si la lista está vacía)
		-Método sum() que devuelve la suma de todos 
		los elementos de la lista
		
		-No debe permitir añadir números ya existentes */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ListNumber extends ArrayList<Integer>{
	public Integer first() {
		if (size()==0) { // si el array está vacío.
			return null;
		}
		return get(0);
	}
	
	public Integer last() {
		if (size()==0) {
			return null;
		}
		return get(size()-1);
	}
	
	public int sum( ) {
		int suma=0;
		/*for (int i=0;i<size();i++) {
			suma=+get(i);
		}*/
		// con for each --> el objeto es this
		for (Integer c:this) {
			suma+=c;
		}
		return suma;
	}

	@Override
	public boolean add(Integer e) {
		if (!contains(e)) { // se puede utiliza también indexOf
			return super.add(e);
		}
		return false;
	}	
	
	// Nuevo método eliminarNurmeros: Elimina de la lista cualquier grupo de 
	// números que cumplan una condición.
	


	public void eliminarNurmeros (Condicion condicion) {
		/*for (Integer n:this) {
			if (condicion.test(n)) {
				this.remove(n);
			}
		}*/
		
		// MEJOR forma de borrar de una lista
		Iterator<Integer> it=iterator();
		while (it.hasNext()) {
			if (condicion.test(it.next())) {
				it.remove();
			}	
		}
	}
	
	// Método para transformar cada númro de lista en otro diferente
	// Debería ser capaz de transformar cada número en su cuadrado,
	// en la mitad, en su raíz cúbica, etc...

	public void convertirNumero (Transformacion tx) {
		for (int i=0;i<size();i++) {
			set(i,tx.transformar(get(i)));
		}
	}


}





