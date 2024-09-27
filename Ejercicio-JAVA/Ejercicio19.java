package yaz;
import java.util.Scanner;
public class yaz19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		do {
			System.out.println("introduzca numero positivo para contar las cifras");
			b=sc.nextInt();	
		}while(b<0);
		int c=0;
		for(int a=b;a>0;a/=10) {
			c++;
		}
		System.out.println(c);
		
	}
}
