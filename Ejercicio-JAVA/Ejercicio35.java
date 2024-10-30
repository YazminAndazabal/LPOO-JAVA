package yaz;
import java.util.Scanner;
public class yaz35 {
	public enum DiaSemana {
	    LUNES,
	    MARTES,
	    MIERCOLES,
	    JUEVES,
	    VIERNES,
	    SABADO,
	    DOMINGO
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un dia de la semana para decir si es laboral o no");
        String a;
        a= sc.nextLine();
        DiaSemana b = DiaSemana.valueOf(a.toUpperCase());
        switch(b){
        case LUNES:
        case MARTES:
        case MIERCOLES:
        case JUEVES:
        case VIERNES:
        	System.out.println("Son dias laborales");
        	break;
        case SABADO:
        case DOMINGO:
        	System.out.println("Son dias no laborales");
        	break;
        	default: System.out.println("Dato invalido");
    }
}
}
