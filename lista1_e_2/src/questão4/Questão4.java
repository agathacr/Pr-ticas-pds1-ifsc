package questão4;

import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;

public class Questão4 extends JFrame implements ActionListener {
	
    private JTextField f1, f2;
    private JButton b1, b2, b3, b4;
    
    public Questão4() {
        super("Calculadora");
        setLayout(new FlowLayout());
        
        f1 = new JTextField(10);
        add(f1);
        
        f2 = new JTextField(10);
        add(f2);
        
        b1 = new JButton("+");
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("-");
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("/");
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("*");
        b4.addActionListener(this);
        add(b4);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(f1.getText());
        double n2 = Double.parseDouble(f2.getText());
        double r = 0;
        
              if (e.getSource() == b1) {
            r = n1 + n2;
        } else if (e.getSource() == b2) {
            r = n1 - n2;
        } else if (e.getSource() == b3) {
            r = n1 / n2;
        } else if (e.getSource() == b4) {
            r = n1 * n2;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + r);
    }

    public static void main(String[] args) {
        new Questão4();
    }
}

