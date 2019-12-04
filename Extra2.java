package com.softtek.java.academy.exercises;
import java.util.Scanner;

public class Extra2 {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingresa el primer numero");
	int n1 = scan.nextInt();
	System.out.println("Ingresa el segundo numero");
	int n2 = scan.nextInt();
	System.out.println("Ingresa el tercer numero");
	int n3 = scan.nextInt();
	
	if(n1 > n2 && n1 > n3) {
		System.out.println("El primer numero es mayor que los demas");
	}else if(n2 > n1 && n2 > n3) {
		System.out.println("El segundo numero es mayor que los demas");
	}else {
		System.out.println("El tercer numero es mayor que los demas");
	}
	}
}
