package yaz;
import java.util.Scanner;
public class yaz37 {
	public enum Mes {
	    enero(1,31),
	    febrero(2,28),
	    marzo(3,31),
	    abril(4,30),
	    mayo(5,31),
	    junio(5,30),
	    julio(7,31),
	    agosto(8,31),
	    septiembre(9,30),
	    octubre(10,31),
	    noviembre(11,30),
	    diciembre(12,31);
		//laborable va a ser la variables correspondiente del true o false
	    private int orden;
	    private int dias;
	    //privte DiasSemana funcion es para asignar esa variable a cada parte del array
	    private Mes(int orden,int dias){
	        this.orden = orden;
	        this.dias = dias;
	    }
	    //se verifica que el dia sea laboral o no
	    public int getorden(){
	    	return orden;
	    }
	    public int getdia(){
	    	return dias;
	    }
	    @Override
	    public String toString() {
	        return "El mes "+this.name().toLowerCase()+" es el mes "+orden+"º y tiene "+dias+" dias";
	    }
	}
	public static void main(String[] args) {   
                Scanner sn = new Scanner(System.in);
                Mes[] meses = Mes.values();
                System.out.println("Escribe una cantidad de dias");
                int dia = sn.nextInt();
                for(int i=0;i<meses.length;i++){
                    
                    if(meses[i].getdia()==dia){
                        System.out.println(meses[i].toString());
                    }
                    
                }
            }
}
