package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Realiza un programa que encuentre el primer valor N para el que la suma
		// 1 + 2 + 3 + ... + N
		// exceda a un valor M que se introduce por teclado.
		
//		Procedimiento:
//			1- Pedir al usuario un numero entero
//			2- Ir sumando los numeros hasta llegar a un valor mayor que el numero introducido
//			3- Finalizar programa
		
		Scanner keyboard = new Scanner(System.in);
		int m, result=0, i=0;
		
		//1- Pedir al usuario un numero entero
		System.out.println("Introduce un numero entero: ");
		m= keyboard.nextInt();
		
		//2- Ir sumando los numeros hasta llegar a un alor mayor que el numero introducido
		do {
			i++;
			result += i;
		}while (result<m);
		
		System.out.printf("El numero %d sumado es mayor que %d con un total de %d%n",i,m, result);
		keyboard.close();
	}

}
