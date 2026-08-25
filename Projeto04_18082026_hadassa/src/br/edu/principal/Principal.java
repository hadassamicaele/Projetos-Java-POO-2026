package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7: ");
		int dia = sc.nextInt();
		
		if (dia == 1) {
			System.out.println("Domingo");
		}
		else if (dia == 2) {
			System.out.println("Segunda");
		}
		else if (dia == 3) {
			System.out.println("Terça");
		}
		else {
			System.out.println("Esse número não existe.");
		}

	}

}