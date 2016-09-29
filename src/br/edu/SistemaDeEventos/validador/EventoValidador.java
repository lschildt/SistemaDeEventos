package br.edu.SistemaDeEventos.validador;

import java.util.Date;

import br.edu.SistemaDeEventos.excecao.ValidacaoCampoObrigatorioExcecao;
import br.edu.SistemaDeEventos.excecao.ValidacaoRegraExcecao;
import br.edu.SistemaDeEventos.modelo.Evento;

public class EventoValidador {
	
	private static final int TAMANHO_MAXIMO_NOME = 150;
	private static final String MENSAGEM_TAMANHO_MAXIMO_NOME = "O nome permite no máximo 150 caracteres";
	private static final String MENSAGEM_CAMPO_NOME_OBRIGATORIO = "O nome permite no máximo 150 caracteres";
	private static final Date DATA_ATUAL = new Date();
	private static final String MENSAGEM_DATA_EVENTO_MENOR_AGORA = "A data do evento deve ser igual ou maior que a de hoje";
	private static final String MENSAGEM_DATA_INICIAL_VENDA_INGRESSO_MAIOR_DATA_EVENTO = "A data inicial de venda de ingressos deve ser igual ou menor que a do evento";
	private static final String MENSAGEM_DATA_FINAL_VENDA_INGRESSO_MAIOR_DATA_EVENTO = "A data final de venda de ingressos deve ser igual ou menor que a do evento";
	private static final String MENSAGEM_DATA_FINAL_VENDA_INGRESSO_MAIOR_DATA_INICIAL = "A data inicial de venda de ingressos deve menor que a data final de venda";
				
	public EventoValidador() {
		super();
	}	

	public void validar(Evento evento){
		validarNumeroCaracteresNome(evento);	
	}	
	
	public void validarNumeroCaracteresNome(Evento evento) {		
		if (evento.getNome().length() > TAMANHO_MAXIMO_NOME) 
			throw new ValidacaoRegraExcecao(MENSAGEM_TAMANHO_MAXIMO_NOME);
	}

	public void validarNomeObrigatorio(Evento evento) {
		if(evento.getNome() == null || evento.getNome().isEmpty())
			throw new ValidacaoCampoObrigatorioExcecao(MENSAGEM_CAMPO_NOME_OBRIGATORIO);		
	}
	
	public void validarDataHoraEventoMenorQueAgora(Evento evento) {
		if(evento.getDataHoraEvento().before(DATA_ATUAL))
			throw new ValidacaoRegraExcecao(MENSAGEM_DATA_EVENTO_MENOR_AGORA);		
	}
	
	public void validarDataHoraInicialVendaIngressoEventoMaiorEvento(Evento evento) {
		if(evento.getDataHoraInicioVendaIngressoEvento().after(evento.getDataHoraEvento()))
			throw new ValidacaoRegraExcecao(MENSAGEM_DATA_INICIAL_VENDA_INGRESSO_MAIOR_DATA_EVENTO);		
	}
	
	public void validarDataHoraFinalVendaIngressoEventoMaiorEvento(Evento evento) {
		if(evento.getDataHoraFimVendaIngressoEvento().after(evento.getDataHoraEvento()))
			throw new ValidacaoRegraExcecao(MENSAGEM_DATA_FINAL_VENDA_INGRESSO_MAIOR_DATA_EVENTO);		
	}
				
	public void validarDataHoraInicialVendaIngressoEventoMaiorDataHoraFinalVendaIngressoEvento(Evento evento) {
		if(evento.getDataHoraInicioVendaIngressoEvento().after(evento.getDataHoraFimVendaIngressoEvento()))
			throw new ValidacaoRegraExcecao(MENSAGEM_DATA_FINAL_VENDA_INGRESSO_MAIOR_DATA_INICIAL);		
	}
}
