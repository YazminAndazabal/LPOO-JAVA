package yaz;
/*Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado 
(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.*/

import javax.swing.JOptionPane;//libreria para la ventana output

public class yaz {
	public static void main(String[] args) {
		double pi= 3.14;
		String a = JOptionPane.showInputDialog("radio");//ventana con mensaje a dar
		double radio= Double.parseDouble(a);
		JOptionPane.showMessageDialog(null, "el area del circulo es "+(pi*(Math.pow(radio,2)))  );
			//no entiendo exactamente el porque del null

}
}
