package view;

import java.util.Scanner;

public class MenuCuentas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		double saldoInicial;
		double limite;
		System.out.println("Introduce el saldo inicial: ");
		saldoInicial=sc.nextInt();
		System.out.println("Introduce el límite: ");
		limite=sc.nextInt();
		do {
			presentarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
				case 1:
					ingresar();
					break;
				case 2:
					extraer();
					break;
				case 3:
					saldoYMovimientos();
					break;
				case 4:
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opción no válida");
			}

		}while (opcion!=4);

	}
	// PRESENTAR MENU Y ELEGIR OPCIÓN ***************************************
	static void presentarMenu() {
	String textoMenu =""" 
				
				
		Elige una opción:
				
			1.- Ingresar
			2.- Extraer
			3.- Saldo y movimientos
			4.- Salir """;
	System.out.println(textoMenu);
		
	}
	
	static void ingresar () {
		CuentaMovimientos 
		
	}
	
	static void extraer () {
		
	}
	
	static void saldoYMovimientos() {
		
	}

}
