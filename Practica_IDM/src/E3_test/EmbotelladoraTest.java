package E3_test;

import static org.junit.Assert.assertEquals;

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
	public void testInitial(expected=NoSolution.class)
	{
		pequenas = 0;
		grandes = 0;
		litros= 5;
		assertEquals(NoSolution.class,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void noHayBotellas(expected=NoSolution.class)
	{
		pequenas = 0;
		grandes = 0;
		litros= 5;
		assertEquals(NoSolution.class,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void UnaBotellaGrande()
	{
		pequenas = 0;
		grandes = 1;
		litros= 5;
		assertEquals(0,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}

	@Test
	public void UnaBotellapequeña(expected=NoSolution.class)
	{
		pequenas = 1;
		grandes = 1;
		litros= 1;
		assertEquals(1,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void dosBotellapequeña()
	{
		pequenas = 2;
		grandes = 1;
		litros= 2;
		assertEquals(2,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void sieteLitros(expected=NoSolution.class)
	{
		pequenas = 2;
		grandes = 1;
		litros= 7;
		assertEquals(2,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void sieteLitros_dosPequeñas(expected=NoSolution.class)
	{
		pequenas = 2;
		grandes = 0;
		litros= 7;
		assertEquals(NoSolution.class,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void sieteLitros_cuatroPequeñas(expected=NoSolution.class)
	{
		pequenas = 4;
		grandes = 0;
		litros= 7;
		assertEquals(NoSolution.class,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}
	
	@Test
	public void sieteLitros_unaGRandes(expected=NoSolution.class)
	{
		pequenas = 1;
		grandes = 0;
		litros= 7;
		assertEquals(NoSolution.class,Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros));
	}

}