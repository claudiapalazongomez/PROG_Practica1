package es.studium.ej4;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacionPorSeleccion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		final int MAX = 10; //Constante que nos indicar� el n�mero total de posiciones de la tabla
		double tabla[] = new double [MAX]; //Creamos la tabla que guardar� n�meros reales
		int j, indice_mayor; /*Creamos una variable j que nos ayudar� a comparar
		una posici�n de la tabla con la siguiente y una variable indice_mayor que almacenar�
		la posici�n en la que se encuentre el n�mero mayor*/
		double aux; /*Guardar� el dato de la tabla en la posici�n actual en la que nos encontremos en el for
		para luego poder ir cambi�ndolo de posici�n seg�n si encuentra un valor mayor*/
		
		//Hacemos un for para pedirle al usuario los valores de la tabla en cada posici�n
		for(int i = 0; i < MAX; i++) { 
			System.out.println("Dame un n�mero real: ");
			tabla[i] = teclado.nextDouble(); /*Almacenaremos cada valor que nos aporte el usuario 
			en cada posici�n correspondiente a la i*/
		}
		teclado.close();
		
		/*Hacemos un for que llegue hasta la posici�n pen�ltima de la tabla ya que la �ltima posici�n 
		 no se puede comparar con la siguiente porque es inexistente*/
		for(int i = 0; i < MAX-1; i++) { 
			indice_mayor = i; //Inicializamos el indice_mayor a lo que valga la i en cada vuelta
			for(j = i + 1; j < MAX; j++) { /*j = i + 1 debido a que empezamos en el n�mero siguiente de la 
				i para compararlo con el anterior y aqu� si llegamos hasta el final de la tabla*/
				if(tabla[j] > tabla[indice_mayor]) { /*Comparamos los valores de la tabla en posici�n j
				y en posici�n i, y si es mayor...*/
					indice_mayor = j; //...Asignaci�n en la que indice_mayor es la posici�n j
				}
			}
			
			/*Se producir� un intercambio de valores en cuyo caso indice_mayor se vea afectado por el if 
			y cambie su valor*/
			aux = tabla[i];
			tabla[i] = tabla[indice_mayor];
			tabla[indice_mayor] = aux;	
		}
		
		//Mostramos la tabla ya ordenada
		System.out.println("La tabla ordenada queda as�: "+ Arrays.toString(tabla));
	}

}
