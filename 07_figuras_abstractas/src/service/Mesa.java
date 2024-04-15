package service;

public class Mesa implements Operaciones{
	private double alto;
	private double ancho;
	private double largo;
	

	public Mesa(double alto, double ancho, double largo) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}
	

	@Override
	public void girar(double grados) {
		alto=+grados;
		
	}

	@Override
	public double invertir() {
		ancho=ancho*1;
		return ancho*alto;
	}

	

}
