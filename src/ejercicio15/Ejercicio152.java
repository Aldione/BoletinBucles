package ejercicio15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio152 {

	public static void main(String[] args) {
		//15.Realizar un programa en java para jugar con el ordenador a un juego de adivinanza. El
//		programa tendrá que adivinar una letra o un número pensado por el usuario. Para ello, el
//		juego consta de dos partes.
//		En la primera parte, el programa tendrá que adivinar el tipo, que puede ser:
//		• Un número del 0 al 9
//		• Una vocal minúscula
//		• Una consonante minúscula (sin contar la ñ)
//		El programa tendrá dos intentos como máximo para averiguar ese tipo. Si no lo adivina, el
//		juego termina y el ordenador habrá perdido.
//		Si lo adivina, se continúa jugando con la segunda parte donde tendrá que adivinar la letra o
//		el número concreto. Para ello tendrá los siguientes intentos:
//		• El número entre 0 y 9: tres intentos
//		• La vocal minúscula: dos intentos
//		• La consonante minúscula: cinco intentos. En este caso, el usuario le irá ayudando
//		diciéndole al ordenador si es mayor o menor según el orden alfabético.
//		Si el programa, dentro de ese número de intentos lo adivina, habrá ganado, si no, habrá
//		perdido. En cualquier caso, hay que informar al usuario.
		
		
//		Procedimientos:
//			1- Preguntar al usuario si es un numero o una letra a adivinar y ponerla.
//			2- La maquina deberia decir si es un numero, vocal o consonante en 2 intentos.
//			3- Si falla los intentos pierde, si no, pasa a la siguiente fase.
//			4- La maquina deberia intentar adivinar el numero o letra.
//			5- Si es numero 3 intentos, si es vocal 2 intentos y si es consonante 5 intento.
//			6- Si es consonante debera el usuario ayudar si es mayor o menor a la consonante a adivinar.
		
		
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		int adinum=0, resnum, elec, intentos1 = 2, intentos2 = 3, preg1, mayornum = 9, menornum = 0;
		String adilet, resletr;
		boolean restnum;
		
		//1- Preguntar al usuario si es un numero o una letra a adivinar y ponerla.
		do {
			System.out.println("Que deseas usar para adivinar?\n1. Numero\n2. Vocal\n3. Consonante");
			elec = keyboard.nextInt();
			
			if(elec == 1) {
				do {
					System.out.println("Que numero deseas que adivine? (Del 0 al 9)");
					adinum = keyboard.nextInt();
				}while(adinum>9 || adinum<0);
			}else if(elec == 2) {
				do {
					System.out.println("Que vocal quieres que adivine? (Usa minuscula)");
					adilet = keyboard.next();
					keyboard.close();
				}while(adilet !="a" || adilet !="e" || adilet !="i" || adilet !="o" || adilet !="u");
			}else if(elec == 3) {
				do {
					System.out.println("Que consonante quieres que adivine? (Usa minuscula)");
					adilet=keyboard.next();
					keyboard.close();
				}while(adilet == "a" || adilet == "e" || adilet == "i" || adilet == "o" || adilet == "u");
			}else {
				System.out.println("Solo puedes elegir del 1 al 3.");
			}
		}while(elec>3 || elec<1);
		
		//2- La maquina deberia decir si es un numero, vocal o consonante en 2 intentos.
		do {
			System.out.printf("Adivina si es:\n1. Numero\n2. Vocal\n3. Consonante\nTienes %d intentos.%n", intentos1);
			intentos1--;
			preg1 = random.nextInt(3-1+1)+1;//4- La maquina deberia intentar adivinar el numero o letra.
			System.out.println(preg1);
		}while(intentos1>=1 && preg1!=elec);//3- Si falla los intentos pierde, si no, pasa a la siguiente fase.

		if (preg1 == elec) {
			if(elec == 1) {
				System.out.println("Perfecto has acertado, ahora dime que numero crees que es:");
				
				do {
					resnum = random.nextInt(mayornum-menornum+1)+menornum;
					System.out.println(resnum);
					intentos2 --;
					
				}while(intentos2 >= 1 && resnum!=adinum);
				
				if(resnum == adinum) {
					System.out.println("Felicidades, has acertado el numero");
					
				}else {
					System.out.println("Lo siento, has perdido");
				}
			}else if(elec ==2) {
				System.out.println("Perfeto has acertado, ahora dime que vocal crees que es:");
				
			}else {
				
			}
			
		}else {
			System.out.println("Lo siento, has perdido.");
		}
		
	}

}
