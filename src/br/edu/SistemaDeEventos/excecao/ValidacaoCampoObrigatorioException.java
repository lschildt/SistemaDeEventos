package br.edu.SistemaDeEventos.excecao;

public class ValidacaoCampoObrigatorioException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ValidacaoCampoObrigatorioException(String mensagem) {
		super(mensagem);
	}		

}
