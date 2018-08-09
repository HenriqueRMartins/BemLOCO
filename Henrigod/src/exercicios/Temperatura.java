package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.print("Digite 1 para Fahrenheit e 2 para Celsius: ");
		int opcao = teclado.nextInt();
		while(opcao > 2) {
			System.out.print("Número incorreto, selecione 1 ou 2:");
			opcao = teclado.nextInt();
		}
		System.out.print("Digite a temperatura para conversão: ");

		double temperatura = teclado.nextFloat();
		if (opcao==1) {double celsius=(temperatura-32)/1.8;
		System.out.println("a temperatura em fahrenheit é: "+formatador.format(celsius));
		} else {
			double fahrenheit=(temperatura*1.8)+32;
			System.out.println("a temperatura em fahrenheit é: "+formatador.format(fahrenheit));

		}
	}

}

