package es.studium.ej3;

import java.util.Scanner;

public class CadenaMasLarga
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena[] = new String[10]; //Creamos una tabla para almacenar 10 cadenas
		String masLarga; //Creamos una cadena que va a almacenar la cadena m�s larga
		
		//Hacemos un for para pedir las 10 cadenas al usuario
		for(int i = 0; i < cadena.length; i++) { /*cadena.length corresponder�a en este caso a 10
		debido a que son las posiciones totales almacenadas en la tabla
		como el ordenador en si cuenta del 0 al 9, si pusieramos <= 10 nos dar�a un error de out of bound*/
			System.out.println("Inserte una cadena: ");
			cadena[i] = teclado.nextLine();	/*La i nos dar� el valor de la posici�n de la tabla 
			en cada vuelta*/
		}
		
		masLarga = cadena[0]; //Inicializamos la variable en una posici�n cualquiera
		
		//Hacemos un for para ir comparando cada cadena y averiguar la m�s larga
		for(int i = 0; i < cadena.length; i++) {
			if(cadena[i].replace(" ", "").length() > masLarga.replace(" ", "").length()) { /*Comparamos 
			la longitud de cada una de las cadenas almacenadas en la tabla y comprobamos si es mayor que 
			la que queremos que sea la m�s larga (todo esto sin espacios, por eso el replace)*/
				masLarga = cadena[i]; /*Almacenamos la cadena m�s larga en la variable masLarga. Se ir�
				modificando en cada vuelta si la anterior a ella, es m�s larga*/
			}
		}
		System.out.println("La cadena m�s larga es: "+ masLarga); //Mostramos por pantalla la cadena + larga
		teclado.close();

	}

}
