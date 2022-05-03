package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoJurosFuturos {
	public static void main(String[] args) {
	System.out.println("Calculo Juros Futuros");
	System.out.println("Valor a Ser aplicado A: ");
	Scanner sc = new Scanner(System.in);
	double dblA = sc.nextDouble();
	System.out.println("Tempo de aplicação em meses B: ");
	double dblB = sc.nextDouble();
	System.out.println("Taxa de Juros ao mês: ");
	double dblC = sc.nextDouble();
	//
	double dblFV = dblA * Math.pow(1 + dblC / 100.00, dblB);
	System.out.println("Valor futuro da aplicação é: " + dblFV);
	
	
	}
}
