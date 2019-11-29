import java.util.Scanner;

public class Leerteclado {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("cual es tu nombre?");
		String nombre = scan.nextLine();
		System.out.println("Hola " + nombre + " buenos dias");
	}
}