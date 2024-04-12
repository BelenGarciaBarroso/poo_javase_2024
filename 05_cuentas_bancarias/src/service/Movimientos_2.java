package service;

import java.time.LocalDateTime;

public class Movimientos_2 {
	private double cantidad;
	private LocalDateTime fecha;
	private String tipo;
	public Movimientos_2(double cantidad, LocalDateTime fecha, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
	}
	public Movimientos_2() {
		super();
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}