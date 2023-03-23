package es.studium.ej4;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacionPorSeleccion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		final int MAX = 10; //Constante que nos indicará el número total de posiciones de la tabla
		double tabla[] = new double [MAX]; //Creamos la tabla que guardará números reales
		int j, indice_mayor; /*Creamos una variable j que nos ayudará a comparar
		una posición de la tabla con la siguiente y una variable indice_mayor que almacenará
		la posición en la que se encuentre el número mayor*/
		double aux; /*Guardará el dato de la tabla en la posición actual en la que nos encontremos en el for
		para luego poder ir cambiándolo de posición según si encuentra un valor mayor*/
		
		//Hacemos un for para pedirle al usuario los valores de la tabla en cada posición
		for(int i = 0; i < MAX; i++) { 
			System.out.println("Dame un número real: ");
			tabla[i] = teclado.nextDouble(); /*Almacenaremos cada valor que nos aporte el usuario 
			en cada posición correspondiente a la i*/
		}
		teclado.close();
		
		/*Hacemos un for que llegue hasta la posición penúltima de la tabla ya que la última posición 
		 no se puede comparar con la siguiente porque es inexistente*/
		for(int i = 0; i < MAX-1; i++) { 
			indice_mayor = i; //Inicializamos el indice_mayor a lo que valga la i en cada vuelta
			for(j = i + 1; j < MAX; j++) { /*j = i + 1 debido a que empezamos en el número siguiente de la 
				i para compararlo con el anterior y aquí si llegamos hasta el final de la tabla*/
				if(tabla[j] > tabla[indice_mayor]) { /*Comparamos los valores de la tabla en posición j
				y en posición i, y si es mayor...*/
					indice_mayor = j; //...Asignación en la que indice_mayor es la posición j
				}
			}
			
			/*Se producirá un intercambio de valores en cuyo caso indice_mayor se vea afectado por el if 
			y cambie su valor*/
			aux = tabla[i];
			tabla[i] = tabla[indice_mayor];
			tabla[indice_mayor] = aux;	
		}
		
		//Mostramos la tabla ya ordenada
		System.out.println("La tabla ordenada queda así: "+ Arrays.toString(tabla));
	}

}
