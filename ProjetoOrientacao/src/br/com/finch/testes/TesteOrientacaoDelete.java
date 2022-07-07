package br.com.finch.testes;

import javax.swing.JOptionPane;

import br.com.finch.classes.Orientacao;

public class TesteOrientacaoDelete {

	public static void main(String[] args) {

		Orientacao or = new Orientacao();
		or.setId(1);
		if (or.read()) {
			if (JOptionPane.showConfirmDialog(null, "Confirma a exclusao?", "Confirmação",
					JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {// inicio do if do dialogo
				if (!or.delete()) {// inicio do if da deleção
					System.out.println("Ocorreu um erro ao Excluir");
					System.out.println(or.getMsgErro());
				} else { // else da deleção
					System.out.println("Registro excluido com sucesso");
				} // fim do if da deleção
			} // fim do if do dialogo
		} else {// else if do read
			if (or.isHaErro()) {
				System.out.println("Ocorreu um erro na pesquisa");
			}
			System.out.println(or.getMsgErro());
		}
	}
}
