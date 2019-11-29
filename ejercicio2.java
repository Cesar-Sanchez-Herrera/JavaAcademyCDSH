public class ejercicio2
	{
		/*private int edad;
		private short peso; 
		private String nombre;
		private float precio;
		private boolean esVIP ;
		private boolean tieneCredencial;
		private long valorLong;
		*/
		
		int edad = 10;
		short peso = 70;
		String nombre = "Cesar Daniel Sanchez herrera";
		float precio = 12.5f;
		boolean esVIP = false;
		boolean tieneCredencial = false;
		long valorLong = 50;
		
		
	public static void main(String[] args)
	{
		ejercicio2 ejemplo = new ejercicio2();
		
		//ejemplo.edad = Integer.valueOf(args[0]); //Clase para especificar el valor 
		System.out.println(("Edad: ")+ejemplo.edad);
		System.out.println(("Peso: ")+ejemplo.peso);
		System.out.println(("Programacion Java: ")+ejemplo.nombre);
		System.out.println(("Precio: ")+ejemplo.precio);
		System.out.println(("VIP: ")+ejemplo.esVIP);
		System.out.println(("Credencial: ")+ejemplo.tieneCredencial);
		System.out.println(("Valor: ")+ejemplo.valorLong);
		
		boolean puedeVotar = ((ejemplo.edad >= 18) && ejemplo.tieneCredencial);
		
		System.out.println(puedeVotar);
	}
	
	public void setEdad(int edad)//Metodo para que edad sea publico usando otra clase 
	{
		this.edad = edad;
	}
}