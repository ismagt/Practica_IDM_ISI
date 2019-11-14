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
		System.out.println(RomanNumeral.convertir(numeroRomano));
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noIRepetidas()
	{
		numeroRomano="IIII";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noMRepetidas()
	{
		numeroRomano="MMMMM";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noVRepetidas()
	{
		numeroRomano="XVV";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void noDRepetidas()
	{
		numeroRomano="MDD";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void contieneLetrasRomanos()
	{
		numeroRomano="lafjjkf";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void iAntesV()
	{
		numeroRomano="XIV";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void iAntesv()
	{
		numeroRomano="XID";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void xAntesL()
	{
		numeroRomano="CXL";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void xAntesl()
	{
		numeroRomano="CXM";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void vl()
	{
		numeroRomano="VL";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void VIV()
	{
		numeroRomano="VIV";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameterException.class)
	public void XXM()
	{
		numeroRomano="XXM";
		RomanNumeral.convertir(numeroRomano);
		
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
		RomanNumeral.convertir(numeroRomano);
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testForNullInput()
	{
		numeroRomano=null;
		RomanNumeral.convertir(numeroRomano);
	}
}