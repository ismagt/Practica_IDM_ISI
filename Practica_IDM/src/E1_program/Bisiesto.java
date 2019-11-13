package E1_program;

import java.security.InvalidParameterException;

public class Bisiesto {

		public boolean esBisiesto(int ano) throws InvalidParameterException {
			if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
				return true;
			else
				return false;
		
		}
	

}
