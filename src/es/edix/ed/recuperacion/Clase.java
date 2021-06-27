package es.edix.ed.recuperacion;
import org.junit.platform.commons.util.*;

import org.junit.platform.commons.util.StringUtils;


/**
 * Esta clase contiene dos m�todos, Saludar y Matematicas. <br>
 * <ul>
 * <li>Saludar detecta el tipo de par�metro y, en funci�n de esto, devuelve un valor u otro.<br>
 * 
 * Excepciones metodo Saludar
 * <ol>
 * <li> Si no consigue convertir el par�metro en N�mero devuelve una excepci�n NumberFormatException <br>
 * </ol>
 * <li>Matematicas realiza operaciones matem�ticas sencillas como sumar, restar, multiplicar y dividir introduciendo 3 par�metros.<br>
 * 
 * Defaulter metodo Matematicas
 * <ol>
 * <li> Si la operaci�n no est� dentro de las posibilidades nos devuelve un valor combinado de los N�meros introducidos.<br>
 * </ol>
 * </ul>
 * 
 * @author luzlo
 * @version 1.0
 * @since June2021
 * 
 */



public class Clase {

	private static final String NFE = "Lo que me mandas es un numero";
	private static final String BLANK = "Lo que me mandas est� vac�o";
	
/**

 	* Recibe un par�metro de tipo String, intenta convertirlo en tipo N�mero, si lo consigue nos devuelve distintos mensajes.<br>
 	* Sino lo consigue nos devuelve el saludo.
 	* 
 	*
 	* @param nombre tipo String. El nombre que quieres que salga en el saludo.
 	* @return  
 	* <ul>
 	* <li> Si consigue convertir el par�metro a Int devuelve el mensaje tipo String:<br>
 	* "Lo que me mandas es un numero"<br>
 	* 
 	* <li> Si el par�metro est� vac�o devuelve el mensaje tipo String:<br>
 	* 
 	* "Lo que me mandas est� vac�o"<br>
 	* 
 	* <li> Si no consigue convertirlo devuelve el saludo tipo String "Hola + parametro de entrada".<br>
 	* </ul>

*/

	public String saludar(String nombre){
		try {
			Integer.parseInt(nombre);
			return NFE;
		}catch (NumberFormatException e) {
		}
		if(StringUtils.isBlank(nombre)) {
			return BLANK;
		}
		return "Hola " + nombre;
	}
	

/**

 	* Recibe tres par�metros, dos de tipo Int y uno de tipo String. Los de tipo Int ser�n los n�meros con los que queremos opoerar<br>
 	* El de tipo String ser� la operaci�n que queremos realizar, sumar, restar, multiplicar o dividir.
 	* 
 	*

 	* @param x tipo Int. El n�mero con el que quieres operar.
 	* @param y tipo Int. El n�mero con el que quieres operar.
 	* @param op tipo String. La operaci�n que quieres realizar. Puede ser sumar, restar, multiplicar o dividir. 
 	* 
 	* @return  
 	* 
 	*<ul>
 	* <li> op Sumar: <br>
 	* Devuelve dato tipo Int con el resultado de la suma de x + y.<br>
 	* 
 	* <li> op Restar:<br>
 	* 
 	* Devuelve dato tipo Int el resultado de la resta de x - y.<br>
 	* 
 	* <li> op Multiplicar:<br>
 	* 
 	* Devuelve dato tipo Int el resultado de la multiplicaci�n de x * y.
 	* 
 	* <li> op Dividir: <br>
 	* 
 	* Devuelve dato tipo Int el resultado de la divisi�n de x / y. <br>
 	* 
 	* <li> op Otro dato: <br>
 	* 
 	* Devuelve un dato tipo double, primero convierte x e y en tipo String y tras esto le da el formato double con ambos n�meros y un punto (.) entre ambos.<br>
 	* Por ejemplo 3.2. En el caso de que x sea 3 e y sea 2.
 	* 
 	* </ul>
 	* 

*/
	
	public double matematicas(int x, int y, String op){
		switch (op) {
			case "sumar":
				return x+y;
			case "restar":
				return x-y;
			case "multiplicar":
				return x*y;
			case "dividir":
				return x/y;
			default:
				return Double.valueOf(String.format("%1d.%1d", x, y));
		}
	}
	
	

}


