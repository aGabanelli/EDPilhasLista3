package main;

import java.util.Scanner;

import controller.PalindromosController;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		PalindromosController p = new PalindromosController();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira uma palavra: ");
		String palavra = scanner.next();
		
		String palavraInvertida = p.invertePalavra(palavra);
		Boolean palindromo = p.comparaPalavras(palavra, palavraInvertida);
		
		if(palindromo == true) {
			System.out.println("é um palíndromo");
		} else {
			System.out.println("não é um palíndromo");
		}
		
	}
}
