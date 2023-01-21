package exercicios;

import java.util.Scanner;

public class OrdemCrecente {

	public static void main(String[] args) {
		int num, num1; 
		int maior = 0, menor = 0;
		do{
			try (Scanner cont = new Scanner(System.in)){
				System.out.println("Entre com o primeiro numero: ");
				num = cont.nextInt();
				System.out.println("Entre com o segundo numero: ");
				num1 = cont.nextInt();
			}
			if(num > num1) {
				System.out.println("A ordem é "+ num1 +" "+num);
			}else {
				System.out.println("A ordem é "+ num +" "+num1);
			}
	}while(num !=-1);
		System.out.println("Encerrado o vetor");
		System.out.println("O Maior numero inserido foi: "+maior);
		System.out.println("O Menor numero inserido foi: "+menor);

}
}