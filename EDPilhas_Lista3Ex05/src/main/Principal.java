package main;

import java.util.Scanner;

import controller.HistoricoSim;
import model.PilhaString;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		PilhaString p = new PilhaString();
		HistoricoSim h = new HistoricoSim();
		Scanner scanner = new Scanner(System.in);
		Boolean continuar = true;
		
		while (continuar == true) {
			System.out.print("Digite um endereço: ");
			String endereco = scanner.next();
			h.addEndereco(p, endereco);
			System.out.println("continuar? s/n");
			String o = scanner.next();
			if(o.equals("n"))continuar = false;
		}
		System.out.println("Remover último endereço adicionado? s/n");
		String o = scanner.next();
		if(o.equals("s"))h.removerEndereco(p);
		
		System.out.println("Verificar último endereço adicionado? s/n");
		String v = scanner.next();
		if(v.equals("s"))h.verUltimoEndereco(p);
		
				
	}
	
}
