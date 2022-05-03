package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResposta = 1;
		while (intResposta != 2) {
			System.out.println("Area do cilindro");
			Scanner sc = new Scanner(System.in);
			System.out.println("raio");
			double dblR = sc.nextDouble();
			System.out.println("altura");
			double dblA = sc.nextDouble();
			double dblPI = 3.1415;
			double dblF = 2 * dblPI * dblR * (dblR + dblA);
			System.out.println(" O Valor da área é: " + dblF);
			System.out.println("Deseja continuar? (1-sim,2-não)");
			intResposta = sc.nextInt();
			
					
		}

	}
}
