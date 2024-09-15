package controller;

import model.PilhaInt;

public class NPRController {

	public NPRController() {
		// TODO Auto-generated constructor stub
	}
	
	public int operacao(PilhaInt p, String op) throws Exception {
		if(p.Size() >= 2) {
			int a = p.Pop();
			int b = p.Pop();
			int calculo = 0;
			
			switch (op) {
			case "+": 
				calculo = a + b;
				break;
			case "-": 
				calculo = b - a;
				break;
			case "*": 
				calculo = a * b;
				break;
			case "/": 
				calculo = b / a ;
				break;
			default:
				System.out.println("Operação inválida, sinal não encontrado");
			}
			return calculo;
		}else {
			System.out.println("Operação inválida! a pilha possui menos de 2 itens");
			return 0;
		}
		
	}
	
}
