package service;

import java.util.List;

class Negativos implements Condicion {

	@Override
	public boolean test(Integer n) {
		// TODO Auto-generated method stub
		return n<0;
	}
	
}

class Pares implements Condicion {

	@Override
	public boolean test(Integer n) {
		
		return (n%2==0);
	}
	
}


public class clases {

	public static void main(String[] args) {
		List <Integer>numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
		// Imprimi, por un lado, la suma de los pares 
		// y por otro la suma de los negativos
		OperacionesService service=new OperacionesService();
		Negativos neg = new Negativos();
		Pares par = new Pares ();
		
		System.out.println(service.sumaPorCondicion(numeros, neg));
		System.out.println(service.sumaPorCondicion(numeros, par));

	}

}
