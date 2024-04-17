package test;

import service.Condicion;
import service.ListNumber;
import service.Transformacion;

/*class Impares implements Condicion {

	@Override
	public boolean test(Integer n) {
		// TODO Auto-generated method stub
		return n%2!=0;
	}	
}

class RaizCuadrada implements Transformacion {

	@Override
	public Integer transformar(Integer n) {
		return (int)Math.sqrt(n); // raiz cuadrada2
	}
	
}*/

public class Test {
	
	public static void main (String [] args) {
		ListNumber lst=new ListNumber();
		lst.add(1);
		lst.add(30);
		lst.add(10);
		lst.add(20);
		lst.add(15);
		lst.add(2);
		lst.add(7);
		// Elimina los impares
		lst.eliminarNurmeros(n-> n%2!=0);
		System.out.println(lst);
		// Hacer raiz cuadrada 
		lst.convertirNumero(n-> (int)Math.sqrt(n));
		System.out.println(lst);
		System.out.println("El primero de la lista es: "+lst.first());
		System.out.println("El último de la lista es: "+lst.last());
		System.out.println("La suma de los que quedan es: "+lst.sum());
		
		
		
	}

}
