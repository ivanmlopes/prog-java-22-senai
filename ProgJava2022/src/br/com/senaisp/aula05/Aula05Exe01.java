package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Digite o valor: ");
Scanner sc = new Scanner (System.in);
int intVal = sc.nextInt ();
if (intVal % 2 == 0)
	System.out.println("Par");
else
	System.out.println("Impar");

	

	}
}
