package br.edu.SistemaDeEventos.validador;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.SistemaDeEventos.excecao.ValidacaoCampoObrigatorioExcecao;
import br.edu.SistemaDeEventos.excecao.ValidacaoRegraExcecao;
import br.edu.SistemaDeEventos.modelo.Evento;
import br.edu.SistemaDeEventos.modelo.ingresso.Ingresso;
import br.edu.SistemaDeEventos.modelo.ingresso.IngressoBackstage;
import br.edu.SistemaDeEventos.modelo.ingresso.IngressoPlateia;
import br.edu.SistemaDeEventos.modelo.ingresso.IngressoPlateiaVip;
import br.edu.SistemaDeEventos.modelo.ingresso.IngressoVip;

public class EventoValidadorTest {
	
	private EventoValidador eventoValidador;
		
	@Before
	public void setUp() throws Exception {
		eventoValidador = new EventoValidador();
	}
		
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoSeNomeMaiorPermitido() {		
		Evento evento = new Evento();			
		evento.setNome("Lorem Ipsum simplesmente uma simulao de texto da indstria tipogrfica e de impressos, e vem sendo utilizado desde o s�culo XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu n�o s� a cinco s�culos, como tamb�m ao salto para a editora��o eletr�nica, permanecendo essencialmente inalterado. Se popularizou na d�cada de 60, quando a Letraset lan�ou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editorao eletrnica como Aldus PageMaker.");
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
		LocalDate dataEvento = LocalDate.now().minusDays(1);
		evento.setDataHoraEvento(dataEvento);
		eventoValidador.validarDataHoraEventoMenorQueAgora(evento);
	}
	
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoDataHoraInicialVendaIngressoEventoMaiorEvento() {
		Evento evento = new Evento();		
		evento.setDataHoraEvento(LocalDate.now());
		evento.setDataHoraInicioVendaIngressoEvento(LocalDate.now().plusDays(1));
		eventoValidador.validarDataHoraInicialVendaIngressoEventoMaiorEvento(evento);
		
	}	

	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoDataHoraFinalVendaIngressoEventoMaiorEvento() {
		Evento evento = new Evento();				
		evento.setDataHoraEvento(LocalDate.now());
		evento.setDataHoraFimVendaIngressoEvento(LocalDate.now().plusDays(1));
		eventoValidador.validarDataHoraFinalVendaIngressoEventoMaiorEvento(evento);
	}
	
	@Test(expected = ValidacaoRegraExcecao.class)
	public void deveLancarExcecaoDataHoraInicialVendaIngressoEventoMaiorDataHoraFinalVendaIngressoEvento() {
		Evento evento = new Evento();				
		evento.setDataHoraInicioVendaIngressoEvento(LocalDate.now().plusDays(1));
		evento.setDataHoraFimVendaIngressoEvento(LocalDate.now());
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

	
	@Test
	public void devePassarSemIngressoDuplicado(){
		Evento evento = new Evento();
		ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
		ingressos.add(new IngressoBackstage());
		ingressos.add(new IngressoPlateia());
		ingressos.add(new IngressoPlateiaVip());
		ingressos.add(new IngressoVip());		
		evento.setIngressosDisponiveisEvento(ingressos);
		
		//Assert.assertTrue(message, condition);
		
		Assert.assertTrue(eventoValidador.validarIngressoDuplicados(evento));
	}
				
	
}
