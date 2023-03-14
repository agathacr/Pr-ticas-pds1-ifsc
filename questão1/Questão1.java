package questão1;

import javax.swing.JOptionPane;

public class Questão1 {

	public static void main(String[] args) {

		double precoL = Double.parseDouble(JOptionPane.showInputDialog("preço do litro:"));
		int quantddL = Integer.parseInt(JOptionPane.showInputDialog("quantidade em litros:"));

		double totalPag = calcTotalPag(precoL, quantddL);

		JOptionPane.showMessageDialog(null, "Total a pagar: R$ " + totalPag);
	}

	public static double calcTotalPag(double precoL, double quantddL) {
		return precoL * quantddL;
	}
}

