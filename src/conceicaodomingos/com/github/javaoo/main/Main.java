package conceicaodomingos.com.github.javaoo.main;

import conceicaodomingos.com.github.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		try {
			Veiculo veiculo1 = new Veiculo();
			
			veiculo1.setMarca("GM");
			veiculo1.setNome("Corsa");
			veiculo1.setChassi("ABCDE");
			
			System.out.println("Nome do Veículo 1: " + veiculo1.getNome());
			System.out.println("Quantidade de combustível do Veículo 1 antes de abastecer: " + 
								veiculo1.getQuantidadeCombustivel());
			veiculo1.abastecer(10);
			System.out.println("Quantidade de combustível do Veículo 1 depois de abastecer: " + 
					veiculo1.getQuantidadeCombustivel());
			veiculo1.ligar();
		} catch (Exception e) {
			System.out.println("*** Ocorreu um erro: " + e.getMessage());
		}
	}
}
