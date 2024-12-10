package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Cria a Collection Set, do tipo String chamada setFrutas
		Set<String> setFrutas = new HashSet<String>();
		
		System.out.println("Digite sua fruta: ");
		String fruta = leia.nextLine(); 

		// Adiciona algumas frutas na Colection Set
		setFrutas.add(fruta);
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		/**
		 * Mostra os dados armazenados na Collection Set Observe que as frutas repetidas
		 * foram inseridos apenas uma vez
		 */
		System.out.println("\nDados da Collection: " + setFrutas);

	}

}
