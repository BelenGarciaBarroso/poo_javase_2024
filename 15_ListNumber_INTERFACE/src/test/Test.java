package test;

import service.Condicion;
import service.ListNumber;
import service.Transformacion;

class Impares implements Condicion {

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
	
}

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
		lst.eliminarNurmeros(new Impares());
		lst.convertirNumero(new RaizCuadrada());
		System.out.println(lst.first());
		System.out.println(lst.last());
		System.out.println(lst.sum());
		
		
		
	}

}
