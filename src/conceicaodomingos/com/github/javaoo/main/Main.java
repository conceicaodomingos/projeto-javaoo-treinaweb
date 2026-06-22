package conceicaodomingos.com.github.javaoo.main;

import conceicaodomingos.com.github.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo corsa = new Veiculo();
		corsa.marca = "GM";
		corsa.nome = "Corsa";
		corsa.ligar();
		
		Veiculo celta = new Veiculo();
		celta.marca = "MG";
		celta.nome = "Corsa";
		celta.desligar();
		
	}

}
