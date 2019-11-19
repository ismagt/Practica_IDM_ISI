package E2_test;
import static org.junit.Assert.*;

import org.junit.*;

import E2_program.*;

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
	
	
	@Test(expected=InvalidParameter.class)
	public void noIRepetidas()
	{
		numeroRomano="IIII";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void noMRepetidas()
	{
		numeroRomano="MMMMM";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void noVRepetidas()
	{
		numeroRomano="XVV";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void noDRepetidas()
	{
		numeroRomano="MDD";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void contieneLetrasRomanos()
	{
		numeroRomano="lafjjkf";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test()
	public void iAntesV()
	{
		numeroRomano="XIV";
		assertEquals(14,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void iAntesD()
	{
		numeroRomano="XID";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test()
	public void xAntesL()
	{
		numeroRomano="CXL";
		assertEquals(140,RomanNumeral.convertir(numeroRomano));
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void xAntesl()
	{
		numeroRomano="CXM";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void VL()
	{
		numeroRomano="VL";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void VIV()
	{
		numeroRomano="VIV";
		RomanNumeral.convertir(numeroRomano);
		
	}
	
	@Test(expected=InvalidParameter.class)
	public void XXM()
	{
		numeroRomano="XXM";
		RomanNumeral.convertir(numeroRomano);
		
	}
    
	@Test(expected = InvalidParameter.class)
	public void testForEmptyInput()
	{
		numeroRomano="";
		RomanNumeral.convertir(numeroRomano);
	}
	
	@Test(expected = InvalidParameter.class)
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