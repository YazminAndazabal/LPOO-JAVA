package yaz;
import java.util.Scanner;
public class yaz36 {
	//DiasSemanas es como un array donde
  //tiene cada uno asignado un valor booleano
	public enum DiasSemana {
	    LUNES(true),
	    MARTES(true),
	    MIERCOLES(true),
	    JUEVES(true),
	    VIERNES(true),
	    SABADO(false),
	    DOMINGO(false);
		// variables correspondiente del true o false
	    private boolean laborable;
	    //privte DiasSemana funcion es para 
    //asignar esa variable a cada parte del array
	    private DiasSemana(boolean laborable){
	        this.laborable = laborable;
	    }
	    @Override
	    //se verifica que el dia sea laboral o no
	    public String toString() {
	        if(laborable){
	            return "El dia "+ this.name().toLowerCase() +" es laborable";
	        }else{
	            return "El dia "+  this.name().toLowerCase() +" no es laborable";
	        } 
	    }    
	}
	public static void main(String[] args) {   
                Scanner sn = new Scanner(System.in);
                System.out.println("Escribe un dia de la semana");
                String dia = sn.next();
                DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
                System.out.println(diaS.toString());
                
            }
}
