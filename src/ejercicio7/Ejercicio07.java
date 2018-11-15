package ejercicio7;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Realiza un programa que calcule la suma de los pares y de los impares comprendidos entre dos
		// valores enteros a y b que se introducen por teclado (a < b).

		
//		Procedimiento:
//			1- Pedir 2 numeros enteros
//			2- Identificar los numeros comprendidos entre a y b
//			3- Realizar la suma de los pares y luego hacer la de los impares
//			4- Mostar resultado
		
		Scanner keyboard = new Scanner(System.in);
		int number1, number2, pares=0, impares=0;
		
		// 1- Pedir 2 numeros enteros
		System.out.println("Introduce un numero aleatorio: ");
		number1 = keyboard.nextInt();
		do {
			System.out.println("Introduce otro numero mayor: ");
			number2=keyboard.nextInt();
		}while(number2<=number1);
		
		// 2- Identificar los numeros comprendidos entre a y b
		for(int i = number1;i<=number2;i++){
			// 3- Realizar la suma de los pares y los impares
			if (i%2==0) {
				pares = i+pares;
			}else {
				impares = i+impares;
			}
			}
		
		// 4- Mostrar resultado
		System.out.printf("La suma de todos los pares es %d y de los impares es %d%n", pares,impares);
		
		
		keyboard.close();
	}

}
