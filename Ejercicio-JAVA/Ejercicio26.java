package yaz;
/* Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.*/
import java.util.Scanner;
public class yaz26 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b;
        do {
        System.out.println("ingrese un numero mayor a 1");
         b = sc.nextInt();
        }while(b<1);
        System.out.println("El resultado es :" + (a + b));
    
         sc.close();
    }
}
