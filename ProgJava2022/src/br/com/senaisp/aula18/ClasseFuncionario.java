package br.com.senaisp.aula18;

public class ClasseFuncionario {
	private int Chapa;
	private String NomeFunc;
	private String Endere�o;
	private double SalarioBase;
	private int nrDependentes;
	
	public int getChapa() {
		return Chapa;
	}
	public void setChapa(int chapa) throws Exception {
		if (chapa<=0) {
			throw new Exception("Deve ser maior que zero!");
		}
		Chapa = chapa;
	}
	public String getNomeFunc() {
		return NomeFunc;
	}
	public void setNomeFunc(String nomeFunc) throws Exception {
		if (NomeFunc.length()<5) {
			throw new Exception ("Nome deve ter mais que 5 letras");
		}
		NomeFunc = nomeFunc;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) throws Exception {
		if (Endere�o.length()<5) {
			throw new Exception ("Nome deve ter mais que 5 letras");
		}
		Endere�o = endere�o;
	}
	public double getSalarioBase() {
		return SalarioBase;
	}
	public void setSalarioBase(double salarioBase) throws Exception {
		if (SalarioBase<0) {
			throw new Exception ("Salario deve ser positivo");
		}
		SalarioBase = salarioBase;
	}
	public int getNrDependentes() {
		return nrDependentes;
	}
	public void setNrDependentes(int nrDependentes) throws Exception {
		if (nrDependentes<0) {
			throw new Exception ("Dependentes deve ser positivo");
		}
		this.nrDependentes = nrDependentes;
	}

	
	// TODO Auto-generated constructor stub

}
