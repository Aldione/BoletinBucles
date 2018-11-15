package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
//		12.Realiza un programa que calcule el primer elemento de la serie de Fibonacci que sea mayor o
//		igual que un valor introducido por teclado. La serie de Fibonacci se define mediante:
//		a0 = 0 a1 = 1 an = an-1 + an-2
//		es decir, la serie de Fibonacci sería la siguiente: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, …..

		
//		Procedimiento:
//			1- Pedir al usuario un numero entero
//			2- Realizar la operacion fibonacci y que no se pase del numeo del usuario
//			3- Finalizar programa
			
		Scanner keyboard = new Scanner (System.in);
		int n,i=0;
		
		//1- Pedir al usuario un numero entero
		System.out.println("Introduce un numero entero: ");
		n = keyboard.nextInt();
		
		//2- Realizar la operacion fibonacci y que no se pase del numeo del usuario
		do {
			i=i+i;
		}while(i<n);
		
		System.out.printf("El numero %d es %d",n,i);
		
		keyboard.close();
		
	}

}
