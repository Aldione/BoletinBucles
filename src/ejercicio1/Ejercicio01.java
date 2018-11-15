package ejercicio1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int number=0, result=0, i=0;
		
		do {
			System.out.println("Introduce un numero entre 0 y 10: ");
			number = keyboard.nextInt();
		}while (number < 0 || number>10);
		
		for(i=0;i<=10;i++) {
			result = number*i;
			System.out.printf("%d x %d = %d\n",number,i, result);
			}
			
		
		keyboard.close();
		
	}
}
