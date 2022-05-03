package br.com.senaisp.aula03;

import java.util.Scanner;

public class ExercicioAula03Atv02 {

	public static void main(String[] args) {
		System.out.println("Converção a temperatura");
		Scanner sc = new Scanner (System.in);
		double dlbValorCelsius = sc.nextDouble();
		double dlbValorF = 9 * dlbValorCelsius / 5 + 32;
	System.out.println("dlb ValorCelsius é:" + dlbValorF);
	
	System.out.println("nova converção");
	double dlbTemp = sc.nextDouble();
	System.out.println("Temp F é: " + (9 * dlbTemp / 5 + 32));
	
	
	}
}

	
