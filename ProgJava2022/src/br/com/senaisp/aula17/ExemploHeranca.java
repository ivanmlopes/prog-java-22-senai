package br.com.senaisp.aula17;

import br.com.senaisp.aula17.classes.*;

public class ExemploHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamiferos mam[] = new Mamiferos[4];
		//Criando um cachorro
		mam[0] = new Cachorro();
		mam[0].setCorPelo("Malhado");
		mam[0].setIdade(5);
		mam[0].setNome("Toto");
		// cast
		((Cachorro) mam[0]).setRaca("SRD");
		//Criando um gato
		mam[1] = new Gato();
		mam[1].setCorPelo("Preto");
		mam[1].setIdade(3);
		mam[1].setNome("Gatinho");
		// cast
		((Gato) mam[1]).setRaca("SRD");
		((Gato) mam[1]).setPorte("Pequeno");
		//criando um humano
		mam[2] = new Humano();
		mam[2].setCorPelo("Loiro");
		mam[2].setIdade(30);
		mam[2].setNome("Jorge");
		//cast
		((Humano)mam[2]).setCorPele("Branca");
		//criando mamifero generico
		mam[3] = new Mamiferos();
		mam[3].setCorPelo("azul");
		mam[3].setIdade(45);
		mam[3].setNome("Avatar");
		for (int intI=0;intI<4;intI++) {
			System.out.println("Nome: " + mam[intI].getNome());
			System.out.println("Cor pelo: " + mam[intI].getCorPelo());
			System.out.println("Idade: " + mam[intI].getIdade());
			mam[intI].Falar();
			//testando se é humano
			if (mam[intI] instanceof Humano) {
				System.out.println("Eu sou um humano");
			}
			System.out.println("----------------------");
		}
		
	}

}
