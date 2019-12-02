import java.util.Scanner;

public class vocales {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el texto");
		String texto = scan.nextLine();
		for(int i=0; i <= texto.length(); i++){
			char letra = texto.charAt(i);
			if(letra == 'a' || letra == 'e' || letra == 'i' 
			|| letra == 'o' || letra == 'u'){
				System.out.println("Su texto tiene vocales");
				break;
			}
		}			
	
	}
}