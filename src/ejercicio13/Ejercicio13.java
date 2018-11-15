package ejercicio13;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// 13.Realiza un juego de adivinanza de un número entero. El programa pedirá dos números (el
		// número inferior y el número superior), por ejemplo 1 y 100, y un número de intentos, por
		// ejemplo, 4. El programa obtendrá a continuación un número aleatorio entre 1 y 100, y el
		// usuario deberá adivinarlo utilizando como mucho 4 intentos. Cada vez que el usuario
		// introduce un número, el programa le dice si es mayor o menor. Al final, el programa indica si
		// se ha ganado o no. Si acierta, el programa finaliza aunque no haya agotado el número de
		// intentos.
		
//		Procedimiento:
//			1- Pedir al usuario el rango de numeros
//			2- Pedir al usuario el numero de intentos
//			3- Crear un numero aleatorio dentro del rango introducido
//			4- Pedir al usuario que adivine el numero aleatorio
//			5- Decir si es mayor o menor o si ha acertado y cuantos intentos le queda
//			6- Decir si ha ganado o no y finalizar el programa.
			
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int menor = 0, mayor = 0, intentos = 0, adivinar = 0, result = 0;
		
		//1- Pedir al usuario el rango de numeros
		do {
			System.out.println("Introduce el rango que deseas tener: (primero menor, luego mayor) ");
			menor = keyboard.nextInt();
			mayor = keyboard.nextInt();
		}while (menor > mayor);
		
		//2- Pedir al usuario el numero de intentos
		System.out.println("Cuantos intentos deseas tener? ");
		intentos = keyboard.nextInt();
		
		//3- Crear un numero aleatorio dentro del rango introducido
		adivinar = random.nextInt(mayor-menor+1)+menor;
		
		//4- Pedir al usuario que adivine el numero aleatorio
		do {
			System.out.printf("Introduce el numero que deseas adivinar: (Tienes %d intentos)%d%n",intentos, adivinar);
			result = keyboard.nextInt();
			
			//5- Decir si es mayor o menor o si ha acertado y cuantos intentos le queda
			if (result > adivinar) {
				System.out.printf("El numero introducido es menor que %d%n", result);
				intentos--;
			}else if(result < adivinar) {
				System.out.printf("El numero introducido es mayor que %d%n", result);
				intentos--;
			}
			
		}while(result != adivinar && intentos>0);
		
		//6- Decir si ha ganado o no y finalizar el programa.
		if(intentos == 0) {
			System.out.printf("Lo siento, has introducido todos tus intentos, el numero para adivinar era: %d%n", adivinar);
		}else {
			System.out.printf("Felicidades, has introducido el numero correcto y te quedaban %d intentos.%n",intentos);
		}
		
		keyboard.close();

	}

}
