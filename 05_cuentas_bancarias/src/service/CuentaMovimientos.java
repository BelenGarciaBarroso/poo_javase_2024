package service;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class CuentaMovimientos extends CuentaLimite {
	private ArrayList <Movimientos> movimientos= new ArrayList<Movimientos>();
	
	public CuentaMovimientos(double saldo, double limite) {
		super (saldo, limite);
	}
	public ArrayList<Movimientos> obtenerMovimientos() {
		return movimientos;
	}
	@Override
	public void extraer(double cantidad) {
		Movimientos m=new Movimientos (cantidad,LocalDateTime.now(), "extracción");
		super.extraer(cantidad);
	}
	@Override
	public void ingresar(double cantidad) {
		Movimientos m=new Movimientos(cantidad, LocalDateTime.now(), "ingreso");
		movimientos.add(m);
		super.ingresar(cantidad);
	}
	
	

}
