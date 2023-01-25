package exercicios;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String mes = "";
		
		System.out.println("Entre com o nome do Mês: ");
		mes = entrada.next();
		
		if(mes.equalsIgnoreCase("janeiro")) {
			System.out.println("1");
		}
		else if(mes.equalsIgnoreCase("fevereiro")) {
			System.out.println("2");
		}
		else if(mes.equalsIgnoreCase("merço")) {
			System.out.println("3");
		}
		else if(mes.equalsIgnoreCase("abril")) {
			System.out.println("4");
		}
		else if(mes.equalsIgnoreCase("maio")) {
			System.out.println("5");
		}
		else if(mes.equalsIgnoreCase("junho")) {
			System.out.println("6");
		}
		else if(mes.equalsIgnoreCase("julho")) {
			System.out.println("7");
		}
		else if(mes.equalsIgnoreCase("agosto")) {
			System.out.println("8");
		}
		else if(mes.equalsIgnoreCase("setembro")) {
			System.out.println("9");
		}
		else if(mes.equalsIgnoreCase("outubro")) {
			System.out.println("10");
		}
		else if(mes.equalsIgnoreCase("novembro")) {
			System.out.println("11");
		}
		else if(mes.equalsIgnoreCase("dezembro")) {
			System.out.println("12");
		}else {	
				System.out.println("Mês invalido");			
		}
		
		

	}

}
