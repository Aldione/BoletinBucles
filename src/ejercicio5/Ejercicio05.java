package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		int i = 1, result =0, number = 0, number2 = 0;
		

		do {
			System.out.println("Introduce un numero: ");
			number = keyboard.nextInt();
			System.out.println("Introduce otro numero mayor: ");
			number2 = keyboard.nextInt();
		}while(number > number2);
		
		
		do {
			result = random.nextInt(number2 - number+1)+number;
			System.out.printf("La tirada %d ha salido el numero %d%n",i,result);
			i++;
		}while(i<=15);
		
		keyboard.close();
	}
		
	

}
