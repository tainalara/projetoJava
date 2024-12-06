package vetor;

import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {
		
		//tipo nome_vetor [] = new int[quantidade de valores que ele consegue suportar]
		int numeros[] = new int[5]; // [0,1,2,3,4]
				
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 5; indice++) {
			
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			numeros[indice] = leia.nextInt(); // ler algo e adicionar ao vetor no local que eu escolhi
		// numeros é o vetor e o indice (é uma variavel) e vai organizar na memoria do vetor
			
		}

		System.out.println("\nOs números digitados foram: \n");

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º número: " + numeros[indice]);
		}

	}

}
