import java.util.Scanner;

public class doscaracteres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce algun texto");
        String texto = scan.nextLine();
        if(texto.length() >=2){
            System.out.println(texto.substring(0,2));
        }else{
          System.out.println(texto);  
        }
    }
}