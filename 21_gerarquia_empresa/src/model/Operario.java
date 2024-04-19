package model;

import java.time.LocalDate;
import java.time.Period;

public class Operario extends Empleado {
	private int nivel;
	

	@Override
	public void incentivar() {
		if (this.getEdad()>30 && nivel>2 ) {
			this.setSalario(this.getSalario()+(2*BONO));
		}else {
			if ((this.getEdad()>30 || nivel>2 )) {
				this.setSalario(this.getSalario()+(BONO));
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