package br.com.finch.testes;

import br.com.finch.classes.Orientacao;

public class TesteOrientacaoRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orientacao or = new Orientacao();
		or.setId(2);
		if(or.read()) {
			System.out.println("Registro Encontrado");
			System.out.println("Palavras Chaves: " + or.getPalavraChave());
			System.out.println("Titulo: " + or.getTitulo());
			System.out.println("Texto: " + or.getTexto());
		}else {
			if(or.isHaErro()) {
				System.out.println("Ocorreu um erro");
			}
			System.out.println(or.getMsgErro());
		}
	}

}
