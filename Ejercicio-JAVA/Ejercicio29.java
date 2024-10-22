package yaz;
import java.util.Scanner;
public class yaz29 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="";
        String b;
        System.out.println("ingrese de forma infinita hasta que ponga una linea sin caracteres");
        do {
         b = sc.nextLine();
         a = a+"\n" + b;
        } while(b!="");
        sc.close();
        System.out.println("el texto escrito:\n" + a);

    }
}
