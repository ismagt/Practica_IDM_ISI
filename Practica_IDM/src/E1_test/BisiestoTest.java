package E1_test;
import static org.junit.Assert.*;

import org.junit.*;

import E1_program.Bisiesto;
import E1_program.InvalidParameter;

import java.util.*;

public class BisiestoTest {
	
	private int ano;  

	@Before      // Set up - Called before every test method.
	public void setUp()
	{
	   ano = 0;
	}
	
	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
	   ano = 0;  
	}
	
	@Test(expected=InvalidParameter.class)
	public void testForAnoCero()
	{
		ano=0;
		Bisiesto.esBisiesto(ano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void testForNegativeAno()
	{
		ano=-1;
		Bisiesto.esBisiesto(ano);
		
	}

	@Test
	public void testForAnyAno()
	{
		ano=2000;
		Bisiesto.esBisiesto(ano);
		
	}

}