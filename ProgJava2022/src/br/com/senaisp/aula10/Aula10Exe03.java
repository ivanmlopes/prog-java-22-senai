package br.com.senaisp.aula10;

import java.util.Scanner;

public class Aula10Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResp;
		int intCodigoVen, intQtdePc;
		double dblPrecoUn, dblPrecoTot, dblTotalVend;
		String strNome;
		// Scanner
		Scanner sc = new Scanner(System.in);
		do {
			dblTotalVend = 0;
			do {
				// Entrada do c�digo do vendedor com tratamento
				do {
					System.out.println("Sistema caixa de supermercado");
					System.out.println("Digite codigo do produto: (0-Fim)");
					intCodigoVen = sc.nextInt();
				} while (intCodigoVen < 0);
				// S� posso digitar os dados da venda se o vendedor for maior que zero
				if (intCodigoVen > 0) {
					sc.nextLine();// para retirar o enter do comando anterior
					// Entrada de nome
					do {
						System.out.println("descri��o do produto:");
						strNome = sc.nextLine();
					} while (strNome.isEmpty() || strNome.length() < 3);

					// Entrada da quantidade de itens
					do {
						System.out.println("quantidade do produto:");
						intQtdePc = sc.nextInt();
					} while (intQtdePc <= 0);

					// Entrando com o pre�o unit�rio
					do {
						System.out.println("Digite o pre�o unit�rio:");
						dblPrecoUn = sc.nextDouble();
					} while (dblPrecoUn <= 0);
					dblPrecoTot = dblPrecoUn * intQtdePc;
					System.out.println("Total da venda: R$ " + dblPrecoTot);
					dblTotalVend += dblPrecoTot;
				}
			} while (intCodigoVen != 0);
			System.out.println("Total da venda: R$ " + dblTotalVend);
			do {
				System.out.println("Continuar? (1-Sim,2-N�o)");
				intResp = sc.nextInt();
				if (intResp != 1 && intResp != 2)
					System.out.println("Valores permitidos s�o 1 ou 2!");
			} while (intResp != 1 && intResp != 2);
		} while (intResp != 2);
		sc.close(); // Finalizando o recurso do scanner

	}

}
