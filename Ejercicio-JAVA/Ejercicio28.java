package yaz;
import java.util.Scanner;
public class yaz28 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b;
        System.out.println("ingrese una frase");
         b = sc.nextLine();
         b =b.replaceAll(" ", "");
        System.out.println("la frase sin espacios: " + b);
         sc.close();
    }
}
