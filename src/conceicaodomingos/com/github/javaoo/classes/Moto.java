package conceicaodomingos.com.github.javaoo.classes;

import conceicaodomingos.com.github.javaoo.excecoes.AceleracaoException;
import conceicaodomingos.com.github.javaoo.excecoes.FreagemException;

public class Moto extends Veiculo {

	public Moto() {
		this.quantidadeRodas = 2;
	}
	
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	@Override
	public void acelerar() throws AceleracaoException {
		if (this.ligado) {
			this.velocidade += 3;
		} else {
			throw new AceleracaoException();
		}
	}
	
	@Override
	public void frear() throws FreagemException {
		if (this.ligado) {
			this.velocidade -= 3;
		} else {
			throw new FreagemException();
		}
	}
}
