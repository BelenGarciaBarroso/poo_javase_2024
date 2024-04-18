package model;

import java.time.LocalDate;
import java.time.Period;

public class Operario extends Empleado {
	private int nivel;

	@Override
	public void incentivar() {
		Period p=Period.between(this.getFechaIngreso(), LocalDate.now());

		if (p.getYears()>30 && nivel>2 ) {
			this.setSalario(this.getSalario()+(2*bono));
		}else {
			if ((p.getYears()>30 || nivel>2 )) {
				this.setSalario(this.getSalario()+(bono));
			}
		}
	}

	
	public void actualizarNivel() {
		Period p=Period.between(this.getFechaIngreso(), LocalDate.now());
		if (this.nivel ==5) {
			return;
		}else {
			if (p.getYears()>2)  {
				this.nivel++;
			}		
		}

	}
}