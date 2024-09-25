package yaz;

import javax.swing.JOptionPane;//libreria para la ventana output

public class yaz {
	public static void main(String[] args) {
			
		String a = JOptionPane.showInputDialog("tu nombre papa");//ventana con mensaje a dar
			System.out.println("Bienvenido "+a);
			JOptionPane.showMessageDialog(null, "bienvenido (ahora en ventanita :D) "+a  );
			//no entiendo exactamente el porque del null

	}
}
