package visao;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 264);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(153, 255, 153));
		textField.setBounds(158, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel txtNome = new JLabel("Nome:");
		txtNome.setBounds(79, 24, 46, 14);
		contentPane.add(txtNome);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(153, 255, 153));
		textField_1.setBounds(158, 63, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel txtCPF = new JLabel("CPF:");
		txtCPF.setBounds(79, 66, 46, 14);
		contentPane.add(txtCPF);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(204, 255, 153));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum nome preenchido!");
					
				}
				if (cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF preenchido!");
					
				}
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCPF(Long.valueOf(cpf));
				
				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
				bdPessoa.inserir(func);
				
			}
		});
		btnSalvar.setBounds(106, 161, 89, 23);
		contentPane.add(btnSalvar);
	}
}
