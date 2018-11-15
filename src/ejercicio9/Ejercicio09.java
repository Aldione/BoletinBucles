package ejercicio9;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Realiza un programa que calcule xn, siendo x y n dos números enteros que se introducen por
		// teclado. (Nota: no se puede utilizar Math.pow)

//		Procedimiento:
//			1- Pedir 2 numeros por teclado
//			2- multiplicar el primer numero tantas veces como el segundo numero
//			3- Finalizar el programa
			
		Scanner keyboard = new Scanner(System.in);
		int x=0, n=0, result=1;
		
		//1- Pedir 2 numeros por teclado
		System.out.println("Introduce un numero a elevar: ");
		x=keyboard.nextInt();
		System.out.println("Introduce el exponente: ");
		n=keyboard.nextInt();
		
		//2- multiplicar el primer numero tantas veces como el segundo numero
		for (int i=0;i<n;i++) {
			result=x*result;
		}
		
		//3- Finalizar el programa
		System.out.println(result);
			
		keyboard.close();
	}

}
