package yaz;
/*Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
Por ejemplo: si introduzco un 97, me muestre una a.*/

import javax.swing.JOptionPane;

public class yaz {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("ingresa un numero"); //ventana con mensaje
		int radio= Integer.parseInt(a);
		char c= (char)radio;
		JOptionPane.showMessageDialog(null, c + " es este numero en codigo ASCII de "+a  );
	}
}
