package main;

import model.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		PilhaInt p = new PilhaInt();
		
		int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		int tamanho = vetor.length -1;
		
		for(int numero : vetor) {
			if(numero >= 0) {
				p.Push(numero);
			}else {
				int pop1 = p.Pop();
				int soma = pop1 + p.Pop();
				p.Push(numero);
				p.Push(soma);
			}
		}
		
		System.out.println("Tamanho da pilha -> " + p.Size());
	}
}
