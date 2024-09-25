package yaz;
/* Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el
precio final con IVA. El IVA sera una constante que sera del 21%.*/

import javax.swing.JOptionPane;

public class yaz {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Ingrese un precio");
		int num= Integer. parseInt(a);	
		JOptionPane.showMessageDialog(null," el precio con iva es : "+ ((num*0.21)+num)  );
	}
}
