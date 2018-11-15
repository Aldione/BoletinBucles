package ejercicio22;

import static ejercicio21.Colores.*;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		/*22.En el programa anterior, marcar las casillas a las que se puede mover un alfil desde una
		posición dada por teclado. Que se repita el proceso tantas veces como desee el usuario.*/

		/* 1. Pedir al usuario la fila y la columna del alfil.
		 * 2. Dibujar el cuadro negro o blanco, empezando por blanco y el siguiente negro.
		 * 3. Imprimir sus movimientos
		 * 3. Cuando llegue a la fila y la columna dicha escriba el alfil
		 * 4. Preguntar si sigue o no.
		 */
		
		int fila,col,repetir=1;
		final byte nfilas = 8 , ncol=8;
		String lt1=FONDO_BLANCO+"   "+RESET ,lt2=FONDO_NEGRO+"   "+RESET;
		Scanner key=new Scanner(System.in);
		
		
		do{
			do{
				System.out.println("Posicion Alfil(fila):");
				fila=key.nextInt();
				System.out.println("Posicion Alfil(columna):");
				col=key.nextInt();
			}while((fila>8 || fila<0)||(col>8 || col<0));
		
		for(int i=1;i<=nfilas;i++){
			for(int j=1;j<=ncol;j++){
			  if(fila==i && col==j){
				  if((i+j)%2==0){
						System.out.print(FONDO_BLANCO+NEGRO+" \u265F  "+RESET);
					}else{
						System.out.print(FONDO_NEGRO+BLANCO+" \u2659  "+RESET);
					}
			  }else{
				  if(Math.abs(i-fila)==Math.abs(j-col)){
					  if((i+j)%2==0){
							System.out.print(FONDO_BLANCO+NEGRO+" * "+RESET);
						}else{
							System.out.print(FONDO_NEGRO+BLANCO+" * "+RESET);
						}
				  }else{
					  if((i+j)%2==0){
							System.out.print(lt1);
						}else{
							System.out.print(lt2);
						}
				  }
					
			  }
			
			}
			
		System.out.println("");
		}
			System.out.println("Quieres hacer otro movimiento? 1.Si 2.No");
			repetir=key.nextInt();
		}while(repetir!=2);
		key.close();
		
	}

}
