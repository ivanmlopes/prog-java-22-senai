package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula07Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Número do fatorial");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor a ser calculado o fatorial");
		int intValor = sc.nextInt();
		int intRes = 1;
		for ( int intCont=intValor;intCont>1;intCont--) {
			intRes*=intCont;
	}
		System.out.println("O resultado é: " + intRes);
	}
}
