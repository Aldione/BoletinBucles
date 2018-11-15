package ejercicio8;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Utilizando un bucle for con dos contadores, realiza un programa que dados dos números enteros
		// a y b que se introducen por teclado(a<b), vaya aumentando a al doble de su valor y
		// disminuyendo b a la mitad de su valor hasta que a>b.
		
//		Procedimiento:
//			1- Pedir 2 numeros enteros donde a<b.
//			2- Icrementar a al doble de su valor y b a la mitad de su valor.
//			
		
		Scanner keyboard = new Scanner(System.in);
		int number1, number2; 
		//double result2=1;
		
		//1- Pedir 2 numeros enteros donde a<b
		System.out.println("Introduce un numero entero aleatorio: ");
		number1 = keyboard.nextInt();
		do {
			System.out.println("Introduce un numero mayor aleatorio: ");
			number2 = keyboard.nextInt();
		}while (number1>=number2);
		
		//2- Incrementar a al doble de su valor y b a la mitad de su valor
		int result1= number1, result2 = number2;
		// 3- Terminar cuando a>b
		for(int i=1;result1<result2;i++) {
			number1=result1;
			number2=result2;
			result1=result1*2;
			result2=result2/2;
			System.out.printf("%d El doble de %d ha llegado hasta %d y la mirad de %d ha llegado hasta %d.%n",i,number1, result1, number2, result2);
		}
		
		

		keyboard.close();
	}

}
