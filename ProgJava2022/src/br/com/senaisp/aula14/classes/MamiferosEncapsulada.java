package br.com.senaisp.aula14.classes;

public class MamiferosEncapsulada {
	private String Pele;
	private String Olhos;
	private String Boca;
	private double Peso;
	public String getPele() {
		return Pele;
	}
	public void setPele(String pele) {
		Pele = pele;
	}
	public String getOlhos() {
		return Olhos;
	}
	public void setOlhos(String olhos) throws Exception {
		if(!olhos.equalsIgnoreCase("castanho") &&
			!olhos.equalsIgnoreCase("azul") &&
			!olhos.equalsIgnoreCase("preto") &&
			!olhos.equalsIgnoreCase("verde"))
			//System.out.println("Valor Invalido para os olhos");
			throw new Exception("Valor Invalido para os olhos");
		else
			Olhos = olhos;
	}
	public String getBoca() {
		return Boca;
	}
	public void setBoca(String boca) {
		Boca = boca;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	
}
