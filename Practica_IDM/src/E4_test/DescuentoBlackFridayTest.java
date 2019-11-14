package E4_test;

import org.junit.*;

import E3_program.Embotelladora;
import E4_program.DescuentoBlackFriday;

public class DescuentoBlackFridayTest {
	
	private double precioOriginal;
	private double descuento;

	@Before      // Set up - Called before every test method.
	public void setUp(){
		precioOriginal = 0;
		descuento = 0;
	}
	
	@After      // Tear down - Called after every test method.
	public void tearDown(){
		precioOriginal = 0;
		descuento = 0;
	}
	
	@Test
	public void testAlgorithm() {
		precioOriginal = 1.0;
		descuento = 10.0;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	


}