package ejercicio15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	
	/* 	15. Realizar un programa en java para jugar con el ordenador a un juego de adivinanza. El
		programa tendrá que adivinar una letra o un número pensado por el usuario. Para ello, el
		juego consta de dos partes.
		
		En la primera parte, el programa tendrá que adivinar el tipo, que puede ser:
			• Un número del 0 al 9
			• Una vocal minúscula
			• Una consonante minúscula (sin contar la ñ).
		El programa tendrá dos intentos como máximo para averiguar ese tipo. Si no lo adivina, el
		juego termina y el ordenador habrá perdido.
		
		Si lo adivina, se continúa jugando con la segunda parte donde tendrá que adivinar la letra o
		el número concreto. Para ello tendrá los siguientes intentos:
			• El número entre 0 y 9: tres intentos
			• La vocal minúscula: dos intentos
			• La consonante minúscula: cinco intentos. En este caso, el usuario le irá ayudando
			diciéndole al ordenador si es mayor o menor según el orden alfabético.
		Si el programa, dentro de ese número de intentos lo adivina, habrá ganado, si no, habrá
		perdido. En cualquier caso, hay que informar al usuario.*/
	
	public static final char VOWEL_U = 'u';
	public static final char VOWEL_O = 'o';
	public static final char VOWEL_I = 'i';
	public static final char VOWEL_E = 'e';
	public static final char VOWEL_A = 'a';
	public static final int WORD_Z = 122;
	public static final int WORD_A = 97;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*1. El usuario introduce la primera opción (número, vocal o consonante) que quiera para que la máquina lo adivine.
		 *2. El usuario introduce la segunda opción, que es el valor que quiere que la máquina adivine.
		 *3. La máquina intenta adivinar la opción:
		 *	3.1. Si agota los 2 intentos en la primera parte, pierde.
		 *	3.2. Si lo acierta entonces intentará averigüar el valor.
		 *		3.2.1. Numérico: Tiene 3 intentos.
		 *		3.2.2. Vocal: Tiene 2 intentos
		 *		3.2.3. Consonante: Tiene 5 intentos.*/
		
		String str;
		boolean isWinner;
		int option;
		
//		1. El usuario piensa la primera opción (número, vocal o consonante) que quiera para que la máquina lo adivine.
		option = opcion();
		
//		2. El usuario introduce la segunda opción, que es el valor que quiere que la máquina adivine.
		str = configOpcion(option);
		
		keyboard.close();
		
//		3. La máquina intenta adivinar la opción:
		System.out.println("\n¡Adivina la opción!");
		isWinner = adivinarOpcion(option);
		
//		3.1. Si agota los 2 intentos en la primera parte, pierde.
		if (!isWinner) {
			System.out.println("\nHa perdido la máquina.");
//		3.2. Si lo acierta entonces intentará averigüar el valor.
		} else {
			System.out.println();
			System.out.println("\n¡Adivina cuál es la correcta!");
			isWinner = adivinar(option, str);
			if (isWinner) {
				System.out.println("\n¡Ha ganado la máquina!");
			} else {
				System.out.println("\nHa perdido la máquina.");
			}
		}
	}

//	CONFIGURACIÓN / INTRODUCCIÓN DEL USUARIO PARA QUE LA MÁQUINA ADIVINE
	public static int opcion() {
		int option;
		
//		1. El usuario introduce la opción que quiera para que la máquina lo adivine.
		System.out.print("De las siguientes opciones:\n\t1. Adivinar un número del 0 al 9\n\t2. Adivinar una vocal minúscula\n\t3. Adivinar una consonante minúscula\nSelecciona una opción: ");
		do {
			option = keyboard.nextInt();
			if(option<1 || option>3) {
				System.out.print("Opción errónea. Vuelve a intentarlo: ");
			}
		} while(option<1 || option>3);
		
		return option;
	}
	public static String configOpcion(int option) {
		String str = "";
		char charac;
		boolean exit = false;
		int  num = 0;
				
		
//		2.1. Una vez escogido el tipo selecciona el valor que quiere que la máquina adivine.
		switch (option) {
		case 1:
			do {
				System.out.print("Introduce un número del 0 al 9: ");
				num = keyboard.nextInt();
			} while (num<0 || num>9);
			
			str = String.valueOf(num);
			
			break;
			
		case 2:
			do {
				System.out.print("Introduce una vocal minúscula: ");
				charac = keyboard.next().charAt(0);
				keyboard.nextLine(); 									// Limpiar Buffer
				if (charac == VOWEL_A || charac == VOWEL_E || charac == VOWEL_I || charac == VOWEL_O || charac == VOWEL_U) {
					exit = true;
				}
			} while (!exit);
			
			str = String.valueOf(charac);
			
			break;
			
		case 3:
			do {
				System.out.print("Introduce una consonante minúscula: ");
				charac = keyboard.next().charAt(0);
				keyboard.nextLine(); 									// Limpiar Buffer
				if (charac > WORD_A && charac <= WORD_Z) {
					if (charac != VOWEL_A || charac != VOWEL_E || charac != VOWEL_I || charac != VOWEL_O || charac != VOWEL_U) {
						exit = true;
					}
				}
				
			} while (!exit);
			
			str = String.valueOf(charac);
			
			break;
		}
		return str;
	}
	
//	ADIVINA MÁQUINA
//	1º Parte: Adivinar una de las 3 opciones
	public static boolean adivinarOpcion(int option) {
		boolean isWinner = false;
		int machine, intent = 0;
		Random rnd = new Random ();

		do {
			machine = rnd.nextInt(3)+1;
			System.out.printf("Intento nº%d: %d\n", intent+1, machine);	
			
			if (machine == option) {
				isWinner = true;
			} else {
				intent++;
			}
			
		} while (intent < 2 && !isWinner);
		
		return isWinner;
	}
	
//	2º Parte: Adivinar el valor dependiendo de la opción anterior
	public static boolean adivinar(int option, String value) {
		boolean isWinner = false;  
	
		switch (option) {
//		3.2.1. Numérico: Tiene 3 intentos.
		case 1:
			isWinner = adivinarNumeros(value);
			break;
//		3.2.2. Vocal: Tiene 2 intentos
		case 2:
			isWinner = adivinarVocal(value);	
			break;
//		3.2.3. Consonante: Tiene 5 intentos.
		case 3:
//			isWinner = adivinarConsonante(value);
			isWinner = adivinarConsonante2(value);
			break;
		}	
		
		return isWinner;
	}
	public static boolean adivinarNumeros(String num) {
		String numRnd;
		int intent = 0;
		boolean isWinner = false;
		final int MAX_INTENT = 3;
		Random rnd = new Random();
		
		do {
			numRnd = String.valueOf(rnd.nextInt(10)); // Del 0 al 9
			System.out.printf("Intento nº%d: %s%n", intent+1, numRnd);
			if (num.equals(numRnd)) {
				isWinner = true;
			}  else {
				intent ++;
			}
				
		} while (intent < MAX_INTENT && !isWinner);
		
		return isWinner;
	}
	public static boolean adivinarVocal(String vowels) {
		boolean isWinner = false;
		String option, vowel = "aeiou";
		int intent = 0;
		final int MAX_INTENT = 2;
		Random rnd = new Random();
		
		do {		
			option = Character.toString(vowel.charAt(rnd.nextInt(5))); // Transforma de un Char a un String
			
			System.out.printf("Intento nº%d: %s%n", intent+1, option);
			
			if (vowels.equals(option)) {
				isWinner = true;
			}  else {
				intent ++;
			}
				
		} while (intent < MAX_INTENT && !isWinner);
		
		return isWinner;
	}
	
//	Función modificando consonant
	public static boolean adivinarConsonante(String cons) {
		boolean isWinner;
		String option, consonant = "bcdfghjklmnpqrstvwxyz";
		int intent = 0, indexUser = 0, indexRnd;
		final int MAX_INTENT = 5;
		Random rnd = new Random();
		
		do {	
			indexRnd = rnd.nextInt(consonant.length());
			option =  Character.toString(consonant.charAt(indexRnd)); // Transforma de un Char a un String
			
			System.out.printf("Intento nº%d: La máquina ha pensado la consonante %s%n", intent+1, option);
			
			if (cons.equals(option)) {
				isWinner = true;
			} else {
				
				indexUser = consonant.indexOf(cons);
				
				if (indexUser<indexRnd) {
					System.out.println("Usuario: La consonante que he pensado es menor que la tuya\n");
					consonant = consonant.substring(0, indexRnd);
				} else {
					System.out.println("Usuario: La consonante que he pensado es mayor que la tuya\n");
					consonant = consonant.substring(indexRnd+1);
				}
								
				intent ++;
				isWinner = false;
			}
				
		} while (intent < MAX_INTENT && !isWinner);
		
		return isWinner;
	}
	
//	La misma función pero con 2 índices, sin modificar consonant.
	public static boolean adivinarConsonante2(String cons) {
		boolean isWinner;
		String option, consonant = "bcdfghjklmnpqrstvwxyz";
		int intent = 0, indexUser = 0, index1 = 0, index2 = consonant.length()-1, indexRnd;
		final int MAX_INTENT = 5;
		Random rnd = new Random();
		
		indexUser = consonant.indexOf(cons); 
		
		do {	
			indexRnd = rnd.nextInt(index2-index1+1) + index1;
			option =  Character.toString(consonant.charAt(indexRnd)); // Transforma de un Char a un String
			
			System.out.printf("Intento nº%d: La máquina ha pensado la consonante %s%n", intent+1, option);
			
			if (cons.equals(option)) {
				isWinner = true;
			} else {
				if (indexUser<indexRnd) {
					System.out.println("Usuario: La consonante que he pensado es menor que la tuya\n");
					index2 = indexRnd-1;
				} else {
					System.out.println("Usuario: La consonante que he pensado es mayor que la tuya\n");
					index1 = indexRnd+1;
				}								
				intent ++;
				isWinner = false;
			}
				
		} while (intent < MAX_INTENT && !isWinner);
		
		return isWinner;
	}
}
