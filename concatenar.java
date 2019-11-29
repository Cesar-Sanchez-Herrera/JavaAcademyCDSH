public class concatenar {
	public static void main(String[]args){
		if(args != null){
			if(args.length >= 2){
				String cadenaA = args[0];
				String cadenaB = args[1];
				String cadenaConcatenada = cadenaA.concat(cadenaB).concat(cadenaB).concat(cadenaA);
				System.out.println(cadenaConcatenada);
			
		}else{
			System.out.println("Favor de especificar cadena A y cadena B");
			}
		}
	}
}