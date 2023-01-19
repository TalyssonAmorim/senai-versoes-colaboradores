package br.com.fiap.tds;

public class TiposDeDados {
	
	public static void main(String[] args) {
		int soma, y, x, subtracao, multiplicacao, divisao, resto;
		
		x = 9;
		y = 2;
		
		soma = x + y;
		subtracao = x - y;
		multiplicacao = x * y;
		divisao = x / y;
		resto = x % y;
		
		System.out.println("resultado da adição:		  " + soma);
		System.out.println("resultado da subtração:		   " + subtracao);
		System.out.println("resultado da multiplicação:  	  " + multiplicacao);
		System.out.println("resultado da divisão:		   " + divisao);
		System.out.println("resultado do módulo:		   " + resto);
		
		x++;
		System.out.println("resultado do incremento de x:     " + x);
		
		y--;
		System.out.println("resultado do decremento de y:      " + y);
		
		x += 10;
		System.out.println("Atribuição adtiva de x:  	  " + x);
		
		y -= 10;
		System.out.println("Atribuição subtrativa de y:       " + y);
	}
	
}
