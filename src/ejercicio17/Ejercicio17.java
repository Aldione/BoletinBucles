package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// 17.Realiza un algoritmo que lea un número natural n por teclado y dibuje un triángulo de
		// asteriscos con base y altura n. Por ejemplo si n = 5 debería dibujarse:
//		    *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
		
//		Procedimientos:
//			1- Pedir al usuario el numero por teclado
//			2- Crear el numero metido -1 de espacio
//			3- Crear los asteriscos
//			4- Terminar programa
		
		Scanner key = new Scanner(System.in);
		int n=0,j=0,m=0;
		String cadena="";
		
		System.out.println("Introduce el numero de altura y base: ");
		n=key.nextInt();
		
		do {
			for(int i=1; i<n; i++) {
				cadena = " "+cadena;
				j++;
			}
			for(int i=j; i<n+m; i++) {
				cadena=cadena+"* ";
			}
			System.out.printf("%s%n",cadena);
			cadena="";
			j=0;
			n--;
			m++;
		}while(n>0);
			
		key.close();

	}

}
