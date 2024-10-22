package yaz;
import java.util.Scanner;
public class yaz27 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        int contador = 0;
        do {
        System.out.println("ingrese un numero. use -1 para terminar");
         b = sc.nextInt();
         if(b!=-1) contador++;
        }while(b!=-1);
        System.out.println("Cantidad de numeros ingresados es: "+contador);
         sc.close();
    }
}
