package exercicios;

import java.util.Scanner;

public class MaiorIdade {
	public static void main(String[] args) {
		int idade;
		
			System.out.println("Entre com a sua idade: ");
			try (var scanner = new Scanner(System.in)) {
				idade = scanner.nextInt();
			}
			if (idade < 18) {
				System.out.println("você é menor de idade ! ");
			} else {
				System.out.println("você é maior de idade ! ");
			}
		}
	}

