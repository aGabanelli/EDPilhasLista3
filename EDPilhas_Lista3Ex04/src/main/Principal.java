package main;

import java.util.Scanner;

import controller.NPRController;
import model.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		PilhaInt p = new PilhaInt();
		NPRController npr = new NPRController();
		Scanner scanner = new Scanner(System.in);
		Boolean continuar = true;
		
		while (continuar == true) {
			System.out.print("Digite um número: ");
			int n = scanner.nextInt();
			p.Push(n);
			
			System.out.println("continuar? s/n");
			String o = scanner.next();
			if(o.equals("n")) {
				continuar = false;
			}			
		}
		System.out.println("Operação");
		String op = scanner.next();
		System.out.println(npr.operacao(p, op));				
	}
	
}
