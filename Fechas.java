package examen2;
/**
 * @author Juan Jimenez Garcia
 * @version 1.0
 */

public class Fechas {
	 /**
	 * Esto nos indica como tienen que estar las fechas, por dia, mes y por ultimo año
	 * @param dia, tiene que ser mayor que 0
	 * @param mes, tiene que ser mayor que 0
	 * @param anio, tiene que ser mayor que 0
	 * @return si es true significa que es valido entonces la fecha estara correcta, si es false, la fecha estara incorrecta
	 */
	
	public static boolean fechaValida;
	public static boolean validarFecha(int dia, int mes, int anio){ 
		 fechaValida = false;
	
		
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}