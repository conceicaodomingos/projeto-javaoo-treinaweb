package conceicaodomingos.com.github.javaoo.main;

import conceicaodomingos.com.github.javaoo.classes.Moto;
import conceicaodomingos.com.github.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import conceicaodomingos.com.github.javaoo.excecoes.ChassiInvalidoException;

public class Main {

	public static void main(String[] args) {
		
		try {
			var veiculo1 = new Moto("Corsa", "GM");
			
			veiculo1.setChassi("ABCDE");
			
			System.out.println("Nome do Veículo 1: " + veiculo1.getNome());
			System.out.println(String.format("Quantidade de combustível do %s antes de abastecer: %.2f litros", 
								veiculo1.getNome(), veiculo1.getQuantidadeCombustivel()));
			
//			((Carro) veiculo1).setQuantidadePortas(4);
			veiculo1.abastecer(10);
			
			System.out.println(String.format("Quantidade de combustível do %s depois de abastecer: %.2f litros", 
								veiculo1.getNome(), veiculo1.getQuantidadeCombustivel()));
			System.out.println(String.format("Quantidade de rodas do %s: %d", 
								veiculo1.getNome(), veiculo1.getQuantidadeRodas()));
			System.out.println(String.format("O veículo %s está ligado? %b", 
								veiculo1.getNome(), veiculo1.isLigado()));
	
			veiculo1.ligar();
			veiculo1.acelerar();
			System.out.println(String.format("Velocidade atual do %s depois de acelerar: %.2f", 
								veiculo1.getNome(), veiculo1.getVelocidade()));
			
			veiculo1.frear();
			System.out.println(String.format("Velocidade atual do %s depois de frear: %.2f", 
								veiculo1.getNome(), veiculo1.getVelocidade()));
		} catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("*** Ocorreu um erro: O veículo não pode ser abastecido enquanto estiver ligado!" );
		} catch (ChassiInvalidoException e) {
			System.out.println("*** Ocorreu um erro: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("*** Ocorreu um erro: " + e.getMessage());
		}
	}
}
