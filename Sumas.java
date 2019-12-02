package com.softtek.java.academy.exercises;
import java.util.Scanner;;
public class Sumas {
    public static void main(String[] args) {
        comienzo();
    }
    
    public static void comienzo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = scan.nextInt();
        
        System.out.println("La suma es = " + (numero1+numero2));
        
        System.out.println("Desea sumar otros dos numeros? \nEscriba \n0:No \n1:Si" );
        int respuesta = scan.nextInt();
        System.out.println("\n");
        if(respuesta == 1) {
        	comienzo();
        }else {
        	System.out.println("Gracias por usar mi programa");
        }
    }
}
