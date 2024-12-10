package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2, 5);
		
		falar("O primeiro resultado é " + resultado);
		
		falar("O segunto resultado é " + somar(8,3));
		
		falar("Pode ser, Bom dia");
		falar("O gato amarelo");
		
		ExemploMetodoExterno.mensagem ();
		
	}
	
	//Definição do Método Somar - Método com retorno e com parametro
	public static int somar (int num1, int num2) {
		return num1 + num2; // 2 + 5
	}
	
	//Definição do Método Falar - Método sem retorno e com parametro
	public static void falar(String mensagem ) {
		System.out.println(mensagem);
	}
	
	

}
