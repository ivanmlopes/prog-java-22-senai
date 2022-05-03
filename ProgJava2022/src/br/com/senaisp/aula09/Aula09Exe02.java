package br.com.senaisp.aula09;

public class Aula09Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tabela de numeros");
		for (int intLinha = 1; intLinha <= 9; intLinha += 1) {
			for (int intColuna = 1; intColuna <= 9; intColuna += 1)
				if (intColuna >= intLinha)
				System.out.print(intLinha + "-" + intColuna + " "); 
				else
					System.out.print("    ");
			System.out.println("");
	}
	}
}
