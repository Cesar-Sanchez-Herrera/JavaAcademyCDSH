package com.softtek.java.academy.exercises;
import java.util.Scanner;

public class Extra3 {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int[] a = new int[3];
	int[] b = new int[3];
	
	System.out.println("Ingresa el primer numero del primer arreglo");
	a[0] = scan.nextInt();
	System.out.println("Ingresa el segundo numero del primer arreglo");
	a[1] = scan.nextInt();
	System.out.println("Ingresa el tercer numero del primer arreglo");
	a[2] = scan.nextInt();
	
	System.out.println("Ingresa el primer numero del segundo arreglo");
	b[0] = scan.nextInt();
	System.out.println("Ingresa el segundo numero del segundo arreglo");
	b[1] = scan.nextInt();
	System.out.println("Ingresa el tercer numero del segundo arreglo");
	b[2] = scan.nextInt();

	System.out.println("el numero medio del primer arreglo es " + a[1]);
	System.out.println("el numero medio del segundo arreglo es " + b[1]);
	}
	
}