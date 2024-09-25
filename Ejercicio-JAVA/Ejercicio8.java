package yaz;
/*Modifica el ejercicio anterior, para que en lugar de pedir un número, 
pida un carácter (char) y muestre su código en la tabla ASCII.*/

import javax.swing.JOptionPane;

public class yaz {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("ingresa un caracter");
		char c =a.charAt(0);
		int num= (int)c;	
		JOptionPane.showMessageDialog(null, num + " es el codigo ASCII de "+ c  );

	}
}

