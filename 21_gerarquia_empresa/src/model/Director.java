package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

public class Director extends Empleado {
	private String departamento;
	private int personal;
	

	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super(nombre, edad, fechaIngreso, salario);
	}


	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario, String departamento,
			int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}
	
	


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public int getPersonal() {
		return personal;
	}


	public void setPersonal(int personal) {
		this.personal = personal;
	}


	@Override
	public void incentivar() {
		Period p=Period.between(this.getFechaIngreso(), LocalDate.now());

		if (p.toTotalMonths()>30 && personal>20 ) {
			this.setSalario(this.getSalario()+(2*BONO));
		}else {
			if ((p.toTotalMonths()>30 || personal>20 )) {
				this.setSalario(this.getSalario()+(BONO));
			}
		}
	}
	

}
