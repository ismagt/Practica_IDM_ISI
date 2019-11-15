package E2_program;

import java.security.InvalidParameterException;
import java.util.Hashtable;

public class RomanNumeral 
{
	static Hashtable <String, Integer> numerosRomanos = new Hashtable <String, Integer>();

	/*
	 * Método para llenar el hashtable con los números romanos básicos
	 * 
	 * @return numerosRomanos: hashtable que contiene los números romanos básicos asociados a su valor en decimal
	 */
	public static void llenarHashtable(){
		numerosRomanos.put("I", 1);
		numerosRomanos.put("V", 5);
		numerosRomanos.put("X", 10);
		numerosRomanos.put("L", 50);
		numerosRomanos.put("C", 100);
		numerosRomanos.put("D", 500);
		numerosRomanos.put("M", 1000);
	}
	
	
	/*
	 * Método para llenar el hashtable con los números romanos básicos
	 * 
	 * @return numerosRomanos: hashtable que contiene los números romanos básicos asociados a su valor en decimal
	 */
	public static int restarTerminos(String romano, int suma){
	    if (romano.contains("IV"))
	        suma-=2;
	    if (romano.contains("IX"))
	        suma-=2;
	    if (romano.contains("XL"))
	    	suma-=20;
	    if (romano.contains("XC"))
	    	suma-=20;
	    if (romano.contains("CD"))
	    	suma-=200;
	    if (romano.contains("CM"))
	    	suma-=200;
	    return suma;
	}
	
	/*
	 * Metodo para comprobar que no se violan las normas de los numeros romanos
	 * 
	 * @return True si cumple con las reglas
	 */
	public static boolean esRomano(String romano){

	    return !romano.contains("IIII") && !romano.contains("XXX") && !romano.contains("CCC")
	    		&& !romano.contains("MMM") && !romano.contains("VV") && !romano.contains("LL")
	    		&& !romano.contains("DD");
	}
	
	
	/*
	 * Método para llevar a cabo la conversión de números romano a decimal
	 * 
	 * @param entrada: Cadena que se desea convertir
	 * @return decimal: Numero en base 10
	 * @throws InvalidParameterException
	 */
	public static int convertir(String entrada) throws InvalidParameterException{
		String romano = entrada.replaceAll(" ","");	//elimina los espacios en blanco al inicio y al final de la cadena
		if (!esRomano(romano))
			throw new InvalidParameterException();
		
		llenarHashtable();
		
		int decimal = 0;	//variable de retorno
		int valor = 0;	//equivalente en decimal a una letra determinada del número romano pasado como parámetro
			
		
		for(int i = 0; i< entrada.length(); i++)	//Se recorre la cadena ingresada como parámetro
		{
			String letra = Character.toString(romano.charAt(i)).toUpperCase();
			
			if(numerosRomanos.containsKey(letra)){
				decimal = decimal + numerosRomanos.get(letra);
			}else {
				throw new InvalidParameterException();
			}
		}
		if (decimal == 0)
			throw new InvalidParameterException();
		decimal = restarTerminos(romano, decimal);
		return decimal;
	}
}