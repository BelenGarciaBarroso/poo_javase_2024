package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

public class Director extends Empleado {
	private String departamento;
	private int personal;

	@Override
	public void incentivar() {
		Period p=Period.between(this.getFechaIngreso(), LocalDate.now());

		if (p.getMonths()>30 && personal>20 ) {
			this.setSalario(this.getSalario()+(2*bono));
		}else {
			if ((p.getMonths()>30 || personal>20 )) {
				this.setSalario(this.getSalario()+(bono));
			}
		}
	}
	

}
