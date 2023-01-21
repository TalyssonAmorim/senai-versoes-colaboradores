package exercicios;


import javax.swing.JOptionPane;

public class Crecente {

	public static void main(String[] args) {
		int num1, num2, num3, aux;
		
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;

        }
         
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
     
        JOptionPane.showMessageDialog(null, "Ordem crescente: " + num1 + " " + num2 + " " + num3);

        JOptionPane.showMessageDialog(null, "Ordem decescente: " +num3 +" "+ num2 + " " + num1);

	}

}
