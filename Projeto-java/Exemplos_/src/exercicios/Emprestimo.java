package exercicios;

import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		double bruto, desconto;
		
		System.out.println("Digite o valor de seu salario bruto e em seguida o desconto");
		bruto = new Scanner(System.in).nextDouble();
		desconto = new Scanner(System.in).nextDouble();
		
		if(desconto < bruto) {
			double liquido = bruto - desconto;
			System.out.println("Digite o valor do emprestimo desejado");
			double emprestimo = new Scanner(System.in).nextDouble();
			if(emprestimo>liquido*0.3) {
				System.out.println("Desculpe, eprestimo foi negado");
			}else {
				System.out.println("voce pode obter o  eprestimo");
			}
		}else {
			System.out.println("Desculpe,voce digitou um valor invalido");
		}
			
	}

}