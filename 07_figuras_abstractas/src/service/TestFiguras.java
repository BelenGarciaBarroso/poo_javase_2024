package service;

public class TestFiguras {

	public static void main(String[] args) {
		// crea un triángulo y un círculo con color
		// y propiedades , y después mostrar
		//el color y área de cada uno
		
		Circulo cr=new Circulo ("amarillo", 5);
		Triangulo tr= new Triangulo("marron", 5, 8);
		/*System.out.println("Color: "+cr.getColor());
		System.out.println("Color: "+cr.area());
		System.out.println("Color: "+tr.getColor());
		System.out.println("Color: "+cr.area());*/	
		imprimir(cr);
		imprimir(tr);
		
		//Llamada a método que recibe la interfaz
		operar(tr);
		operar (new Mesa(2,11,5));
	}

	public static void imprimir (Figura f) {
		System.out.println("Color: "+f.getColor());
		System.out.println("Área: "+f.area());
	}
	
	public static void operar (Operaciones op) {
		
		
	}
		
		

}
