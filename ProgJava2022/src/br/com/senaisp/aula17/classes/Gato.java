package br.com.senaisp.aula17.classes;

public class Gato extends Felino {
	private String Raca;

	public String getRaca() {
		return Raca;
	}

	public void setRaca(String raca) {
		Raca = raca;
		}
		public void Falar () {
			super.Falar();
			System.out.println("Miau");
	}
}
