package conceicaodomingos.com.github.javaoo.interfaces;

import conceicaodomingos.com.github.javaoo.excecoes.AceleracaoException;
import conceicaodomingos.com.github.javaoo.excecoes.FreagemException;

public interface AndadorInterface {

	void acelerar() throws AceleracaoException;
	void frear() throws FreagemException;
}
