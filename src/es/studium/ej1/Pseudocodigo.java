package es.studium.ej1;

public class Pseudocodigo
{

	public static void main(String[] args)
	{
		//Declaración de nuestras variables de tipo int
		int n; 
		int a = 0;
		int b = 0;
		
		do {
			n = (int)(Math.random()*10+1); /*Math.random nos devuelve un número aleatorio entre 0 y 1 
			de tipo double, por lo que debemos castearlo a int por tratar nuestra variable n 
			como tipo int. Luego lo multiplicamos por 10 para que nos cogiese un valor entre 0 y 9, 
			y al sumarle 1 a este número tendremos finalmente un número entre 1 y 10 que es lo que 
			nos pide el ejercicio en pseudocódigo.*/
			a = a + n; //El valor que vaya adquiriendo n, se le va sumando a nuestra variable a
			b = b + 2; 
		} while(b != 20); //Cuando b alcance el valor de 20, se termina el bucle
		System.out.println((double)a/(double)b); /*Mostramos por pantalla el valor casteado a double 
		debido a que nos pueden salir decimales de esa división*/
	}
}
