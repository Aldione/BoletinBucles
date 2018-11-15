package ejercicio22;

import static ejercicio21.Colores.*;

import java.util.Scanner;

public class Ejercicio22Rey {

	public static void main(String[] args) {
		int fila,col,repetir=1;
		int nfilas = 8 , ncol=8;
		String lt1=FONDO_BLANCO+"   "+RESET ,lt2=FONDO_NEGRO+"   "+RESET;
		Scanner teclado=new Scanner(System.in);
		
		do{
			do{
		System.out.println("Posicion Rey(fila):");
		fila=teclado.nextInt();
		System.out.println("Posicion Rey(columna):");
		col=teclado.nextInt();
			}while((fila>8 || fila<0)||(col>8 || col<0));
		for(int i=1;i<=nfilas;i++){
			for(int j=1;j<=ncol;j++){
			  if(fila==i && col==j){
				  if((i+j)%2==0){
						System.out.print(FONDO_BLANCO+NEGRO+" \u265A "+RESET);
					}else{
						System.out.print(FONDO_NEGRO+BLANCO+" \u2654 "+RESET);
					}
			  }else{
				  if(((i==fila && Math.abs(j-col)==1)||(j==col && Math.abs(i-fila)==1))||(Math.abs(fila-i)==1&&Math.abs(col-j)==1)){
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
		repetir=teclado.nextInt();
		}while(repetir!=2);
		teclado.close();

	}

}
