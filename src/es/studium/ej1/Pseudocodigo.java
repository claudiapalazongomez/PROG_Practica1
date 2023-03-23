package es.studium.ej1;

public class Pseudocodigo
{

	public static void main(String[] args)
	{
		//Declaraci�n de nuestras variables de tipo int
		int n; 
		int a = 0;
		int b = 0;
		
		do {
			n = (int)(Math.random()*10+1); /*Math.random nos devuelve un n�mero aleatorio entre 0 y 1 
			de tipo double, por lo que debemos castearlo a int por tratar nuestra variable n 
			como tipo int. Luego lo multiplicamos por 10 para que nos cogiese un valor entre 0 y 9, 
			y al sumarle 1 a este n�mero tendremos finalmente un n�mero entre 1 y 10 que es lo que 
			nos pide el ejercicio en pseudoc�digo.*/
			a = a + n; //El valor que vaya adquiriendo n, se le va sumando a nuestra variable a
			b = b + 2; 
		} while(b != 20); //Cuando b alcance el valor de 20, se termina el bucle
		System.out.println((double)a/(double)b); /*Mostramos por pantalla el valor casteado a double 
		debido a que nos pueden salir decimales de esa divisi�n*/
	}
}
