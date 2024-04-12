package view;

import service.Circulo;
import service.Triangulo;

public class FigurasMenu {
	static Triangulo tri=new Triangulo();
	static Circulo cir=new Circulo();
	public static void main(String[] args) {
		tri.setAltura(5);
		tri.setBase(10);
		
		System.out.println(tri.area());
		
		cir.setRadio(2);
		
		System.out.println(cir.area());

	}

}
