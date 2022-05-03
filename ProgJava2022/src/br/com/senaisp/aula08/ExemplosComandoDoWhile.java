package br.com.senaisp.aula08;

import java.time.LocalDate;
import java.util.Scanner;

public class ExemplosComandoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intResp;
Scanner sc = new Scanner (System.in);
do {
	System.out.println("Programa de calculo de idade");
	System.out.println("Digite o ano de seu nascimento");
	int intAnoNascimento = sc.nextInt();
    // obtendo o ano atual
	int intAnoAtual = LocalDate.now().getYear();
	int intIdade = intAnoAtual - intAnoNascimento;
	System.out.println("Sua idade é " + intIdade);
	System.out.println("Deseja continuar? (1-Sim,2-não");
	intResp = sc.nextInt();
} while(intResp != 2);
sc.close();
	}

}
