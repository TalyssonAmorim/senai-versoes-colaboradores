package exercicios;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		double num, denom;
		System.out.println("Entre com o numerador: ");
		num  = new Scanner(System.in).nextInt();
		
		System.out.println("Entre com o denominador: ");
		denom = new Scanner(System.in).nextInt();
		
		if (denom != 0) {
			double real = num/denom;
			System.out.println("O resultado é: "+real);
		}else {
		System.out.println("Voce digitou um valor invalido para efetuar a divisao");
		}
	}

}
