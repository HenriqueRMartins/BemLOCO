package exemplo;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Random gerador = new Random();
		int numero =gerador.nextInt(9)+1;
		int valorDigitado=0;
		for (int i=0;i<5;i++) {
			System.out.println("Digite um número de 1 a 9: ");
			valorDigitado=teclado.nextInt();
			if (numero ==valorDigitado) {
				System.out.println("Parabéns você venceu! ");
			}else {
				if(i<4) {
				System.out.println("Você errou... Tenta novamente.");
			}else {
				System.out.println("Você perdeu!!!");
			}
		}
	}
	}

}
