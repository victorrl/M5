import static org.junit.Assert.*;

import org.junit.Test;


public class SumaTest {
	Suma obj= new Suma();

	@Test
	public void testSumar() {
		double resultado=obj.Sumar(5, 7);
		assertEquals("Resultado esperado: 12",12,resultado,1);
	}


	@Test
	public void testIncrementar(){
		int resultado=obj.Incrementar(5);
		assertEquals("Resultado esperado: 6",6,resultado,0.1);
	}	
}


