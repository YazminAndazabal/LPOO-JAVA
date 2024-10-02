package yaz;
/*Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), 
según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.*/
import java.util.Scanner;8public class yaz52 {
	public static void main(String[] args) {
        System.out.println("ingrese los numeros que quieras operar y la operacion\n");
        System.out.println("primer numero:");      //el scanner tiene la funcion en la que toma los datos para ingresar
   
        Scanner sc = new Scanner(System.in);
        try{
        int a = sc.nextInt();
        System.out.println("\nIngrese segundo numero:");
        int b = sc.nextInt();
        System.out.println("\nIngrese la operacion:");
        char oper = sc.next().charAt(0);
        System.out.println("\n");   // en el operador es la cuenta que vamos a hacer y solo tendremos (+ - / *)
      
        switch (oper) {
            case '+':
                System.out.println("el resultado es :" + (a + b));
                break;
            case '-':
                System.out.println("el resultado es :" + (a - b));
                break;
            case '*':
                System.out.println("el resultado es :" + (a * b));
                break;
            case '/':
                System.out.println("el resultado es :" + (a / b));
                break;
            case '%':
                System.out.println("el resultado es :" + (a % b));
                break;
            case '^':
                System.out.println("el resultado es :" + Math.pow(a, b));
                break;
            default:
                System.out.println("Operacion invalida\n");
        }
        }
        finally
        {
            sc.close();
        }
    }
}
