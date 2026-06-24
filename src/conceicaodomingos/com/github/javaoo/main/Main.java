package conceicaodomingos.com.github.javaoo.main;

import conceicaodomingos.com.github.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setMarca("GM");
		veiculo1.setNome("Corsa");
		System.out.println("Nome do Veículo 1: " + veiculo1.getNome());
		veiculo1.ligar();
		
		System.out.println();
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setMarca("MG");
		veiculo2.setNome("Celta");
		System.out.println("Nome do Veículo 2: " + veiculo2.getNome());
		veiculo2.desligar();
		
	}

}
