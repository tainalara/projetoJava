package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String nome;
		int contador;
        
		Scanner leia = new Scanner(System.in);
             
        /*System.out.println("\nDigite o 2º nome: ");
        nome2 = leia.nextLine();
        System.out.println("O 2º nome é: "  + nome2);
        
        System.out.println("\nDigite o 3º nome: ");
        nome3 = leia.nextLine();
        System.out.println("O 3º nome é: "  + nome3);*/
        
        
     // for (valor inicial; condição limite ou teste; contador)
        for(contador = 1; contador < 4; contador++) {
        	System.out.println("Digite o " + contador + "º nome: ");
            nome = leia.nextLine();
            System.out.println("O " + contador + " º nome é: " + nome);
        	
        }
        
        System.out.println("Acabou");
	}

}

