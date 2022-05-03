package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Digite um valor: ");
Scanner sc = new Scanner(System.in);
double dblVal = sc.nextDouble();
if (dblVal % 3 == 0 && dblVal % 5 == 0) 
	System.out.println("Divisivel por 3 e 5");
else 
	System.out.println("Não é divisivel por 3 e 5");
	}

}
