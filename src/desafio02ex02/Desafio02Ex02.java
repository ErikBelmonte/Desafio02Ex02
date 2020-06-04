package desafio02ex02;

import javax.swing.JOptionPane;

public class Desafio02Ex02 {
    public static void main(String[] args) {
        
        /* Dados 5 números, monte um algoritmo que permita obter como resultado a soma, o
        produto e a média dos valores recebidos. */
        
        double n1, n2, n3, n4, n5, r;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para N1:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para N2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para N3:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para N4:"));
        n5 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para N5:"));
        r = n1 + n2 + n3 + n4 + n5;
            JOptionPane.showMessageDialog(null, "A soma total dos números foi: "+r);
    }
    
}
