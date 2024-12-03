package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {

		// Variáveis

		float media;

		// Leia (estrutura necessária para ler o console)

		Scanner leia = new Scanner(System.in);

		// Entrada de Dados

		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		// Processamento

		if (media >=6) {
			System.out.println("Parabéns, você foi aprovade!"); // Saída

		} else if (media >= 5) {

			System.out.println("Participante vai precisar refazer os exames"); // Saída

		} else{
			
			System.out.println("Infelizmente você foi reprovade"); // Saída
			
		}
			

		leia.close();
	}

}
