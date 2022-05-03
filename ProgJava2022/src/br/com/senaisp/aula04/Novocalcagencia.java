package br.com.senaisp.aula04;

import java.util.Scanner;

public class Novocalcagencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Calc dig");
System.out.println("entre com numero digito");
Scanner sc = new Scanner(System.in);
int intNrA = sc.nextInt();
int intUn = intNrA % 10;
int intDz = intNrA % 100 / 10;
int intCn = intNrA % 1000 / 100;
int intMl = intNrA / 1000;
int intSoma = intUn * 6 + intDz * 7 + intCn * 8 + intMl * 9;
int intDig = 10 - intSoma % 10;
System.out.println("O digito verificadoé " + intDig);




	}

}
