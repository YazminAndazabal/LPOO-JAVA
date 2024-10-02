package yaz;
/*Recorre el String del ejercicio 22 y transforma cada carácter a su código 
ASCII. Muestralos en linea recta, separados por un espacio entre cada carácter*/
public class yaz24 {
	public static void main(String[] args) {
		  String ea= "la lluvia en sevilla es una maravilla";
		  for(int i=0;i<ea.length();i++) {
			 System.out.print(((int)ea.charAt(i))+" ");
		  }
	}
}
