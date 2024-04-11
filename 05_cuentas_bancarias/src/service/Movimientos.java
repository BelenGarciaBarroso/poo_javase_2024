package service;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Movimientos {
	private double cantidad;
	private LocalDateTime fecha;
	private String tipo;
	
	

}
