package principal;

import java.util.ArrayList;
import java.util.List;

public class Pruebas4 {

	public static void main(String[] args) {
		List<Integer> lst1=new ArrayList<Integer>();
		
		//List<Number> lst2=new ArrayList<Integer>(); --> ERROR
		// Tienen que contener los dos el mismo tipo de elementos
		
		List<Number> lst3=new ArrayList <Number>();
		lst3.add(10); lst3.add(4.5);
		
		ArrayList<Integer> lst4=new ArrayList <Integer>();
		lst4.add(100); lst4.add(4);
		
		List<?> lst5=lst4; //el tipo comodín. Admite lista de cualquier tipo
		List<? extends Number> lst6=lst4; // adminte lista de cualquier tipo que herede number
		List<? super Integer> lst7=lst4; // admite lista de cualquier tipo que sea superclase de Integer (o integer)
		
	}

}
