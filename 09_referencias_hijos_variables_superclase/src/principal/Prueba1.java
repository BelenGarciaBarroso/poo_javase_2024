package principal;
class C1 {
	int a=3;
	public void print() {
		
		System.out.println("c1");
	}
}
class C2 extends C1 {
	int a=5;
	public void print() {
		System.out.println("c2");
	}
	public void send() {
		System.out.println("Enviando....");
	}
}

public class Prueba1 {
	public static void main(String[] args) {
		C1 c= new C2();
		c.print(); // c2
		//c.send(); este tipo de método no está definido en superclase
		System.out.println(c.a); // 3
	}
}
