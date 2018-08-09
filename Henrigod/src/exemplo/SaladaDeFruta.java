//		Random gerador = new Random();
//		int[] numerosSorteados = new int[5];
//		//Função de preencher o array aleatoriamente.
//		for(int i = 0; i < numerosSorteados.length; i++) {
//			numerosSorteados[i] = gerador.nextInt(6) +1;
		
//		for (int i = 0; i < numerosSorteados.length; i++)
//			System.out.println("Números Sorteado: "
//					+ numerosSorteados[i]);

package exemplo;

import java.util.Random;
import java.util.Scanner;

public class SaladaDeFruta {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		String[] frutas = new String[6];
		for (int i =0; i < frutas.length; i++) {
		System.out.println("Digite o nome de uma fruta: ");
		frutas[i] = teclado.next();
		}
		Random gerador = new Random();
		for (int i =0; i <3; i++) {
			int fruta1 = gerador.nextInt(6);
			int fruta2 = gerador.nextInt(6);
			int fruta3 = gerador.nextInt(6);
			System.out.println("Escolha uma sobremesa: "+frutas[fruta1]+", "+frutas[fruta2]+", "+frutas[fruta3]);
		}
			
		 
			
		

	}

}
