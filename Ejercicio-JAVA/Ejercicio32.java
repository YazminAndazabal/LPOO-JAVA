package yaz;
import java.util.Scanner;
public class yaz32 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Escribe el texto a para comparar con b");
        a= sc.nextLine();
        System.out.println("Escribe el texto b");
        String b;
        b= sc.nextLine();
        if(a.compareTo(b)==0)System.out.println("Son iguales");else System.out.println("No son iguaLes");
        sc.close();

    }
}
