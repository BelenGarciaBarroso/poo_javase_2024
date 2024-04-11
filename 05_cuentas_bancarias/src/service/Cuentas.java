package service;

public class Cuentas {
	private double saldo;

	public Cuentas(double saldo) {
		super();
		this.saldo = saldo;
	}
	public Cuentas() {
		saldo = 100;	}
	
	public void extraer (double cantidad) {
		saldo-=cantidad;
	}
	public void ingresar (double cantidad) {
		saldo+=cantidad;
	}
	public double obtenerSaldo() {
		return saldo;		
	}

}
