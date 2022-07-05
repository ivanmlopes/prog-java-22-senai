package br.senaisp.testes;

import java.util.Scanner;

import br.senaisp.classes.Produto;

public class TesteProdutoDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prod = new Produto();
		
		prod.setId(1);
		
		if (prod.read()) {
			System.out.println("Produto encontrado!");
			System.out.println("Descri��o: " + prod.getDescricao());
			System.out.println("Saldo: " + prod.getSaldo());
			System.out.println("Pre�o: " + prod.getPreco());
			System.out.println("Local Estoque: " + prod.getLocalEstoque() );
			System.out.println("Confirma a exclus�o? (SIM/N�O)");
			Scanner scn = new Scanner(System.in);
			String resp = scn.nextLine();
			if (resp.equalsIgnoreCase("sim")) {
				if (prod.delete()) {
					System.out.println("Registro deletado com sucesso");
				}else {
					System.out.println("Houve um problema ao deletar o registro");
					System.out.println(prod.getMsgErro());
				}
			}
			scn.close();
		}else {
			if (prod.getHaErro()) {
				System.out.println("Ocorreu um erro ao executar a opera��o Read");
				
			}
			System.out.println(prod.getMsgErro());
		}
			
	}

}
