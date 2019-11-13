package E1_test;
import static org.junit.Assert.*;
import org.junit.*;

import E1_program.Bisiesto;

import java.util.*;

public class BisiestoTest {
	
private int ano;  

@Before      // Set up - Called before every test method.
public void setUp()
{
   ano = new Integer(0);
}

@After      // Tear down - Called after every test method.
public void tearDown()
{
   ano = 0;  
}

@Test(expected=NullPointerException.class)
public void testForNullAno()
{
   try {
	   Bisiesto.esBisiesto ((Integer) null);
   } catch (NullPointerException e) {
	   return;
   }
   fail ("NullPointerException expected");
}

}