package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intResp = 1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Verifica��o do n�mero primo");
		System.out.println("Digite um n�mero a ser verificado");
		int intNr = sc.nextInt();
		int intContDivisores = 1;
		int intContador = 1;
		while (intContador<intNr) {
			intContador++;
			if (intNr % intContador == 0)
				intContDivisores++;
			if (intContDivisores>2)
				System.out.println("O n�mero n�o � primo");
			else
				System.out.println("o n�mero � primo");
		}
	}

}
