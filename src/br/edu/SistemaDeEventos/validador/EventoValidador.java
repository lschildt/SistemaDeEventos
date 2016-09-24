package br.edu.SistemaDeEventos.validador;

import java.util.Date;

import br.edu.SistemaDeEventos.excecao.ValidacaoCampoObrigatorioException;
import br.edu.SistemaDeEventos.excecao.ValidacaoRegraException;
import br.edu.SistemaDeEventos.modelo.Evento;

public class EventoValidador {
	
	private static final int TAMANHO_MAXIMO_NOME = 150;
	private static final String MENSAGEM_TAMANHO_MAXIMO_NOME = "O nome permite no máximo 150 caracteres";
	private static final String MENSAGEM_CAMPO_NOME_OBRIGATORIO = "O nome permite no máximo 150 caracteres";
	private static final Date DATA_ATUAL = new Date();
	private static final String MENSAGEM_DATA_MAIOR_DIA_HOJE = "A data do evento deve ser igual ou maior que a de hoje";
				
	public EventoValidador() {
		super();
	}	

	public void validar(Evento evento){
		validarNumeroCaracteresNome(evento);	
	}	
	
	public void validarNumeroCaracteresNome(Evento evento) {		
		if (evento.getNome().length() > TAMANHO_MAXIMO_NOME) 
			throw new ValidacaoRegraException(MENSAGEM_TAMANHO_MAXIMO_NOME);
	}

	public void validarNomeObrigatorio(Evento evento) {
		if(evento.getNome() == null || evento.getNome().isEmpty())
			throw new ValidacaoCampoObrigatorioException(MENSAGEM_CAMPO_NOME_OBRIGATORIO);		
	}
			
}
