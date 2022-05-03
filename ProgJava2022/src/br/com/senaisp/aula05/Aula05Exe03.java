package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o valor: ");
		Scanner sc = new Scanner(System.in);
		double dblVal = sc.nextDouble();
		double dblValor = dblVal * 0.3;
		if (dblValor <= 600 && dblVal >= 601)
			System.out.println("Valor da parcela menor ou igual a 30% do salario bruto.Empréstimo poderá ser concedido!");
		else
			System.out.println("Valor da parcela superior a 30% do salario bruto. Emprestimo será negado!");
		
	}
}
