package test;

public class TestVarArgs {

	public static void main(String[] args) {
		System.out.println(union("a","b","2"));
		System.out.println(union("hello","by"));
		System.out.println(union(new String[] {"1","d"}));

	}
	
	// Crear un método que devuelva una cadena con la unión de todos 
	// los textos recibidos como parámetros, separándolos por ","
	
	static String union (String...data) {
		// El parámetro que guarda el número variable de argumentos
		// es un array
		StringBuilder builder = new StringBuilder();
		for (String s:data) {
			builder.append (s);
			builder.append (",");
		}
		return builder.toString();	}

}
