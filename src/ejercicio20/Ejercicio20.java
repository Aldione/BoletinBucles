package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/*20.Realiza un algoritmo que imprima una pirámide de dígitos como la de la figura, tomando
			como entrada el número de filas de la misma.
			        1
			      1 2 1
			    1 2 3 2 1
			  1 2 3 4 3 2 1
			1 2 3 4 5 4 3 2 1
			
*/
		
		/*Procedimientos:
		1- Pedir al usuario el numero de lineas
		2- Ir contando filar por numero
		3- Imprimir en pantalla
		*/
	
		Scanner key = new Scanner(System.in);
		int n=0,j=0,m=0, f=1;
		String cadena="";
	
		System.out.println("Introduce el numero de filas: ");
		n=key.nextInt();
	
		do {
			for(int i=1; i<n; i++) {
				cadena = "  "+cadena;
				j++;
			}
			for(int i=j; i<n+m; i++) {
				cadena=cadena+f+" ";
				f++;
			}
			f--;
			for(int i=j; i<n+m-1; i++) {
				f--;
				cadena=cadena+f+" ";
			}
			
			System.out.printf("%s%n",cadena);
			cadena="";
			j=0;
			f=1;
			n--;
			m++;
		}while(n>0);
		
		key.close();

	}

}
