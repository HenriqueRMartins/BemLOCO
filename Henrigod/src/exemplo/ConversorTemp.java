package exemplo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorTemp {

	public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
		
		int tipo;
		double temp, conversao;
		
		System.out.println("Digite 1 de C para F, ou 2 de F para C, ou 3 de C para K, ou 4 de K para C, ou 5 de F para K ou 6 de K para F, ou 7 para sair: ");
		tipo =  teclado.nextInt();
		while (tipo !=7) {
		
		switch (tipo) {
		case 1: 
			converteCelsiusFahrenheit();
			break;
		 
		case 2: 
			converteFahrenheitCelcius();
			break;
			
		case 3: 
			converteCelsiusKevin();
			break;
			
		case 4: 
			converteKevinCelsius();
			break;
			
		case 5: 
			convertFahrenheitKevin();
			break;
			
		case 6:
			convertKevinFahrenheit();
			break;
			
		
		default:
			System.out.println("Opção inválida");
			break;
			
			
			
		}
		System.out.println("Digite 1 de C para F, ou 2 de F para C, ou 3 de C para K, ou 4 de K para C, ou 5 de F para K ou 6 de K para F, ou 7 para sair: ");
		tipo =  teclado.nextInt();
		}

	}

	private static void convertKevinFahrenheit() {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("Digite a temperatura em Kevin: ");
		double temp = teclado.nextDouble();
		double conversao = ((temp - 273.15) * 1.8) + 32;
		System.out.println("A temperatura " + temp + "°K equivale a: "+ conversao +"°F");
		
	}

	private static void convertFahrenheitKevin() {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temp = teclado.nextDouble();
		double conversao = ((temp - 32) / 1.8) + 273.15;
		System.out.println("A temperatura " + temp + "°F equivale a: "+ conversao +"°K");
		
	}

	private static void converteKevinCelsius() {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("Digite a temperatura em Kevin: ");
		double temp = teclado.nextDouble();
		double conversao = temp - 273.15;
		System.out.println("A temperatura " + temp + "°K equivale a: "+ conversao +"°C");
		
	}

	private static void converteCelsiusKevin() {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("Digite a temperatura em Celsius: ");
		double temp = teclado.nextDouble();
		double conversao = temp + 273.15;
		System.out.println("A temperatura " + temp + "°C equivale a: "+ conversao +"°K");
		
	}

	private static void converteFahrenheitCelcius() {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temp = teclado.nextDouble();
		double conversao = (temp - 32) / 1.8;
		System.out.println("A temperatura " + temp + "°F equivale a: "+ conversao +"°C");
		
	}

	private static void converteCelsiusFahrenheit(){
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("Digite a temperatura em Celcius: ");
		double temp = teclado.nextDouble();
		double conversao = temp * 1.8 + 32;
		System.out.println("A temperatura " + temp + "°C equivale a: "+ conversao +"°F");
		
	}

}
