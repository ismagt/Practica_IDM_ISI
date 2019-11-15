package E3_program;

public class Embotelladora {
	

	//@param  pequenas: nÃºmero de botellas en almacÃ©n de 1L
	//@param grandes : nÃºmero de botellas en almacÃ©n de 5L
	//@param total : nÃºmero total de litros que hay que embotellar
	//@return Devuelve: nÃºmero de botellas pequenas necesarias para embotellar el total de lÄ±Ì�quido, teniendo en cuenta que hay que minimizar el nÃºmero de botellas pequenas: primero se rellenan las grandes
	//@throw Eleva la excepciÃ³n NoSolution si no es posible embotellar todo el lÄ±Ì�quido
	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		int grandesUsadas = 0;
		if (grandes != 0 && total >= 5) 
			grandesUsadas = Math.min((int)Math.floor(total/grandes) , grandes);
		int litrosRestantes = total - grandesUsadas*5;
		int pequenasUsadas = Math.min(litrosRestantes, pequenas);
		litrosRestantes = litrosRestantes - pequenasUsadas;
		if (litrosRestantes != 0)
			throw new NoSolution();
		return pequenasUsadas;
	}

	
}
