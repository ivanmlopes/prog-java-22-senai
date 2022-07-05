package br.com.senaisp.aula15.classes;

public class ConversorTemperatura {
	private int tempOri;
	private int tempDes;
	private double temperatura;
	public ConversorTemperatura() {
		// TODO Auto-generated constructor stub
		this.tempOri=1;// Tipo temperatura origem
		this.tempDes=1;// Tipo temperatura destino
		this.temperatura=0;// Valor temperatura
	}
	public int getTempOri() {
		return tempOri;
	}
	public void setTempOri(int tempOri) throws Exception {
		if(tempOri!=1 && tempOri!=2 && tempOri!=3) {
		throw new Exception ("Valor Invalido!");
		}
		this.tempOri = tempOri;
	}
	public int getTempDes() {
		return tempDes;
	}
	public void setTempDes(int tempDes) throws Exception {
		if(tempDes!=1 && tempDes!=2 && tempDes!=3) {
		throw new Exception ("Valor Invalido!");
		}
		this.tempDes = tempDes;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getTemperaturaConvertida() {
		double dblTempConv = this.temperatura;
		if (tempOri == 1) { // testando origem celsius
			if (tempDes == 2) { // testando destino Fahrenheit
				dblTempConv = temperatura * 9 / 5 + 32;
			} else if (tempDes == 3) { // testando destino kelvin
				dblTempConv = temperatura + 273;
			}
		} else if (tempOri == 2) { // testando origem fahrenheit
			if (tempDes == 1) { // testando destino Celsius
				dblTempConv = (temperatura - 32) * 5 / 9;
			} else if (tempDes == 3) { // testando destino kelvin
				dblTempConv = (temperatura - 32) * 5 / 9 + 273;
			}
		} else { // Calculand origem Kelvin
			if (tempDes == 1) { // testando destino Celsius
				dblTempConv = temperatura - 273;
			} else if (tempDes == 2) { // testando destino Fahenheit
				dblTempConv = temperatura + 273;
			}
	}
		return dblTempConv;
	}
}