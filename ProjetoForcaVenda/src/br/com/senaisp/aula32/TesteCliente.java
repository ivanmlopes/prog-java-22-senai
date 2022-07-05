package br.com.senaisp.aula32;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import br.com.senaisp.aula32.classes.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		
		cli.setNome("Roberto");
		cli.setEndereco("Rua das Ruas");
		cli.setNumero("S/N");
		cli.setBairro("Centro");
		cli.setCidade("Bauru");
		cli.setUf("SP");
		cli.setCep("17054000");
		cli.setCpf("111.111.111-00");
		cli.setRg("11.111.111-1");
		
	
		
		try {
			//cli.criarNaoUse();
			cli.criar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cli.setId(7);
		try {
			if(cli.ler()) {
				System.out.println("Nome: " + cli.getNome());
				System.out.println("Endereço: " + cli.getEndereco());
				System.out.println("Numero: " + cli.getNumero());
				System.out.println("Complemento: " + cli.getComplemento());
				System.out.println("Data Nascimento: " + cli.getData_nasc());
				
				//cli.setNome(cli.getNome() + " - Alterado");
				//cli.setComplemento("Complemento colocado");
				//cli.alterar();
				
				
				System.out.println("Confirmar exclusão? (SIM/NÃO)");
				Scanner scn = new Scanner(System.in);
				String conf = scn.nextLine();
				if (conf.equalsIgnoreCase("Sim")) {
					cli.apagar();
					System.out.println("Registro apagado com sucesso");
					}
				scn.close();
				
			} else {
				System.out.println("Cliente não encontrado!");
			}
		} catch (ParseException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
