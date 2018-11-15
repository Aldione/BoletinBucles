package ejercicio21;

import static ejercicio21.Colores.*;

public class Ejercicio21 {

	public static void main(String[] args) {
		/*21.Crear un programa que imprima un tablero de ajedrez.*/

		/*Prodecimientos:
			1- Imprimir 1 color blanco y otro negro y en la siguiente fila al reves*/
			
		int c=8, f=8;
		String blanco=FONDO_BLANCO+"  "+RESET, negro=FONDO_NEGRO+"  "+RESET;
		
		do {
			for(int i=c/2; i!=0; i--) {
				System.out.print(blanco+negro);
			}
			f--;
			System.out.printf("%n");
			for(int i=c/2; i!=0; i--) {
				System.out.print(negro+blanco);
				
			}
			f--;
			System.out.printf("%n");
		}while(f!=0);
		
	}

}
