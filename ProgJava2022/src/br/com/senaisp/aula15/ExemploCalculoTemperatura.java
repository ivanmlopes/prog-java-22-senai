package br.com.senaisp.aula15;

import br.com.senaisp.aula15.classes.ConversorTemperatura;

public class ExemploCalculoTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorTemperatura conv = new ConversorTemperatura();
		try {
			conv.setTempOri(1);
			conv.setTempDes(2);
			conv.setTemperatura(35.00);
			System.out.println("Temperatura calculado é: " + conv.getTemperaturaConvertida());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
