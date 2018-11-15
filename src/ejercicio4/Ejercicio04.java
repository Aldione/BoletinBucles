package ejercicio4;

import java.util.Random;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random random = new Random();
		int i = 1, result =0;
		
		do {
			result = random.nextInt(6)+1;
			System.out.printf("La tirada %d ha salido el numero %d%n",i,result);
			i++;
		}while(i<=20);
		
	}

}
