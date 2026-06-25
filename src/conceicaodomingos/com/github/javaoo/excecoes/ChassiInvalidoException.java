package conceicaodomingos.com.github.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

	private static final long serialVersionUID = 4664085892614237322L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("O chassi [%s] é inválido!", chassi));
	}
}
