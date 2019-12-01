import java.util.Scanner;

public class calificaciones{

    public static void main(String[] args) {
        comienzo();
    }
    
    public static void comienzo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del alumno:");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la clificacion del alumno:");
        int calificacion = scan.nextInt();
        
        while(calificacion >=11){
            System.out.println("Clificacion incorrecta, intentelo de nuevo:");
            calificacion = scan.nextInt();
        }
         
        if(calificacion >=0 && calificacion <=10){
            calcular(nombre, calificacion);
        }
    }
    
    public static void calcular(String nombre, int calificacion){
        String resultado = null;
        Scanner scan = new Scanner(System.in);
        if(calificacion == 9 || calificacion == 10){
            resultado = "sobresaliente";
        }else if(calificacion == 7 || calificacion == 8){
            resultado = "notable";
        }else if(calificacion == 6){
            resultado = "bien";
        }
        else if(calificacion == 5){
            resultado = "aprobado";
        }else{
            resultado = "suspenso";
        }
        System.out.println("El status del alumno " + nombre + " es: " + resultado);
        
        System.out.println("Desea calificar a otro alumno? \n 0 = No \n 1 = Si" );
        int respuesta = scan.nextInt();
        while(respuesta >=2){
            System.out.println("Respuesta incorrecta, intentelo de nuevo:");
            respuesta = scan.nextInt();
        }
        if(respuesta == 1){
            comienzo();
        }else if(respuesta == 0){
            System.out.println("Gracias por usar mi programa, hasta pronto");
        }
    }
}