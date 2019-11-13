package E1_test;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestoTest {
	
private int ano;   // Test fixture

@Before      // Set up - Called before every test method.
public void setUp()
{
   ano = new Integer(0);
}

@After      // Tear down - Called after every test method.
public void tearDown()
{
   ano = 0;  // redundant in this example!
}

@Test(expected=NullPointerException.class)
public void testForNullAno()
{
   try {
      Bisiesto.esbisiesto (null);
   } catch (NullPointerException e) {
      return;
   }
   fail ("NullPointerException expected");
}

}