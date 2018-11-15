package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*19.Elabore un programa que imprima el triángulo hasta un valor dado. El triángulo contiene los
			números naturales correlativos, uno en la primera línea, dos en la segunda, etc.; es decir, en
			la fila n-esima aparecen n valores. Ejemplo:
			    1
			   1 2
			  1 2 3
			 1 2 3 4
			1 2 3 4 5
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
				cadena = " "+cadena;
				j++;
			}
			for(int i=j; i<n+m; i++) {
				cadena=cadena+f+" ";
				f++;
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
