package exercicios;

import java.util.Scanner;

public class Estaçoes {

	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner (System.in);  
		   int mes;  
		        System.out.println("Digite um numero correspondente a um mes do ano ");
		        mes =in.nextInt();
		        System.out.println("A estação do ano correspondente ao mês " +
		mes + " é " );
		        imprimeEstacao(mes);
		         
		        }
		public static void imprimeEstacao (int mes){
		        switch (mes){
		            case 1:System.out.println("Verão");break;
		            case 2:System.out.println("Verão");break;
		            case 3:System.out.println("Verão");break;    
		            case 4:System.out.println("Outono");break;
		            case 5:System.out.println("Outono");break;
		            case 6:System.out.println("Outono");break;
		            case 7:System.out.println("Inverno");break;
		            case 8:System.out.println("Inverno");break;
		            case 9:System.out.println("Inverno");break;
		            case 10:System.out.println("Primavera");break;
		            case 11:System.out.println("Primavera");break;  
		            case 12:System.out.println("Primavera");break;
		            default:System.out.println("Numero invalido");    
		        }


	}

}
