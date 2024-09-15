package controller;

import model.PilhaString;

public class HistoricoSim {

	public HistoricoSim() {
		// TODO Auto-generated constructor stub
	}

	public void addEndereco(PilhaString p, String endereco) {
		if (endereco.contains("http://www") && endereco.contains(".co")) {
			System.out.println("Endereço válido!");
			p.Push(endereco);
		}else {
			System.out.println("Endereço inválido!");
		}
	}
	
	public void removerEndereco(PilhaString p) throws Exception {
		if(p.Size() > 1) {
			System.out.println("O endereço " + p.Pop() + " foi removido");
		}else {
			System.out.println("O histórico possui apenas um ou nenhum endereço.");
		}
	}
	
	public void verUltimoEndereco(PilhaString p) throws Exception {
		if(p.Size() > 1) {
			System.out.println("Ultimo enredeço adicionado " + p.Top());
		}else {
			System.out.println("O histórico possui apenas um ou nenhum endereço.");
		}
	}
	
		
	
	
}
