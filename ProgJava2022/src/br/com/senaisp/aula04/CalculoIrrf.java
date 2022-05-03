package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoIrrf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo IRRF");
		System.out.println("Digite Salario Base A: ");
		Scanner sc = new Scanner(System.in);
		double dblA = sc.nextDouble();
		System.out.println("Digite nr Dependentes B: ");
		double dblB = sc.nextDouble();
		System.out.println("Digite deducaoDependes C: ");
		double dblC = sc.nextDouble();
		System.out.println("DeducaoInss D: ");
		double dblD = sc.nextDouble();
		System.out.println("deducaoImposto E: ");
		double dblE = sc.nextDouble();
//base irrf
		double dblBase = dblA - dblB * dblC - dblD;
		System.out.println("O valor da Base Irrf é: " + dblBase);
		double dblIrrf = dblBase * 27.5 / 100.00 - dblE;
		System.out.println("O valor é: " + (dblBase * 27.5 / 100 - dblE));
		
	

	}

}
