package br.com.finch.testes;

import br.com.finch.classes.Orientacao;

public class TesteOrientacaoCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orientacao or = new Orientacao();
		
		or.novo();
		or.setPalavraChave("Triagem, Subsidios, Documentos,");
		or.setTitulo("Fluxo de Documento");
		or.setTexto("Mussum Ipsum, cacilds vidis litro abertis. "
				+ "Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget."
				+ "Viva Forevis aptent taciti sociosqu ad litora torquent.Si u mundo tá muito paradis? "
				+ "Toma um mé que o mundo vai girarzis!Quem manda na minha terra sou euzis!");
		if(or.create()) {
			System.out.println("Registro incluido com sucesso");
		}else {
			System.out.println("Ocorreu um erro");
			System.out.println(or.getMsgErro()
					);
		}
	}

}
