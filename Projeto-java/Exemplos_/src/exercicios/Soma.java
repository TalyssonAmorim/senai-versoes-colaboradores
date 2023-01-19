package exercicios;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		double n1, n2, soma, subtracao, divisao, multiplicacao;
		
		try (Scanner captura = new Scanner (System.in)) {
			System.out.println("Digite um numero: ");
			n1 = captura.nextDouble( );
			System.out.println("Digite um numero: ");
			n2 = captura.nextDouble( );
		}
		
		soma = n1 + n2 ;
		subtracao = n1 - n2;
		divisao = n1 / n2;
		multiplicacao = n1 * n2;
		
		
		System.out.println("A soma de "+n1+" + "+n2+" é = "+soma);
		System.out.println("A subtração de "+n1+" - "+n2+" é = "+subtracao);
		System.out.println("A divisão de "+n1+" + "+n2+" é = "+divisao);
		System.out.println("A multiplicação de "+n1+" + "+n2+" é = "+multiplicacao);
		
	}
}
