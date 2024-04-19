package model;

import java.time.LocalDate;

public class Cuenta {
	private String numCuenta;
	private String titula;
	private LocalDate fechaApertura;
	private String divisa;
	private double saldo;
	public Cuenta(String numCuenta, String titula, LocalDate fechaApertura, String divisa, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.titula = titula;
		this.fechaApertura = fechaApertura;
		this.divisa = divisa;
		this.saldo = saldo;
	}
	public Cuenta() {
		super();
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getTitula() {
		return titula;
	}
	public void setTitula(String titula) {
		this.titula = titula;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public String getDivisa() {
		return divisa;
	}
	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
