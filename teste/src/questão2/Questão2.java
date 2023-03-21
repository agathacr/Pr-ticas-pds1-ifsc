package questão2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Questão2 {
	
	public static void main(String[] args) {
    
    ArrayList<String> listaDN = new ArrayList<String>();

   
    for (int i = 0; i < 10; i++) {
        String nome = JOptionPane.showInputDialog("Digite um nome " + (i + 1) + ":");
        listaDN.add(nome);
    }

    JOptionPane.showMessageDialog(null, "Nomes digitados:" + listaDN);
}
}


