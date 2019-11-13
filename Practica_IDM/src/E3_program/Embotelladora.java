package E3_program;

public class Embotelladora {
	
	
	private int grandesUsadas;
	private int pequenasUsadas;

	//@param  pequenas: número de botellas en almacén de 1L
	//@param grandes : número de botellas en almacén de 5L
	//@param total : número total de litros que hay que embotellar
	//@return Devuelve: número de botellas pequenas necesarias para embotellar el total de lı́quido, teniendo en cuenta que hay que minimizar el número de botellas pequenas: primero se rellenan las grandes
	//@throw Eleva la excepción NoSolution si no es posible embotellar todo el lı́quido
	public int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		grandesUsadas = Math.min((int)Math.ceil(total/grandes) , grandes);
		
	}
	
}
