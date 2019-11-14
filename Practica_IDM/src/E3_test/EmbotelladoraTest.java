package E3_test;

import org.junit.*;

import E3_program.Embotelladora;

public class EmbotelladoraTest {
	
	private int litros;  
	private int pequenas;
	private int grandes;

	@Before      // Set up - Called before every test method.
	public void setUp()
	{
	   litros = 0;
	   pequenas = 0;
	   grandes = 0;
	}
	
	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
	   litros = 0;
	   pequenas = 0;
	   grandes = 0; 
	}
	
	@Test
	public void testInitial()
	{
		pequenas = 5;
		grandes = 5;
		litros= 5;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}

}