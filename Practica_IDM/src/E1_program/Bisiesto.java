package E1_program;

import java.security.InvalidParameterException;

public class Bisiesto{

	public static boolean esBisiesto(int ano) throws InvalidParameterException {
		if(ano != 0) {
			if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
				return true;
			else
				return false;
		}else
			throw new  InvalidParameterException();
	}
}