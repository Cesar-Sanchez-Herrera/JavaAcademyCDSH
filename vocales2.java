import java.util.Scanner;

public class vocales2 {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el texto");
		String texto = scan.nextLine();
		int longitud = texto.length();
		int i = 0;
		
		while(i < longitud){
			if(texto.charAt(i) == 'a' ||
			texto.charAt(i) == 'e' ||
			texto.charAt(i) == 'i' ||
			texto.charAt(i) == 'o' ||
			texto.charAt(i) == 'u'){
			System.out.println("tiene vocales");
			break;
			}
			i++;
		}
		
	}
}