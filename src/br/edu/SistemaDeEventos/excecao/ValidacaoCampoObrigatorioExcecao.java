package br.edu.SistemaDeEventos.excecao;

public class ValidacaoCampoObrigatorioExcecao extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ValidacaoCampoObrigatorioExcecao(String mensagem) {
		super(mensagem);
	}		

}
