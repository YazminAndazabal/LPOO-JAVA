package yaz;
import java.util.Scanner;
public class yaz20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
			System.out.println("introduzca numero positivo para contar las cifras");
			b=sc.nextInt();
		if(b<1){
			System.out.println("no es primo");
			return;
		}
		int e;
		e = (int)Math.sqrt(b);
		for(int i=e;i>1;i--){
			if(b%e==0){
				System.out.println("no es primo");
				return;
			}
		}
		System.out.println("es primo");
		return;
		
	}
}
