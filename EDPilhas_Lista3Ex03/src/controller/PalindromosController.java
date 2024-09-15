package controller;

import model.PilhaString;

public class PalindromosController {

	public PalindromosController() {
		super();
	}
	
	public String invertePalavra(String palavra) throws Exception {
		PilhaString p = new PilhaString();
		String[] palavraSeparada = palavra.split("");
		for(String c : palavraSeparada) {
			p.Push(c);
			p.Top();
		}
		String palavraInvertida = "";
		while(p.isEmpty() == false) {
			palavraInvertida = palavraInvertida + p.Pop();
		}
		System.out.println("Palavra invertida -> " + palavraInvertida);
		return palavraInvertida;
	}
	
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if(palavra.equals(palavraInvertida)) {
			return true;
		}
		return false;
	}
	
}
