package E4_test;

import java.security.InvalidParameterException;


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
		precioOriginal = 100;
		descuento = 2;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	
	@Test
	public void test1() {
		precioOriginal = 0.00000000001;
		descuento = -3;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	
	@Test
	public void test2() {
		precioOriginal = 0.00000000001;
		descuento = -3000;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	
	@Test
	public void test3() {
		precioOriginal = -1000000;
		descuento = 3000;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	
	@Test
	public void test4() {
		precioOriginal = -5;
		descuento = 0.33333333333333333;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	
	@Test
	public void test5() {
		precioOriginal = -5;
		descuento = 1;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	
	@Test
	public void test6() {
		precioOriginal = 0.1;
		descuento = 200;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	
	@Test
	public void test7() {
		precioOriginal = 0.1;
		descuento = 150;
		DescuentoBlackFriday.precioFinal(precioOriginal, descuento);
	}
	


}