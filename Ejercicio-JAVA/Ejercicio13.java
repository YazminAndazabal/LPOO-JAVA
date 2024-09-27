package Ejercicio;
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca cantidad de ventas");
		int numV=sc.nextInt();
		int sumador=0;
		for(int a=0;a<numV;a++) {
			System.out.println("introduzca 0la venta ");
			int num=sc.nextInt();
			sumador+=num;
		}
		System.out.println("las ventas realizadas son "+sumador);
	}
}
