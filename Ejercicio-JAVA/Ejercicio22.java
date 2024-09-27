package yaz;
public class yaz22 {
	public static void main(String[] args) {
		  String ea= "La lluvia en Sevilla es una maravilla";
		  int contador=0;
		  for(int i=0;i>=ea.length();i++) {
			  if(ea.charAt(i)=='a'||ea.charAt(i)=='e'||ea.charAt(i)=='i' || ea.charAt(i)=='o' || ea.charAt(i)=='u') {
				  contador++;
			  }
		  }
		  System.out.println(contador + " vocales tiene la oreaicon");
	}
}
