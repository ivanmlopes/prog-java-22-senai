package br.com.senaisp.aula03;

import java.util.Scanner;

public class ExercicioAula03Atv02 {

	public static void main(String[] args) {
		System.out.println("Conver��o a temperatura");
		Scanner sc = new Scanner (System.in);
		double dlbValorCelsius = sc.nextDouble();
		double dlbValorF = 9 * dlbValorCelsius / 5 + 32;
	System.out.println("dlb ValorCelsius �:" + dlbValorF);
	
	System.out.println("nova conver��o");
	double dlbTemp = sc.nextDouble();
	System.out.println("Temp F �: " + (9 * dlbTemp / 5 + 32));
	
	
	}
}

	
