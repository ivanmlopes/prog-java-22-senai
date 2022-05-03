package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValores = 1;
		while (intValores != 2) {
		System.out.println("Calculo IMC");
		Scanner sc = new Scanner(System.in);
		System.out.println("Peso");
		double dblP = sc.nextDouble();
		System.out.println("Altura");
		double dblA = sc.nextDouble();
		double dblIMC = dblP / Math.pow(dblA, 2);
		System.out.println(" O valor do IMC é: " + dblIMC);
		if (dblIMC <= 20)
			System.out.println("Abaixo do peso");
		else if (dblIMC >= 20 && dblIMC <= 25)
			System.out.println("Normal");
		else if (dblIMC > 25 && dblIMC <= 30)
			System.out.println("Excesso de peso");
		else if (dblIMC > 30 && dblIMC <= 35)
			System.out.println("Obesidade");
		else if (dblIMC > 35)
			System.out.println("Obesidade morbida");
		System.out.println("Deseja continua (1-Sim,2-Não");
		intValores = sc.nextInt();
		}
	}

}
