package br.com.senaisp.aula02;

import java.util.Scanner;

public class ExemplosTiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int soma = 5 + 3;
System.out.println("Soma: " + soma);

int subtracao = 5 - 3;
System.out.println("Subtração: " + subtracao);

int multiplicacao = 5 * 3;
System.out.println("Multiplicação: " + multiplicacao);

int divisao = 6 / 3;
System.out.println("Divisão: " + divisao);

int valor = 5 % 3;
System.out.println("Resto de divisão: " + valor);

double divisaof = 5.00 / 2.00;
System.out.println("Divisão: "+ divisaof);

System.out.println("Mostrando um valor: 10");
System.out.println("Outro valor: 11");

Scanner sc = new Scanner(System.in);
System.out.println("Digite seu nome:");
String nome=sc.nextLine ();
System.out.println("Olá "+ nome);

	}

}
