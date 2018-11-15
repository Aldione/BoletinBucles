package ejercicio3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int deficientes=0, insuficientes=0, aprobados=0, bien=0, notables=0, sobresalientes=0;
		int nota, i=0;
		
		
		do {
			do {
				System.out.println("Introduce la nota: ");
				nota = keyboard.nextInt();
				if (nota <0 || nota>10) {
					System.out.println("Esta nota no es compatible, repitelo");
				}
			}while (nota<0 || nota>10);
			
			if (nota >=0 && nota <=2) {
				deficientes++;
			}else if(nota == 3 || nota == 4 ) {
				insuficientes++;
			}else if (nota == 5) {
				aprobados++;
			}else if (nota == 6) {
				bien++;
			}else if (nota ==7 || nota == 8) {
				notables++;
			}else if (nota == 9 || nota == 10) {
				sobresalientes++;
			}
		
			i++;
		}while (i<10);
		
		System.out.printf("Tenemos:%n%d deficientes%n%d insuficientes%n%d aprobados%n%d bien%n%d notables%n%d sobresalientes",deficientes, insuficientes, aprobados, bien, notables, sobresalientes);
	
		keyboard.close();
		
	}
		
}
