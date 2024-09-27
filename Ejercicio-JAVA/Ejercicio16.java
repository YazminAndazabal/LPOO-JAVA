package yaz;
import java.util.Scanner;
public class yaz16 {
	public static void main(String[] args) {
		String a="xslr8";
		System.out.println("introduzca la contraseña");
		Scanner sc = new Scanner(System.in);
		String b;
		for(int i=0;i<3;i++) {
			b=sc.next();
			if(a.equals(b)) {
				System.out.println("contraseña correcta");
				break;
			}else {
				System.out.println("contraseña incorrecta");
			}
			if(i==3)System.out.println("see terminaron los intentos");
		}
	}
}
