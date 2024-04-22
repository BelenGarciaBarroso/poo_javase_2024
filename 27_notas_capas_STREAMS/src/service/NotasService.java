package service;

import java.util.ArrayList;

public class NotasService {
	// Aquí se definen las variables comunes a todos los métodos que vayamos a hacer
	ArrayList<Double> notas=new ArrayList<Double>();
	
	public void agregarNota (double nota) {
		notas.add(nota);
	}
	
	public double media() {
		return (notas.stream()
				.mapToDouble(n->n) // - los convierte en primitivos
				.average() //OptionalDouble -calcula la media
				.orElse(0)
				);
	}
	
	public double max() {
		return (notas.stream()
				.mapToDouble(n->n) // - los convierte en primitivos double
				.max() //OptionalDouble -calcula el máximo
				.orElse(0));
		
	}
	
	public double min() {
		return (notas.stream()
				.mapToDouble(n->n) // - los convierte en primitivos double
				.min() //OptionalDouble -calcula la mínimo
				.orElse(0));
	}
	
	public int totalAprobados() {
		return (int)notas.stream()
				.filter(n->n>=5) 
				.count();
	}
		
	
	public Double[] obtenerNotas() {
		/*double [] todas=new double [notas.size()]; // con public ->double
		for (int i=0;i<notas.size();i++) {
			todas[i]=notas.get(i);
		}
		return todas;*/
		return notas.toArray(new Double[0]); // con public ->Double
	}
	
	

}
