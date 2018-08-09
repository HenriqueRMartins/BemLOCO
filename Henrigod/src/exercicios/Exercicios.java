package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.print("Digite o tempo da viagem: ");
		double tempo = teclado.nextDouble();
		System.out.print("Digite a velocidade média: ");
		double velocidade = teclado.nextDouble();
		double kmlitro=10;
		double distancia = tempo*velocidade;
		double consumo = distancia/kmlitro;
		System.out.println("Distancia percorrida: "+formatador.format(distancia));
		System.out.println("Tempo: "+formatador.format( tempo));
		System.out.println("Velocidade média: "+formatador.format(velocidade));
		System.out.println("Combustível ultilizado: "+formatador.format(consumo));
		
		

	}

}
