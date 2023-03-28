package questão5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Questão5 extends JFrame implements ActionListener {

    private JTextField lado1;
    private JTextField lado2;
    private JTextField lado3;
    private JButton verificarButton;

    public Questão5() {
        super("Verificador de Triângulos");

        lado1 = new JTextField(10);
        lado2 = new JTextField(10);
        lado3 = new JTextField(10);

        verificarButton = new JButton("Verificar");
        verificarButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Lado 1:"));
        panel.add(lado1);
        panel.add(new JLabel("Lado 2:"));
        panel.add(lado2);
        panel.add(new JLabel("Lado 3:"));
        panel.add(lado3);
        panel.add(new JLabel(""));
        panel.add(verificarButton);

        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(lado1.getText());
            double b = Double.parseDouble(lado2.getText());
            double c = Double.parseDouble(lado3.getText());

            if (a + b <= c || a + c <= b || b + c <= a) {
                JOptionPane.showMessageDialog(this, "Os lados inseridos não formam um triângulo.");
            } else if (a == b && b == c) {
                JOptionPane.showMessageDialog(this, "Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                JOptionPane.showMessageDialog(this, "Triângulo Isósceles");
            } else {
                JOptionPane.showMessageDialog(this, "Triângulo Escaleno");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira apenas números válidos nos campos.");
        }
    }

    public static void main(String[] args) {
        new Questão5();
    }
}
  
