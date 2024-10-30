package yaz;
import java.util.Scanner;
public class yaz38 {
	public static void main(String[] args) {   
                Scanner sn = new Scanner(System.in);
                int nume=0;
                int mayor=0,menor=999999,suma=0,sumNpositivos=0,sumNnegativos=0,media=0;
                int contador = 0;
                System.out.println("ingresa los numeros que quieras, se terminara el programa cuando el numero sea exactamente -1");
                do {
                    nume = sn.nextInt();
                    if(nume==-1)break;
                    contador++;
                    if(nume>mayor) mayor=nume;
                    if(nume<menor) menor=nume;
                    suma+= nume;
                    if(nume>0) sumNpositivos+=nume;
                    if(nume<0) sumNnegativos+=nume;
                    
                }while(nume !=-1);
                System.out.println("mayor:"+ mayor);
                System.out.println("menor:"+menor);
                System.out.println("suma de todos:"+suma);
                System.out.println("suma positivos"+ sumNpositivos);
                System.out.println("suma negativos"+ sumNnegativos);
                System.out.println("media "+(suma/contador));


            }
}
