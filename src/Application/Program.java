package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import domain.Pessoa;

public class Program {
	
	public static void main (String args[]) {
		
		listaOrdenadaPorSexo();
		
	}

	private static void listaOrdenadaPorSexo() {
		
		Scanner input = new Scanner(System.in);
		List<Pessoa> homens = new ArrayList<>();
		List<Pessoa> mulheres = new ArrayList<>();
		
		System.out.println("Insira uma lista no formato: 'Nome-S', onde S é o sexo, separados por virgulas: ");
		String listaNomes = input.nextLine();
		String[] nomes = listaNomes.split(",");
		
		for (String nomeESexo : nomes) {
			String[] vetor = nomeESexo.split("-");
			
			String nome = vetor[0];
			Character sexo = vetor[1].charAt(0);
			
			Pessoa pessoa = new Pessoa(nome, sexo);
			
			if (pessoa.getSexo().equals('F')) {
				mulheres.add(pessoa);
			} else {
				homens.add(pessoa);
			}
		}
		
		System.out.print("Lista de mulheres: ");
		imprimirListas(mulheres);
		System.out.print("Lista de homens: ");
		imprimirListas(homens);
		
		input.close();
	}

	private static void imprimirListas(List<Pessoa> lista) {
		Collections.sort(lista);
		for (Pessoa x : lista) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}
}
