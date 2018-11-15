package ejercicio14;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// 14.Realiza el mismo programa que el ejercicio anterior pero al revés, es decir, es la máquina la
		// que tiene que adivinar el número pensado por el usuario.
		
		
//		Procedimiento:
//			1- Pedir un numero al usuario
//			2- Pedir el numero de intentos
//			3- Pedir en que rango esta
//			4- La maquina intente adivinar el numero con X intentos y si es mayor o menor
//			5- Decir si se ha acertado o no.
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		int intentos, menor, mayor, adivinar, result;
		
		
		do {
			//1- Pedir un numero al usuario
			System.out.println("Dime el numero para adivinar: ");
			adivinar = keyboard.nextInt();
			
			//2- Pedir el numero de intentos
			System.out.println("Cuantos intentos puede tener?");
			intentos = keyboard.nextInt();
			
			do {
				//3- Pedir en que rango esta
				System.out.println("Dime el rango en el cual estara el numero a adivinar: (Primero menor y luego mayor) ");
				menor = keyboard.nextInt();
				mayor = keyboard.nextInt();
			}while(menor>mayor);
		}while(menor>adivinar || mayor<adivinar);
			
		//4- La maquina intente adivinar el numero con X intentos y si es mayor o menor	
		do {
			result = random.nextInt(mayor-menor+1)+menor;
			System.out.println(result);
			
			if (result > adivinar) {
				intentos--;
				System.out.printf("El numero a adivinar es menor, tienes %d intentos%n",intentos);
				mayor = result-1;
			}else if (result < adivinar) {
				intentos--;
				System.out.printf("El numero a adivinar es mayor, tienes %d intentos%n", intentos);
				menor = result+1;
			}
			
		}while(intentos>0 && result!=adivinar);
		
		//5- Decir si se ha acertado o no.
		if(intentos == 0) {
			System.out.printf("Lo siento, has introducido todos tus intentos, el numero para adivinar era: %d%n", adivinar);
		}else {
			System.out.printf("Felicidades, has introducido el numero correcto y te quedaban %d intentos.%n",intentos);
		}	
		
		keyboard.close();
		
		

	}

}
