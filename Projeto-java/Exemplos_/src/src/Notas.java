package src;

import java.util.Scanner;

public class Notas {
		public static void main(String[] args) {
			try (Scanner ent = new Scanner(System.in)) {
				int nota1, nota2 , nota3 ;
				int media, i, contAluno = 0;
				
				
					
				for (i = 0; i < 3; i++) {
						contAluno++;
						//recebe a 1a nota
						System.out.println("Aluno " + contAluno + ", digite sua primeira nota : ");
						nota1 = ent.nextInt();
						
						//recebe a 2a nota
						System.out.println("Aluno " + contAluno + ", digite sua segunda  nota : ");
						nota2 = ent.nextInt();
						
						//recebe a 3a nota
						System.out.println("Aluno " + contAluno + ", digite sua terceira nota : ");
						nota3 = ent.nextInt();
						
						media = (nota1 + nota2 + nota3) / 3;
						
						System.out.println("A média do aluno " + contAluno + " é : "+ media+"\n");
						
						if((media >= 0) && (media  < 4 )) {
							System.out.println("Nota E\n");
						} else if (media < 5) {
							System.out.println("Nota D\n");
						} else if (media < 7) {
							System.out.println("Nota C\n");
						} else if (media < 8) {
							System.out.println("Nota B\n");
						}else {
							System.out.println("Nota A\n");
						}
					}
			}
				
			}
		}