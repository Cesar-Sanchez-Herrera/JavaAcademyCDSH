import java.util.Scanner;

public class calificaciones2 {

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
        switch (calificacion) {
            case 10:
                resultado = "sobresaliente";
                break;
            case 9:
                resultado = "sobresaliente";
                break;
            case 8:
                resultado = "notable";
                break;
            case 7:
                resultado = "notable";
                break;
            case 6:
                resultado = "bien";
                break;
            case 5:
                resultado = "aprobado";
                break;
            default:
                resultado = "suspenso";
                break;
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