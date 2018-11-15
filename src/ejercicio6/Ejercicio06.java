package ejercicio6;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int number = 0, number2 = 0, select=0, result=0;
		double result1=0;
		
		do {							
			do {
				System.out.println("Que deseas hacer?");
				System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Divivir\n5. Salir");
				select = keyboard.nextInt();
				if (select <1 || select >5) {
					System.out.println("El numero introducido no es correcto");
				}
			}while (select < 1 || select > 5);
			
			if (select >=1 && select <5) {
			System.out.println("Introduce un numero: ");
			number = keyboard.nextInt();
			System.out.println("Introduce otro numero: ");
			number2 = keyboard.nextInt();
			}
		
			if (select == 1) {
				result = number + number2;
				System.out.printf("La suma de %d y %d es: %d%n",number, number2, result);
			}else if (select ==2 ) {
				result = number - number2;
				System.out.printf("La resta de %d y %d es: %d%n",number, number2, result);
			}else if (select==3) {
				result = number * number2;
				System.out.printf("La multiplicacion de %d por %d es: %d%n",number, number2, result);
			}else if (select ==4) {
				result1 = (float) number / number2;
				System.out.printf("La division de %d y %d es: %.2f%n",number, number2, result1);
			}else 
				System.out.println("Gracias, espero que vuelvas pronto");
		}while (select <5);
		
		keyboard.close();
		
		
	}
	
	
}
