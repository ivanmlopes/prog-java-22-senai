package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalcDigVerAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1� Digito �: ");
Scanner sc = new Scanner (System.in);
double dblA = sc.nextDouble();
System.out.println("2� Digito �: ");
double dblB = sc.nextDouble();
System.out.println("3 Digito �: ");
double dblC = sc.nextDouble();
System.out.println("4� Digito �: ");
double dblD = sc.nextDouble();

double dblSoma = dblA * 9 + dblB * 8 + dblC * 7 + dblD * 6;
double dblSomaF = 10 - dblSoma % 10;
System.out.println(" O Digito da ag�ncia �:" + dblSomaF);



	}

}
