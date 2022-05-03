package br.com.senaisp.aula06;

public class ExemplosComandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intValores = 10;
while ( intValores >= 0 ) {
	if (intValores%2==0)
		System.out.println("O valor " + intValores + " é par.");
	else
		System.out.println("O valor " + intValores + " é impar.");
	intValores--;
}
	}

}
