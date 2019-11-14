package E4_program;

import java.security.InvalidParameterException;

public class DescuentoBlackFriday {

	// @param precioOriginal es el precio de un producto marcado en la etiqueta
	// @param porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
	// @return precio el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica un descuento de porcentajeDescuento
	// @throw InvalidParameter si precioOriginal es negativo
	
	public static double precioFinal(double precioOriginal, double porcentajeDescuento) throws InvalidParameterException {
		return precioOriginal * (1 - (porcentajeDescuento/100));
	}
	
}
