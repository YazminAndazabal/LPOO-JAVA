package yaz;
import java.util.Scanner;
public class yaz17 {
	public static void main(String[] args) {
		System.out.println("introduzca el dia de semana de Lunes a Domingo");
		Scanner sc = new Scanner(System.in);
		String b=sc.next();
		switch(b) {
		case"lunes":
		case"martes":
		case"miercoles":
		case"jueves":
		case"viernes":
		{System.out.println("DIa laboral");break;}
		case"sabado":
		case"domingo":
		{
		System.out.println("dIA no labora");break;
		}
		}
	}
}
