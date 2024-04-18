package pruebas;

import java.util.function.Consumer;

public class Pruebas {

	public static void main(String[] args) {
		// Consumer que imprime un mensaje
        Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje: " + mensaje);
        
        // Usar el consumer para imprimir un mensaje
        imprimirMensaje.accept("Hola, mundo!");

	}

}
