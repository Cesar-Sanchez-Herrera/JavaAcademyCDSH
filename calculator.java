import java.util.Scanner;
public class calculator{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int number1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		int number2 = scan.nextInt();
		
		System.out.println("La suma de " + number1 + " + " 
		+ number2 + " es = " + (number1+number2));
		System.out.println("La resta de " + number1 + " - " 
		+ number2 + " es = " + (number1-number2));
		System.out.println("La multiplicacion de " + number1 + " x " 
		+ number2 + " es = " + (number1*number2));
		System.out.println("La division de " + number1 + " / " 
		+ number2 + " es = " + ((float)number1/number2));
	}
}