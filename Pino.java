package com.softtek.java.academy.exercises;
import java.util.Scanner;
public class Pino {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la altura del pino");
		int altura = scan.nextInt();
		int i, j;
		
		for(i=0; i<altura; i++) {
			for(j=altura; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
