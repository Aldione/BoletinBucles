package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Realiza un programa que calcule el factorial de un número entero positivo que se introduce por
//		teclado. El factorial de un número entero positivo n se define como el producto de todos los
//		números enteros positivos desde 1 hasta n:
//		n! = 1 * 2 * ….* (n-1) * n

//		Procedimiento:
//			1- Pedir que introduzcamos un numero entero positivo
//			2- Sacar el factorial de dicho numero
//			3- Finalizar el programa
			
		Scanner keyboard = new Scanner(System.in);
		int n, result=1;
		
		//1- Pedir que introduzcamos un numero entero positivo
		System.out.println("Introduce el numero para sacar el factorial: ");
		n = keyboard.nextInt();
		
		//2- Sacar el factorial de dicho numero
		for(int i=n; i>0;i--) {
			result=result*i;
			
		}
		//3- Finalizar el programa
		System.out.printf("El factorial de %d es %d",n,result);
		
		keyboard.close();
	}

}
