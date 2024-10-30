
package yaz;
import java.util.Scanner;
public class yaz30 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="HoLii Mundo Esto Es Java";
        char b;
        System.out.println("Este es el texto orginal: " + a);
        System.out.println("1 para mayuscula 2 para minuscula");
        b =sc.next().charAt(0);
        switch(b) {
        case '1':  System.out.println("El resultado es: " + a.toUpperCase());break;
        case '2':  System.out.println("El resultado es: " + a.toLowerCase());break;
        }
        sc.close();

    }
}
