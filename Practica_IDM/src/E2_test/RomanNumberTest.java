package E2_test;
import static org.junit.Assert.*;
import java.security.InvalidParameterException;

import org.junit.*;

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
		numeroRomano="MMMMMCMXCIX";
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