package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// 16.Realiza un programa que dado un número entero positivo de n cifras, calcule el número con
		// sus cifras en orden inverso. El resultado debe quedar en una variable. No utilizar String ni
		// calcular previamente el número de cifras. Ej: 54.321 debe devolver 12.345

//		Procedimientos:
//		1- Pedir numero al usuario
//		2- Sacar el modulo ente 10 y meterlo en una variable tipo int
//		3- Dividir el numero entre 10 y meterlo en una variable
//		4- Paso 2 multiplicando por 10 y sumando el siguiente modulo
//		5- Mostar resultado cuando el resto sea 0
		
		Scanner key = new Scanner(System.in);
		int n=0, mod=0,mod1=0;
		
		//1- Pedir numero al usuario
		System.out.println("Introduce un numero entero positivo, sin importar la cifra.");
		n = key.nextInt();
		
		//2- Sacar el modulo ente 10 y meterlo en una variable tipo int
		do {
			mod = n%10;
			mod1= mod1*10+mod; //4- Paso 2 multiplicando por 10 y sumando el siguiente modulo
			n=n/10; //3- Dividir el numero entre 10 y meterlo en una variable
		}while(n>0);//5- Mostar resultado cuando el resto sea 0
		
		System.out.println(mod1);
		key.close();
	}

}
