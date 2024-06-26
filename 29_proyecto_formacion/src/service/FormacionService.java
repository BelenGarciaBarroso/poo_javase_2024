package service;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Alumno;
import model.Curso;

public class FormacionService {

	List<Curso> cursos=new ArrayList<>(List.of(
			new Curso("Java","Programación",120,LocalDate.of(2014, 11, 10),LocalDate.of(2015, 1, 30),List.of(new Alumno("a1",5.6),
					new Alumno("a2",8),new Alumno("a8",6),new Alumno("b7",4))),
			new Curso("Angular","Programación",80,LocalDate.of(2021, 06, 10),LocalDate.of(2021, 9, 8),List.of(new Alumno("r2",3.6),
					new Alumno("a9",7),new Alumno("b4",5))),
			new Curso("HTML y CSS","Web",60,LocalDate.of(2019, 03, 15),LocalDate.of(2019, 5, 30),List.of(new Alumno("r9",4),
					new Alumno("v4",6),new Alumno("h1",3),new Alumno("s9",5),new Alumno("k2",2))),
			new Curso("Oracle","Bases de datos",100,LocalDate.of(2020, 10, 20),LocalDate.of(2021, 2, 12),List.of(new Alumno("s10",9),
					new Alumno("r1",4))),
			new Curso("SQL","Bases de datos",40,LocalDate.of(2018, 02, 06),LocalDate.of(2018, 4, 20),List.of(new Alumno("y6",7),
					new Alumno("u7",2),new Alumno("b8",4),new Alumno("t2",6))),
			new Curso("Python","Programación",90,LocalDate.of(2016, 10, 23),LocalDate.of(2017, 3, 30),List.of(new Alumno("l9",7.6),
					new Alumno("g5",3),new Alumno("n1",8.4),new Alumno("x6",5.9)))
			
			)); 
	
	//añade un nuevo curso si no coinciden mismo nombre y fecha de inicio
//	public boolean agregarCurso (Curso curso) {
//		if (cursos.stream()
//			.noneMatch(a->a.getNombre().equals(curso.getNombre())&&a.getFechaInicio().equals(curso.getFechaInicio()))) {
//				return false;
//			}
//		cursos.add(curso);
//				
//	}


	//precio medio de cursos por temática
	public double preciomedioCursoTematica (String tematica) {
		return cursos.stream()
				.filter(n->n.getTematica().equalsIgnoreCase(tematica))
				.collect(Collectors.averagingDouble(n->n.getPrecio()));
	}
	 
	
	//total (int)cursos finalizados antes de determinada fecha
	public int cursosFinalizadosFecha (LocalDate fecha) {
		return (int)cursos.stream() // con (int) convetimos el dato count que es long a int
				.filter(n->n.getFechaFin().isBefore(fecha))
				.count();
	}
	
	
	//lista de cursos de la temática recibida como parámetro
	public List<Curso> listaCursoTematica (String tematica) {
		return cursos.stream()
				.filter(n->n.getTematica().equals(tematica)) //Stream<String>
				.collect(Collectors.toList());
		
	}
	 
	
	//conjunto de tematicas
	
	public Set<String> tematicas () {
		return cursos.stream()
				.map(n->n.getTematica())
				.distinct()
				.collect(Collectors.toSet());
	}
	 
	
	//lista de cursos cuyos precios se encuentran entre los dos valores recibidos como parámetros
	public List<Curso> cursosPorPrecios (double precio1, double precio2) {
		return cursos.stream()
				.filter(n->n.getPrecio()>=precio1 && n.getPrecio()<=precio2)
				.collect(Collectors.toList());
	}
	
	//lista de cursos cuya duración sea inferior a los meses que se reciben como parámetro
	public List<Curso> listaCursosEntreFechas (int meses) {
		return cursos.stream()
				.filter(n->ChronoUnit.MONTHS.between(n.getFechaInicio(), n.getFechaFin()) < meses)
				.collect(Collectors.toList());
	}
	 
	 
	//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor el nombre del curso
	public Map<Integer,String> tablaCursos() {
		return cursos.stream()
				.collect(Collectors.toMap((n->(int)ChronoUnit.MONTHS.between(n.getFechaInicio(), n.getFechaFin())), n->n.getNombre()));
				//.collect(Collectors.toMap(n->Period.between(c.getFechaInicio(), c.getFechaFin()).toTotalMonths(), Curso::getNombre));
	}
	
	//Tabla de cursos, donde la clave sea la duración del curso(en meses) y el valor la lista de cursos con dicha duración
	public Map<Integer,List<Curso>> tablaListaCursos(){
		 return cursos.stream()
				 .collect(Collectors.groupingBy(c->(int)Period.between(c.getFechaInicio(), c.getFechaFin()).toTotalMonths()));
	 }
	
	
	 
	//tabla con los cursos divididos entre caros y baratos. Caros, los que superen el precio recibido como parámetro
	//baratos los que no lo superen o lo igualen
	public Map<Boolean,List<Curso>> cursosCarosBaratos (double precio) {
		return cursos.stream()
			.collect(Collectors.partitioningBy(n->n.getPrecio()<=(precio)));
	}

	 
	//cadena con los nombres de todos los cursos, separados por una coma
	public String nombresCursos() {
		return cursos.stream()
				.map(n->n.getNombre())
				.distinct()
				.collect(Collectors.joining(","));
	}
	 
	// nota media de un curso
	public double mediaCurso(String curso) {
		/*return cursos.stream ()//Stream<Curso>
			 .filter(c->c.getNombre().equals(curso))//Stream<Curso>
			 .findFirst() //Optional<Curso>
			 .orElse(new Curso()) //Curso
			 .getAlumnos() //List<Alumno>
			 .stream()//Stream<Alumno>
			 .collect(Collectors.averagingDouble(a->a.getNota()));//double*/
		return cursos.stream()
				.filter(n->n.getNombre().endsWith(curso)) //Stream<Curso>
				.flatMap(n->n.getAlumno().stream() // Stream<Alumno>
				.map(s->s.getNota()))
				.collect(Collectors.averagingDouble(n->n));			
	}
	 
	//lista con los nombres de todos los alumnos
	public List<String> nombresAlumnos() {
		return cursos.stream()
				.flatMap(n->n.getAlumno().stream() //Stream<Alumno>
				.map(s->s.getNombre())) //Stream<String>
				.toList();
	}
	  
	//lista de alumnos matriculados en cursos de determinada temática
	public List<Alumno> alumnosMatriculados (String tematica) {
		return cursos.stream()
				.filter(n->n.getTematica().equals(tematica)) //Sacamos la temática
				.flatMap(n->n.getAlumno().stream()) // Stream<Alumno>
				.toList(); //lo convertimos a List
	}
	 
	
	//alumno con mayor nota
	public double alumnoNotaMayor() {
		return cursos.stream()
				.flatMap(n->n.getAlumno().stream()) //Stream<Alumno>
				//.map(s->s.getNota())
				.mapToDouble(n->n.getNota()) //Stream<double>
				.max()
				.orElse(0);
	}
	
	
	public static void main(String[] args) {
		Map<Integer,String> cursosLista=new HashMap<>();
		//cursosLista=tablaCursos();
		Set<Integer> claves =cursosLista.keySet();
		for (Integer n:claves) {
			System.out.println(n);
		}
		Collection<String> valores=cursosLista.values();
		for (String n:valores) {
			System.out.println(n);
		}
		
			
		

	}
	 

}
