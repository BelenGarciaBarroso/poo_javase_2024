package pruebas;

import java.util.function.Consumer;

public class PruebaLambda {
	static int s=2;
	public static void main(String[] args) {
		int a=2;
		int b=a++;
		Consumer<Integer> con=x->System.out.println(x+a);
		//Dentro de un lanbda no puede haber variables locales
		
		// En una expresión Lambda no se pueden usar variables locales
		//
		Consumer<Integer> con=x->System.out.println(x+b); //OK
		
		Consumer<Integer> con=x->System.out.println(x+b+d); //OK
		s++;

		

	}

}
