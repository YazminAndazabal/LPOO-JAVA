
package yaz;
import java.util.Scanner;
public class yaz18 {
	public static void main(String[] args) {
		System.out.println("introduzca el numero maximo del random");
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println("introduzca el numero minimo del random");
		int a=sc.nextInt();
		int random= (int)(Math.random()*(b-a+1)+a);
		System.out.println(random);
	}
}
