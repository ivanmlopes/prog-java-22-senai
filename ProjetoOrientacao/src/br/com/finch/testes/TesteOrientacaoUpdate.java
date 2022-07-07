package br.com.finch.testes;

import br.com.finch.classes.Orientacao;

public class TesteOrientacaoUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orientacao or = new Orientacao();
		or.setId(2);
		if (or.read()) {
			or.setTitulo(or.getTitulo() + " - Alterado");
			if (!or.update()) {
				System.out.println("Ocorreu um erro ao alterar");
				System.out.println(or.getMsgErro());
			} else {
				System.out.println("Registro Alterado com sucesso");
			}
		} else {
			if (or.isHaErro()) {
				System.out.println("Ocorreu um erro na pesquisa");
			}
			System.out.println(or.getMsgErro());
		}
	}
}