package conceicaodomingos.com.github.javaoo.interfaces;

import conceicaodomingos.com.github.javaoo.excecoes.AbastecimentoException;

public interface VeiculoInterface {

	void abastecer(float litros) throws AbastecimentoException; 
	void preparar();
}
