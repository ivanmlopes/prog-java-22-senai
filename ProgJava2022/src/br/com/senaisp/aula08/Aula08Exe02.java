package br.com.senaisp.aula08;

import java.util.Scanner;

public class Aula08Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intContador = 0, intSoma = 0;
int intNumero;
Scanner sc = new Scanner (System.in);
System.out.println("Programa contador de numeros positivos");
do {
	System.out.println("Digite um numero positivo: " + "(negativo finaliza o programa)");
	intNumero = sc.nextInt();
	if (intNumero >= 0) {
		intContador++;
		intSoma += intNumero; 
	}	
} while (intNumero >= 0);
if (intContador>0)
System.out.println("A quantidade média de numeros positivos digitados foi de " + (intSoma / intContador));
	}

}
