package br.edu.SistemaDeEventos.validador;

import java.util.Date;

import br.edu.SistemaDeEventos.dto.Evento;
import br.edu.SistemaDeEventos.exception.ValidacaoCampoObrigatorio;

public class EventoValidador {
	
	private static final int TAMANHO_MAXIMO_NOME = 150;
	private static final String MENSAGEM_TAMANHO_MAXIMO_NOME = "O nome permite no máximo 150 caracteres";
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
			throw new ValidacaoCampoObrigatorio(MENSAGEM_TAMANHO_MAXIMO_NOME);
	}
			
}
