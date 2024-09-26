package aplicacao;

import java.util.Scanner;

import entidade.Alugar;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alugar[] vet = new Alugar[10];
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto (1-10): ");
			int quarto = sc.nextInt();
			vet[quarto-1] = new Alugar(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vet[i] != null) {
				System.out.println((i+1) + ": " + vet[i]);
			}
		}
		sc.close();
	}
}
