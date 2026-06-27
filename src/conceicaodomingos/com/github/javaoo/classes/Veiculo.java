package conceicaodomingos.com.github.javaoo.classes;

import conceicaodomingos.com.github.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import conceicaodomingos.com.github.javaoo.excecoes.AceleracaoException;
import conceicaodomingos.com.github.javaoo.excecoes.ChassiInvalidoException;
import conceicaodomingos.com.github.javaoo.excecoes.FreagemException;

public class Veiculo {

	private String nome;
	private String marca;
	private String chassi;
	protected int quantidadeRodas;
	private float quantidadeCombustivel;
	protected Boolean ligado;
	protected float velocidade;

	public Veiculo() {
		this.ligado = false;
		this.velocidade = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws ChassiInvalidoException {
		if (chassi.length() == 5) {
			this.chassi = chassi;
		} else {
			throw new ChassiInvalidoException(chassi);
		}
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

//	NAO DEVE EXISTIR, pois ja existe um metodo para alterar a quantidade de combustivel
//	public void setQuantidadeRodas(int quantidadeRodas) {
//		this.quantidadeRodas = quantidadeRodas;
//	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public Boolean isLigado() {
		return ligado;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("O veículo ligou!");
	}

	public void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("O veículo desligou!");
	}

	public void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
		if (!this.ligado) {
			quantidadeCombustivel += litros;
		} else {
			throw new AbastecimentoVeiculoLigadoException();
		}
	}
	
	public void acelerar() throws AceleracaoException {
		if (this.ligado) {
			this.velocidade += 10;
		} else {
			throw new AceleracaoException();
		}
	}
	
	public void frear() throws FreagemException {
		if (this.ligado) {
			this.velocidade -= 10;
		} else {
			throw new FreagemException();
		}
	}
}
