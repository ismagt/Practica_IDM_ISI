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
		pequenas = 0;
		grandes = 0;
		litros= 5;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
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
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}

	@Test
	public void UnaBotellapequeña()
	{
		pequenas = 1;
		grandes = 1;
		litros= 1;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
	public void dosBotellapequeña()
	{
		pequenas = 2;
		grandes = 1;
		litros= 2;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
	public void sieteLitros()
	{
		pequenas = 2;
		grandes = 1;
		litros= 7;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
	public void sieteLitros_dosPequeñas()
	{
		pequenas = 2;
		grandes = 0;
		litros= 7;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
	public void sieteLitros_cuatroPequeñas()
	{
		pequenas = 4;
		grandes = 0;
		litros= 7;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}
	
	@Test
	public void sieteLitros_unaGRandes()
	{
		pequenas = 1;
		grandes = 0;
		litros= 7;
		Embotelladora.calculaBotellasPequenas(pequenas, grandes, litros);
	}

}