package E2_test;
import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.*;

import E1_program.Bisiesto;
import E2_program.RomanNumeral;

import java.util.*;

public class RomanNumberTest {
	
	private String numeroRomano;  

	@Before      // Set up - Called before every test method.
	public void setUp()
	{
	   numeroRomano = "";
	}
	
	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
	   numeroRomano = "";  
	}
	
	@Test
	public void testForAnyNumber()
	{
		numeroRomano="IIII";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noIRepetidas()
	{
		numeroRomano="IIII";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noMRepetidas()
	{
		numeroRomano="MMMMM";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noVRepetidas()
	{
		numeroRomano="XVV";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noDRepetidas()
	{
		numeroRomano="MDD";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void contieneLetrasRomanos()
	{
		numeroRomano="lafjjkf";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void iAntesV()
	{
		numeroRomano="XIV";
		assertEquals(14,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void iAntesv()
	{
		numeroRomano="XID";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void xAntesL()
	{
		numeroRomano="CXL";
		assertEquals(140,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void xAntesl()
	{
		numeroRomano="CXM";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void vl()
	{
		numeroRomano="VL";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void VIV()
	{
		numeroRomano="VIV";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void XXM()
	{
		numeroRomano="XXM";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
		
	}
    
	@Test(expected = InvalidParameterException.class)
	public void testForEmptyInput()
	{
		numeroRomano="";
		RomanNumeral.convertir(numeroRomano);
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testForOutDomain()
	{
		numeroRomano="AAAA";
		assertEquals(InvalidParameterException.class,RomanNumeral.convertir(numeroRomano));
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testForNullInput()
	{
		numeroRomano=null;
		RomanNumeral.convertir(numeroRomano);
	}
}