package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalcDigVerAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1º Digito é: ");
Scanner sc = new Scanner (System.in);
double dblA = sc.nextDouble();
System.out.println("2º Digito é: ");
double dblB = sc.nextDouble();
System.out.println("3 Digito é: ");
double dblC = sc.nextDouble();
System.out.println("4º Digito é: ");
double dblD = sc.nextDouble();

double dblSoma = dblA * 9 + dblB * 8 + dblC * 7 + dblD * 6;
double dblSomaF = 10 - dblSoma % 10;
System.out.println(" O Digito da agência é:" + dblSomaF);



	}

}
