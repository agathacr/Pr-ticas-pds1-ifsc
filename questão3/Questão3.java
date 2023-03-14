package questão3;

import javax.swing.JOptionPane;

public class Questão3 {

public static void main(String[] args) {
        
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        
       
        double media = (nota1 + nota2 + nota3) / 3;
        
       
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado(a)");
        } 
        else if (media >= 4 && media < 6) {
            JOptionPane.showMessageDialog(null, "Recuperação");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Reprovado(a)");
        }
    }


}
