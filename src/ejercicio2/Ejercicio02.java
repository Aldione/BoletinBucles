package ejercicio2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int number1, number2, producto=0;
		
		do {
			System.out.println("Introduce un numero positivo: ");
			number1 = keyboard.nextInt();
			System.out.println("Introduce otro numero positivo: ");
			number2 = keyboard.nextInt();
		}while (number1 < 0 || number2 <0);
		
		
		while (number2 !=0) {
			producto = producto + number1;
			number2 = number2-1;
		}
		
		System.out.printf("El producto entre los 2 numeros es: %d", producto);
		keyboard.close();
		
	}

}
