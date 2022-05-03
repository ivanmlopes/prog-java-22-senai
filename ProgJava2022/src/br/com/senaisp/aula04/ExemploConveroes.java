package br.com.senaisp.aula04;

import java.util.Scanner;

public class ExemploConveroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double dblTeste = 51.12;
System.out.println("Double: "+ dblTeste);
float fltTeste = (float) dblTeste;
System.out.println("Float: " + fltTeste);
long lngTeste = (long) fltTeste;
System.out.println("Long: " + lngTeste);
int intTeste = (int) lngTeste;
System.out.println("Int: " + intTeste);
Scanner sc = new Scanner (System.in);
double intIdade = 51 * 365.25;
System.out.println("Valor da idade em dias é: " + intIdade);
short shtTeste = (short) intTeste;
System.out.println("Short: " + shtTeste);
byte byteTeste = (byte) shtTeste;
System.out.println("Byte: " + byteTeste);

System.out.println("Converter de String para número");
String strValor = "52";
dblTeste = Double.parseDouble(strValor);
System.out.println("Double: " + dblTeste);

fltTeste = Float.parseFloat(strValor);
System.out.println("Float: " + fltTeste);

lngTeste = Long.parseLong(strValor);
System.out.println("Long: " + lngTeste);

intTeste = Integer.parseInt(strValor);
System.out.println("Int: " + intTeste);

shtTeste = Short.parseShort(strValor);
System.out.println("Short: " + shtTeste);

byteTeste = Byte.parseByte(strValor);
System.out.println("Byte: " + byteTeste);

System.out.println("Transformar string em char");
intTeste = 65;
char chrTeste = (char) intTeste;
System.out.println("Char: " + chrTeste);

dblTeste = 52.12;
String strTeste = Double.toString(dblTeste);
System.out.println("Double para String: " + strTeste);

fltTeste = 52.12f;
strTeste = Float.toString(fltTeste);
System.out.println("Float para String: " + fltTeste);

lngTeste = 523;
strTeste = Long.toString(lngTeste);
System.out.println("Long para String: " + lngTeste);

intTeste = 523;
strTeste = Integer.toString(intTeste);
System.out.println("Integer para String: " + intTeste);

shtTeste = 52;
strTeste = Short.toString(shtTeste);
System.out.println("Short para String: " + shtTeste);

byteTeste = 52;
strTeste = Byte.toString(byteTeste);
System.out.println("Byte para String: " + byteTeste);

System.out.println("Convertendo numeros para outras bases");
intTeste = 256;
strTeste = Integer.toString(intTeste, 2);
System.out.println("O número " + intTeste + " em binário é: " + strTeste);

intTeste = 256;
strTeste = Integer.toString(intTeste, 16);
System.out.println("O número " + intTeste + " em hexadecimal é: " + strTeste);

strTeste = Integer.toString(intTeste, 8);
System.out.println("O número " + intTeste + " em octal é:" + strTeste);

strTeste = "ff";
intTeste = Integer.parseInt(strTeste, 16);
System.out.println("hexadecimal" + strTeste + " na base 10: " + intTeste);

strTeste = "11111111";
intTeste = Integer.parseInt(strTeste, 2);
System.out.println("Binário " + strTeste + " na base 10: " + intTeste);

strTeste = "377";
intTeste = Integer.parseInt(strTeste, 8);
System.out.println("Octal " + strTeste + " na base 10: " + intTeste);















	}

}
