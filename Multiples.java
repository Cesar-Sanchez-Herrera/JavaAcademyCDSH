package com.softtek.java.academy.exercises;

import java.util.Scanner;;

public class Multiples {
	public static void main(String[] args) {
		System.out.println("Ingrese el numero a sumar sus multiplos");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		int respuesta = 0;
		for (int i = 1; i < numero; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				respuesta += i;
			}
		}
		System.out.println(respuesta);
	}
}