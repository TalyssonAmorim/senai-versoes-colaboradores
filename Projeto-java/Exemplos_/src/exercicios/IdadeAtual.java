package exercicios;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class IdadeAtual {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String aniv = new String();
		
		 while (true) {
	            System.out.println("Informe a sua data de nascimento :");
				aniv = scan.next();
				
				if (!aniv.matches("\\d{2}/\\d{2}/\\d{4}")) {
				    System.out.println("Data inválida. Por favor, informe a data no formato dd/MM/yyyy");
				    continue;
				}
				
				String[] date = aniv.split("/");
				int day = Integer.parseInt(date[0]);
				int month = Integer.parseInt(date[1]);

				
				//Aqui tento fazer algumas verificações para o formato de data.
				if (month < 1 || month > 12) {
				    System.out.println("Data inválida. Por favor, informe um mês válido (1-12).");
				    continue;
				}

				if (day < 1 || day > 31) {
				    System.out.println("Data inválida. Por favor, informe um dia válido (1-31).");
				    continue;
				}
				//Aqui tento fazer uma verificação para o formato de data, mas sem sucesso ainda.
				
				
				
        	

				//Aqui converto a a String em formato de data desejado e comparo com a data atual para assim gerar a idade.
				
				LocalDate birthday = LocalDate.parse(aniv, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				LocalDate today = LocalDate.now();
				Period difference = Period.between(birthday, today);
				
				//Nova verificação para que a data inserida nao seja maior que a data atual
				
				if (birthday.isAfter(LocalDate.now())) {
								  System.out.println("Data de aniversário deve ser anterior a data atual.");
								  continue;
				}	  
				if (difference.isNegative()) {
								difference = difference.negated();
				}
				System.out.println("Sua idade atual então é : " + difference.getYears()+" Anos, "+ difference.getMonths()+" Messes e "+ difference.getDays()+" Dias.");
				return;
	     }
	}
}