package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import service.CuentasService;

class CuentasServiceTest {
	static CuentasService service;
	
	

	@Test
	void testCuentaRepetida() {
		assertTrue(service.cuentaRepetida("ES4720800136253000145866"));
		assertTrue(service.cuentaRepetida("ES1111111111111111111111"));
		
	}

	@Test
	void testCuentasPorDivisa() {
		assertEquals(2, service.cuentasPorDivisa("EUR"));
		
	}

}
