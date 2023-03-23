package es.studium.ej2;

import java.util.Scanner;

public class PreguntasYRespuestas
{

	public static void main(String[] args)
	{	
		Scanner teclado = new Scanner (System.in);
		/*Creamos dos tablas: una para almacenar las 10 preguntas 
		y otra para almacenar las 10 respuestas*/
		String preguntas[] = new String[10];
		String respuestas[] = new String[10];
		String respuestaUsuario; //En esta variable almacenaremos las respuestas del usuario
		int acierto;//Ser� el contador de los aciertos del usuario a sus respuestas dadas
		
		//Le damos valores de tipo String a cada una de las posiciones de las tablas
		preguntas[0] = "�Qui�n escribi� La Odisea?";
		preguntas[1] = "�En qu� a�o acab� la II Guerra Mundial?";
		preguntas[2] = "�D�nde se encuentra la Sagrada Familia?";
		preguntas[3] = "�Qui�n es el padre del psicoan�lisis?";
		preguntas[4] = "�Qu� pa�s tiene forma de bota?";
		preguntas[5] = "�Cu�l es la ciudad de los rascacielos?";
		preguntas[6] = "�Cu�l fue el primer metal que emple� el hombre?";
		preguntas[7] = "�A qui�n le crec�a la nariz cuando ment�a?";
		preguntas[8] = "�De qu� estado fue emperador Napole�n Bonaparte?";
		preguntas[9] = "�C�mo se llama la especie de animal mam�fero de vida semiacu�tica que pone huevos "
				+ "y sigue existiendo en la actualidad?";

		respuestas[0] = "Homero";
		respuestas[1] = "1945";
		respuestas[2] = "Barcelona";
		respuestas[3] = "Sigmund Freud";
		respuestas[4] = "Italia";
		respuestas[5] = "Nueva York";
		respuestas[6] = "Cobre";
		respuestas[7] = "Pinocho";
		respuestas[8] = "Francia";
		respuestas[9] = "Ornitorrinco";
		
		acierto = 0; //Inicializamos la variable acierto en 0

		for (int i = 1; i <= 3; i++) /*Usamos un for que se va a repetir 3 veces 
		debido a que SOLO le van a aparecer tres preguntas de nuestras diez al usuario*/
		{
			int numRandom = (int)(Math.random()*10); /*El programa elige un n�mero del 0 al 9 
			de forma aleatoria, el cual almacenamos en la variable numRandom.
			Debemos castearlo debido a que este m�todo te devuelve un valor double*/
			System.out.println(preguntas[numRandom]); /*Mostramos al usuario la pregunta que coincida
			con nuestro numRandom*/
			respuestaUsuario = teclado.nextLine().toLowerCase().trim(); /*La respuesta del usuario 
			a la pregunta anterior la guardamos en respuestaUsuario. 
			Se guardar� en min�sculas y (.trim) con los espacios de izquierda o derecha cortados, 
			adem�s de si hubiese doble espacio entre una palabra u otra*/ 
			if(respuestaUsuario.equals(respuestas[numRandom].toLowerCase())) { /*Comparamos la respuesta 
			del usuario con la respuesta correcta a la pregunta indicada.
			Para que esto no nos de fallo con la respuestaUsuario, nuestras respuestas  
			se pasar�n a min�scula (.toLowerCase)*/
				acierto = acierto + 1; //Contador que sumar� los aciertos, si falla no sumar� nada
			}
		}
		System.out.println("Has acertado "+ acierto + " veces"); //Mostramos el n� total de aciertos
		teclado.close();

	}

}
