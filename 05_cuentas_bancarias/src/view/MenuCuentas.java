package view;

import java.util.ArrayList;
import java.util.Scanner;

import service.CuentaMovimientos;
import service.Movimientos;



public class MenuCuentas {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		double saldoInicial;
		System.out.println("Introduce el saldo inicial: ");
		saldoInicial=sc.nextInt();
		double limite=saldoInicial/2;
		CuentaMovimientos miCuenta = new CuentaMovimientos(saldoInicial,limite);
		/*System.out.println("Introduce el límite: ");
		limite=sc.nextInt();*/
		do {
			presentarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
				case 1:
					ingresar(miCuenta);
					break;
				case 2:
					extraer(miCuenta);
					break;
				case 3:
					saldoYMovimientos(miCuenta);
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
	
	static void ingresar (CuentaMovimientos miCuenta) {
		Scanner sc=new Scanner(System.in);
		double saldoIngresar;
		System.out.println("Indica el importe a ingresar: ");
		saldoIngresar=sc.nextDouble();
		miCuenta.ingresar(saldoIngresar);
		miCuenta.ajustarLimite();
	}
	
	static void extraer (CuentaMovimientos miCuenta) {
		Scanner sc=new Scanner(System.in);
		double saldoExtraer;
		System.out.println("Indica el importe a sacar: ");
		saldoExtraer=sc.nextDouble();
		miCuenta.extraer(saldoExtraer);
		miCuenta.ajustarLimite();
		
	}
	
	static void saldoYMovimientos(CuentaMovimientos miCuenta) {
		ArrayList<Movimientos> listado= miCuenta.obtenerMovimientos();
		for (Movimientos m:listado) {
			System.out.println(m.getFecha()+"-"+m.getTipo()+"-"+m.getCantidad());
		}
		System.out.println("El saldo actual es: "+miCuenta.obtenerSaldo());
		
	}

}
