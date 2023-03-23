package es.studium.ej5;

public class Fosas
{

	public static void main(String[] args)
	{	
		//Creamos dos tablas que nos almacenarán las fosas y la profundidad de ellas
		String fosas[] = {"Calipso", "Marianas", "Puerto Rico", "Aleutianas"};
		int profundidad[] = {5270, 11034, 8800, 7822};
		int maxProfundidad; //En esta variable almacenaremos la máxima profundidad
		int maxFosa = 0; /*En esta variable pondremos la fosa correspondiente a la máxima profundidad
		y la inicializamos a 0*/
		
		maxProfundidad = profundidad[0]; //Inicializamos la variable a una posición cualquiera
		
		//Hacemos un for para recorrer la tabla
		for(int i = 0; i < profundidad.length; i++) { 
			if(profundidad[i] > maxProfundidad) { /*Si el valor en la posición i de la tabla 
			profundidad es mayor que el que ya hemos almacenado en maxProfundidad, entramos en el if*/
				maxProfundidad = profundidad[i]; //Almacenamos ese valor en la variable maxProfundidad 
				maxFosa = i; /*Almacenamos la i en maxFosa para en el syso pasarle la posición deseada 
				de la fosa y que nos salga el nombre al que corresponde*/
			}	
		}
		
		//Mostramos por pantalla la fosa con más profundidad
		System.out.println("La fosa " + fosas[maxFosa] + " es la más profunda con " + maxProfundidad 
				+ " metros.");
	
	}

}
