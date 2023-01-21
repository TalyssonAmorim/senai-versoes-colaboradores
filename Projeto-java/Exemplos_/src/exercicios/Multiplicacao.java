package exercicios;

import java.util.Scanner;

public class Multiplicacao {

	private static Scanner ent;

	public static void main(String[] args) {
		  ent = new Scanner(System.in);
	       int base, pot;
	       int res = 1;
	             
	        do{
	        	System.out.println("Digite o 1º número: ");
	        	base = ent.nextInt();
	        	
	        	if(base != 0) {
	        		System.out.println("Digite o 2º número: ");
	        		pot = ent.nextInt();
	        		
	        		res = base * pot;
	        		System.out.println("o resultado da multiplicação é :" + res);
	        	}
	        	

	        }while((base != 0));
	        System.out.println("Você digitou 0. O programa foi finalizado.");
	}

}
