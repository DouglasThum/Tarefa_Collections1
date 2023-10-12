package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main (String args[]) {
		
		listaOrdenadaPorNome();
		
	}

	private static void listaOrdenadaPorNome() {
		
		Scanner input = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		
		System.out.println("Insira uma lista de nomes, separados por virgulas: ");
		String nomes = input.nextLine();
		String[] vetor = nomes.split(",");
		
		for (String nome : vetor) {
			lista.add(nome);
		}
		
		lista.sort(null);
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		input.close();
	}
}
