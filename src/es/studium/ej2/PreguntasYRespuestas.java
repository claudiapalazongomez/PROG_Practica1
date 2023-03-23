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
		int acierto;//Será el contador de los aciertos del usuario a sus respuestas dadas
		
		//Le damos valores de tipo String a cada una de las posiciones de las tablas
		preguntas[0] = "¿Quién escribió La Odisea?";
		preguntas[1] = "¿En qué año acabó la II Guerra Mundial?";
		preguntas[2] = "¿Dónde se encuentra la Sagrada Familia?";
		preguntas[3] = "¿Quién es el padre del psicoanálisis?";
		preguntas[4] = "¿Qué país tiene forma de bota?";
		preguntas[5] = "¿Cuál es la ciudad de los rascacielos?";
		preguntas[6] = "¿Cuál fue el primer metal que empleó el hombre?";
		preguntas[7] = "¿A quién le crecía la nariz cuando mentía?";
		preguntas[8] = "¿De qué estado fue emperador Napoleón Bonaparte?";
		preguntas[9] = "¿Cómo se llama la especie de animal mamífero de vida semiacuática que pone huevos "
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
			int numRandom = (int)(Math.random()*10); /*El programa elige un número del 0 al 9 
			de forma aleatoria, el cual almacenamos en la variable numRandom.
			Debemos castearlo debido a que este método te devuelve un valor double*/
			System.out.println(preguntas[numRandom]); /*Mostramos al usuario la pregunta que coincida
			con nuestro numRandom*/
			respuestaUsuario = teclado.nextLine().toLowerCase().trim(); /*La respuesta del usuario 
			a la pregunta anterior la guardamos en respuestaUsuario. 
			Se guardará en minúsculas y (.trim) con los espacios de izquierda o derecha cortados, 
			además de si hubiese doble espacio entre una palabra u otra*/ 
			if(respuestaUsuario.equals(respuestas[numRandom].toLowerCase())) { /*Comparamos la respuesta 
			del usuario con la respuesta correcta a la pregunta indicada.
			Para que esto no nos de fallo con la respuestaUsuario, nuestras respuestas  
			se pasarán a minúscula (.toLowerCase)*/
				acierto = acierto + 1; //Contador que sumará los aciertos, si falla no sumará nada
			}
		}
		System.out.println("Has acertado "+ acierto + " veces"); //Mostramos el nº total de aciertos
		teclado.close();

	}

}
