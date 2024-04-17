package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Predicate;

import javax.print.PrintService;

/*class Negativos implements Condicion {

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
}*/


public class AppNumeros {

	public static void main(String[] args) {
		List <Integer>numeros=List.of(3,-2,8,-4,1,17,22,-9,20,12);
		// Imprimi, por un lado, la suma de los pares 
		// y por otro la suma de los negativos
		OperacionesService service=new OperacionesService();		
		System.out.println(service.sumaPorCondicion(numeros, (Integer n)->n<0)); // n->n>0 es una expresión Lambda
		System.out.println(service.sumaPorCondicion(numeros, n->n%2==0));
		// Suma los negativos mayores que -5
		System.out.println(service.sumaPorCondicion(numeros, n->n<0&&n>-5));
		Predicate<Integer> negativo=n->n<0; // Se pueden declarar mas de un predicate con diferentes resultados.
		Predicate<Integer> mayorCinco=n->n>-5;
		System.out.println(service.sumaPorCondicion(numeros, negativo.and(n->n>-5)));
		System.out.println(service.sumaPorCondicion(numeros, negativo.and(mayorCinco)));
		
		// Imprimir por pantallas los pares
		service.operaciones(numeros, n->n%2==0, n->System.out.println(n));
		
		// Graba los positivos
		service.operaciones(numeros, n->n>0, n->{
			try(FileOutputStream fos=new FileOutputStream("positivos.txt",true);
					PrintStream out=new PrintStream(fos)){
				out.println(n);
				}catch(IOException ex) {
			}
		});
		
		// Graba los múltipos de 5
		service.operaciones(numeros, n->n%5==0, n->{
			try(FileOutputStream fos=new FileOutputStream("mayorCinco.txt",true);
					PrintStream out=new PrintStream(fos)){
				out.println(n);
				}catch(IOException ex) {
			}
		});
		
		// Imprimir por pantallas los negativos
				service.operaciones(numeros, n->n<0, n->System.out.println(n));
		
	}

}
