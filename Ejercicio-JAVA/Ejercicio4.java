package yaz;

/*Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).*/

import javax.swing.JOptionPane;//libreria para la ventana output

public class yaz {
	public static void main(String[] args) {
			
		String a = JOptionPane.showInputDialog("tu nombre"); //mensaje dado
			System.out.println("Bienvenido "+a);
			JOptionPane.showMessageDialog(null, "bienvenido (ahora en ventana) "+a  );

	}
}
