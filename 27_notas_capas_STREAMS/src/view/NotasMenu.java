package view;

import java.util.Arrays;
import java.util.Scanner;

import service.NotasService;

public class NotasMenu {
	
	static NotasService service=new NotasService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			//presentar menú
			// leer y comprobar opción elegida
			presentarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
				case 1:
					agregarNota();
					break;
				case 2:
					presentarMedia();
					break;
				case 3:
					presentarExtremas();
					break;
				case 4:
					mostrarNotas();
					break;
				case 5:
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opción no válida");
			}
			
		}while (opcion!=5);// mientras no seleccione 5

	}
	
	static void presentarMenu() {
		String textoMenu =""" 
				
				
				Elige una opción:
				
					1.- Nueva nota
					2.- Calcular media
					3.- Notas extremas
					4.- Ver todas
					5.- Salir """;
		System.out.println(textoMenu);
		
	}
	
	static void agregarNota() {
		double nota;
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce nota:");
		nota=sc.nextDouble();
		service.agregarNota(nota);
	}
	
	static void presentarMedia () {
		System.out.println("La media es: "+ service.media());
	}
	
	static void presentarExtremas() {
		System.out.println("Nota más alta: "+ service.max());
		System.out.println("La media es: "+ service.min());
	}
	
	static void mostrarNotas () {
		/*Double[] notas=service.obtenerNotas();
		System.out.println("Las notas son: ");
		for (Double n:notas) {
			System.out.println(n);	
		}*/
		System.out.println("La notas son: "+ Arrays.toString(service.obtenerNotas()));
	}

}
