package questão6;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class Questão6 extends JFrame implements ActionListener {
	    private JTextField campoNome, campoNota1, campoNota2, campoNota3;
	    private JLabel labelNome, labelNota1, labelNota2, labelNota3;
	    private JButton botaoCalcular;

	    public Questão6() {
	        super("Cálculo de média");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel painelPrincipal = new JPanel(new GridLayout(5, 2));

	        labelNome = new JLabel("Nome:");
	        campoNome = new JTextField();
	        painelPrincipal.add(labelNome);
	        painelPrincipal.add(campoNome);

	        labelNota1 = new JLabel("Nota 1:");
	        campoNota1 = new JTextField();
	        painelPrincipal.add(labelNota1);
	        painelPrincipal.add(campoNota1);

	        labelNota2 = new JLabel("Nota 2:");
	        campoNota2 = new JTextField();
	        painelPrincipal.add(labelNota2);
	        painelPrincipal.add(campoNota2);

	        labelNota3 = new JLabel("Nota 3:");
	        campoNota3 = new JTextField();
	        painelPrincipal.add(labelNota3);
	        painelPrincipal.add(campoNota3);

	        botaoCalcular = new JButton("CALCULAR");
	        botaoCalcular.addActionListener(this);
	        painelPrincipal.add(botaoCalcular);

	        add(painelPrincipal);

	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == botaoCalcular) {
	            String nome = campoNome.getText();
	            double nota1 = Double.parseDouble(campoNota1.getText());
	            double nota2 = Double.parseDouble(campoNota2.getText());
	            double nota3 = Double.parseDouble(campoNota3.getText());

	            double media = (nota1 + nota2 + nota3) / 3;

	            JOptionPane.showMessageDialog(null, "A média do(a) estudante " + nome + " é " + media);
	        }
	    }

	    public static void main(String[] args) {
	        new Questão6();
	    }
	}


