package yaz;
import java.util.Scanner;
public class yaz15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca cantidad de a");
		int a;
		do {
			System.out.println("introduzca cantidad de a");
			a=sc.nextInt();
			
		}while(-1>=a);
		System.out.println(a);
	}
}
