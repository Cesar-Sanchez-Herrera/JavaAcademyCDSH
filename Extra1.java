package com.softtek.java.academy.exercises;
import java.util.Scanner;

public class Extra1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = scan.nextInt();
		
		if(edad >=18) {
			System.out.println("Tiene edad suficiente para votar");
		}else {
			System.out.println("No tienes la edad para votar");
		}
	}
}
