package E3_test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import E3_program.*;

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
	
	@Test (expected=NoSolution.class)
	public void testInitial()
	{
		pequenas = 0;
		grandes = 0;
		litros= 5;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test(expected=NoSolution.class)
	public void noHayBotellas()
	{
		pequenas = 0;
		grandes = 0;
		litros= 5;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
	public void UnaBotellaGrande()
	{
		pequenas = 0;
		grandes = 1;
		litros= 5;
		assertEquals(0,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}

	@Test()
	public void UnaBotellapequena()
	{
		pequenas = 1;
		grandes = 1;
		litros= 1;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
	public void dosBotellapequena()
	{
		pequenas = 2;
		grandes = 1;
		litros= 2;
		assertEquals(2,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void sieteLitros()
	{
		pequenas = 2;
		grandes = 1;
		litros= 7;
		assertEquals(2,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test(expected=NoSolution.class)
	public void sieteLitros_dosPequenas()
	{
		pequenas = 2;
		grandes = 0;
		litros= 7;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test(expected=NoSolution.class)
	public void sieteLitros_cuatroPequenas()
	{
		pequenas = 4;
		grandes = 0;
		litros= 7;
		assertEquals(0,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test(expected=NoSolution.class)
	public void sieteLitros_unaGrandes()
	{
		pequenas = 1;
		grandes = 0;
		litros= 7;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}

}