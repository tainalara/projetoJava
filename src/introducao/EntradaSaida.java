package introducao;

import java.util.Scanner; //Importando Scanner para dentro da Classe

public class EntradaSaida {

	public static void main(String[] args) {
		
		//Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		// Construindo o leia 
		Scanner leia = new Scanner(System.in);
				
		//Entrada de Dados - Pedir/Inserir o nome, temperatura
		System.out.println ("Insira seu nome: ");
		nome = leia.nextLine(); // .nextLine();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();

		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
				
		// Saída dos Dados
		System.out.println("Bom dia, " + nome);
		System.out.printf ("A temperatura em Fahrenhiet é %.3f ºF ", fahrenheit); //O printf usa a concatenação com a ","
		System.out.println("A temperatura em Fahrenhiet " + fahrenheit + "ºF"); //Concatenação

		
	}

}
