package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Cuenta;

public class CuentasService {
	List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
		            "Fernando López Gómez", LocalDate.parse("2018-04-14"),
		            "EUR", Double.valueOf("125477.44")),
		    new Cuenta("ES3520800014523000687719",
		            "Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
		            "EUR", Double.valueOf("9465.59")),		
		    new Cuenta("ES4720800136253000145866",
		            "Francisco González Fernández", LocalDate.parse("2000-11-03") ,
		            "JPY", 3258745.7),
		   new Cuenta("8747-369", "Kenji Nakamura",
				   LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 
	
	// Método que a partir de una cuenta nos indica si existe o no
	public boolean cuentaRepetida (String cuenta) {
		boolean existe;
		existe= cuentas.stream().anyMatch(n->n.getNumCuenta().equals(cuenta));
		return existe;
	}
	
	// Método que a partir de nombre de divisa, nos indique cuántas cuentas hay en dicha divisa
	public int cuentasPorDivisa (String divisa) {
		return (int) cuentas.stream()
				.filter(n->n.getDivisa().equals(divisa))
				.count();				
	}
	
	// Método que a partir de una fecha, nos indique cuántas
	// cuentas se crearon a partir de dicha fecha
	public int contarCuentasDespuesFecha (LocalDate fecha) {
		return (int) cuentas.stream()
				. filter(c->c.getFechaApertura().isAfter(fecha))
				.count();
	}
	
	// Método que devuelva la cuenta asociada a un determinado número
	public Cuenta buscarCuenta (String numero) {
		return cuentas.stream()
				.filter (c->c.getNumCuenta().equals(numero)) // Stream<Cuenta>
				.findFirst() // Optiona<Integer>
				.orElse(null);
	}
	
	// Método que devuelva la cuenta asociada a un determinado titular
	public Optional <Cuenta> buscarCuentaPorTitular (String titular) {
		return cuentas.stream()
				.filter (c->c.getNumCuenta().equals(titular)) // Stream<Cuenta>
				.findFirst(); // Optional<Integer>
	}
		
	// Método que devuelva la cuenta con menor saldo
	public Cuenta cuentaMenorSaldo () {
		/*return cuentas.stream() // Aquí la ordena y saca el primero, que es el menor
				.sorted((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.findFirst()// Optional<Cuenta>
				.orElse(null);*/
		/*return cuentas.stream()// Aquí copara los saldos y saca el menor
				.min((a,b)->Double.compare(a.getSaldo(), b.getSaldo()))
				.orElse(null);*/
		return cuentas.stream() // Aquí compara los saldo con una función double
				.min(Comparator.comparingDouble(c->c.getSaldo()))
				.orElse(null);		
	}
	
	// método que a partir de nombre de divisa, devuelva las cuentas que hay de dicha divisa
	public List<Cuenta> listaCuentasPorDivisa (String divisa) {
		return cuentas.stream()
				.filter(n->n.getDivisa().equalsIgnoreCase(divisa))
				//.collect(Collectors.toList() -- Es igual a lo de abajo
				.toList();		
	}
	
	// Método que devuelva un MaP con los números de cuentas como 
	// claves y saldo como valor.
	
	public Map<String,Double> MapCuenta () {
		return cuentas.stream()
				.collect(Collectors.toMap(c->c.getNumCuenta(), c->c.getSaldo()));
		
	}
	
	// Método que devuelve una tabla agrupada por divisa:
	public Map<String,List<Cuentas>> cuentasPorDivisa() {
		return cuentas.stream()
				.collect(Collectors.groupingBy(c->c.getDivisa()));

	}
		
	
}
