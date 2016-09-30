package br.edu.SistemaDeEventos.validador;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.edu.SistemaDeEventos.excecao.ValidacaoCampoObrigatorioExcecao;
import br.edu.SistemaDeEventos.excecao.ValidacaoRegraExcecao;
//import org.junit.Assert.assertEquals;
import br.edu.SistemaDeEventos.modelo.Evento;
import br.edu.SistemaDeEventos.modelo.Ingresso;
import br.edu.SistemaDeEventos.modelo.IngressoBackstage;
import br.edu.SistemaDeEventos.modelo.IngressoPlateia;
import br.edu.SistemaDeEventos.modelo.IngressoPlateiaVip;
import br.edu.SistemaDeEventos.modelo.IngressoVip;

public class EventoValidadorTeste {
	
	private EventoValidador eventoValidador;
		
	@Before
	public void setUp() throws Exception {
		eventoValidador = new EventoValidador();
	}
		
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoSeNomeMaiorPermitido() {		
		Evento evento = new Evento();			
		evento.setNome("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
		eventoValidador.validarNumeroCaracteresNome(evento);
	}		
	
	@Test(expected = ValidacaoCampoObrigatorioExcecao.class)
	public void deveLancarExcecaoCampoNomeObrigatorio() {
		Evento evento = new Evento();		
		eventoValidador.validarNomeObrigatorio(evento);
	}
	
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoDataHoraEventoMenorAgora() {
		Evento evento = new Evento();		
		Date dataEvento = new Date(15+100,7,26);
		evento.setDataHoraEvento(dataEvento);
		eventoValidador.validarDataHoraEventoMenorQueAgora(evento);
	}
	
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoDataHoraInicialVendaIngressoEventoMaiorEvento() {
		Evento evento = new Evento();		
		evento.setDataHoraEvento(new Date(15+100,7,26));
		evento.setDataHoraInicioVendaIngressoEvento(new Date(15+100,7,27));
		eventoValidador.validarDataHoraInicialVendaIngressoEventoMaiorEvento(evento);
		
	}	

	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoDataHoraFinalVendaIngressoEventoMaiorEvento() {
		Evento evento = new Evento();				
		evento.setDataHoraEvento(new Date(15+100,7,26));
		evento.setDataHoraFimVendaIngressoEvento(new Date(15+100,7,27));
		eventoValidador.validarDataHoraFinalVendaIngressoEventoMaiorEvento(evento);
	}
	
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoDataHoraInicialVendaIngressoEventoMaiorDataHoraFinalVendaIngressoEvento() {
		Evento evento = new Evento();				
		evento.setDataHoraInicioVendaIngressoEvento(new Date(15+100,7,27));
		evento.setDataHoraFimVendaIngressoEvento(new Date(15+100,7,26));
		eventoValidador.validarDataHoraInicialVendaIngressoEventoMaiorDataHoraFinalVendaIngressoEvento(evento);
	}
	
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoEventoComIngressoDuplicado(){
		Evento evento = new Evento();
		ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
		ingressos.add(new IngressoBackstage());
		ingressos.add(new IngressoPlateia());
		ingressos.add(new IngressoPlateiaVip());
		ingressos.add(new IngressoVip());
		ingressos.add(new IngressoVip());
		
		evento.setIngressosDisponiveisEvento(ingressos);
		
		eventoValidador.validarIngressoDuplicados(evento);
	}
			
}
