package br.edu.SistemaDeEventos.exception;

public class ValidacaoCampoObrigatorio extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ValidacaoCampoObrigatorio(String mensagem) {
		super(mensagem);
	}		

}
