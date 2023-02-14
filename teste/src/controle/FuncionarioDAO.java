package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDAO {
	private static ArrayList<Funcionario> ListadeFuncionarios;
	
	public  FuncionarioDAO() {
		ListadeFuncionarios = new ArrayList();
	}
	public boolean inserir (Funcionario func) {
		ListadeFuncionarios.add(func);
		return false;
	}
	public static FuncionarioDAO getInstance() {
		return null;
	}
	}


