package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String situacao;
		
		double mf = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = sc.next();
		
		System.out.println("Digite sua primeira nota:");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		double n2 = sc.nextDouble();
		
		double media = (n1+n2)/2;
		
		if (media >= 6) {
			situacao = "Aprovado";
		}
		else {
			if (media >= 3) {
				situacao = "Em recuperação";
				System.out.println("Situação: " + situacao);
				
				System.out.println("Digite a sua AF: ");
				double af = sc.nextDouble();
				
				mf = (media + af)/2;
				
				if (mf >= 5) {
					situacao = "Aprovado em recuperação";
					System.out.println("Situação: " + situacao);
				}
				else {
					situacao = "Reprovado em recuperação";
					System.out.println("Situação: " + situacao);
				}
			}
			else {
				situacao = "Reprovado";
				System.out.println("Situação: " + situacao);
			}
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
		System.out.println("Média final: " + mf);
		System.out.println("Situação: " + situacao);

	}

}