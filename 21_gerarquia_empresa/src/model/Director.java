package model;

import java.time.LocalDate;
import java.time.Period;

public class Director extends Empleado {
	private String departamento;
	private int personal;

	@Override
	public int incentivar() {
		Period p=Period.between(this.getFechaIngreso(), LocalDate.now());

		if (p.getMonths()>3 && personal>20 ) {
			this.setSalario(this.getSalario()+(2*bono);
		}else {
			if ((p.getMonths()>3 || personal>20 )) {
				this.setSalario(this.getSalario()+(bono);
			}
		}
		return 0;
	}
	

}
