package testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.NotasService;

class TestNotasService {
	static NotasService service=new NotasService();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//añadimnos unas cuantas notas de prueba
		service.agregarNota(5);
		service.agregarNota(8);
		service.agregarNota(9);
		service.agregarNota(6);
		service.agregarNota(2);
	}
	
	@Test
	void testMedia( ) {
		assertEquals(6, service.media());
	}
	
	@Test
	void testMax () {
		assertEquals (9,service.max());
	}
	
	@Test
	void testMin() {
		assertEquals (2,service.min());
	}
	
	@Test
	void testObtenerNotas() {
		assertEquals(5,service.obtenerNotas().length);
		//assertArrayEquals(new Double[], null);
	}
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/

}
