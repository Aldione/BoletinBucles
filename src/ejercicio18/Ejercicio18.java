package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		/* 18.Realiza un algoritmo que lea un número natural n y un carácter por teclado. La salida debe
			  	ser un rombo compuesto del carácter y de la anchura que especifica el número n. Por
				ejemplo, si n es 5 y el carácter es *, el rombo sería:
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/
		
		/*Procedimientos:
			1- Pedir al usuario el numero de anchura
			2- Pedir al usuario un caracter
			3- Sacar el caracter n veces desde 1 hasta n
			4- Hacer lo mismo que 3 pero al reves*/
		
		Scanner key = new Scanner(System.in);
		int n = 0, j = 0, m = 0;
		String cadena="", c;
		
		// 1- Pedir al usuario el numero de anchura
		System.out.println("Que anchura quiere que tenga el rombo?");
		n = key.nextInt();
		do {
			System.out.println("Que simbolo quieres que lo componga?");//2- Pedir al usuario un caracter
			c = key.next();
		}while(c.length()>1);
		//3- Sacar el caracter n veces desde 1 hasta n
		do {
			for(int i=1; i<n; i++) {
				cadena = " "+cadena;
				j++;
			}
			for(int i=j; i<n+m; i++) {
				cadena=cadena+c+" ";
			}
			System.out.printf("%s%n",cadena);
			cadena="";
			j=0;
			n--;
			m++;
		}while(n>0);
		//4- Hacer lo mismo que 3 pero al reves
		/*do {
			for(int i=m; i>m-n; i--) {
				cadena = " "+cadena;
				j++;
			}
			for(int i=j; i<m-1; i++) {
				
				cadena=cadena+" "+c;
			}
			
			System.out.printf("%s%n",cadena);
			cadena="";
			j=0;
			n++;
		}while(n<m-1);*/
		
		do {
			for(int i=1; i<=n; i++) {
				cadena = " "+cadena;
				j++;
			}
			for(int i=j; i<n+m-1; i++) {
				cadena=cadena+" "+c;
			}
			System.out.printf("%s%n",cadena);
			cadena="";
			j=0;
			n++;
			m--;
		}while(m>1);
		
		key.close();

	}

}
