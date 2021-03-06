package br.com.senaisp.Aula30;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploTreeSet {



	private Set <String> listaFilmes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploTreeSet ex = new ExemploTreeSet();
		ex.listaFilmes = new TreeSet<String>();

		System.out.println("Exemplo de uso de interface List");
		System.out.println();

		ex.insere("Blade Runner - O Ca?ador de androides");
		ex.insere("O Exterminador do Futuro 2");
		
		ex.insere("Apocalipse Now");
		ex.insere("Star Wars IV - Uma nova esperan?a");
		
		ex.insere("Curtindo a vida adoidado");
		ex.insere("Dracula - De Bram Stocker");
		ex.insere("2001 - Uma Odisseia no Espa?o");

		ex.imprimirLista();
		
		ex.remove("Apocalipse Now");
		ex.remove("2001 - Uma Odisseia no Espa?o");
		
		ex.imprimirLista();

	}

	public void insere(String strTitulo) {
		listaFilmes.add(strTitulo);
	}

	public void remove(String strTitulo) {
		listaFilmes.remove(strTitulo);
	
	}

	public void imprimirLista() {
		System.out.println();
		System.out.println();
		Iterator<String> iteratorLista = listaFilmes.iterator();
		while (iteratorLista.hasNext()) {
			System.out.println("Titulo do filme: " + iteratorLista.next());
		}
	}
}

