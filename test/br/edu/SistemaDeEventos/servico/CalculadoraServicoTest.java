package br.edu.SistemaDeEventos.servico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.SistemaDeEventos.modelo.Ingresso;
import br.edu.SistemaDeEventos.modelo.IngressoBackstage;
import br.edu.SistemaDeEventos.modelo.Publico;
import br.edu.SistemaDeEventos.modelo.PublicoEstudante;
import br.edu.SistemaDeEventos.modelo.PublicoGeral;

public class CalculadoraServicoTest {

	private CalculadoraDescontoIngressoServico calculadoraServico;
	
	@Before
	public void setUp() {
		calculadoraServico = new CalculadoraDescontoIngressoServico();
	}
	
	@Test
	public void calcularDescontoIngresso() {		
		Ingresso ingresso = new IngressoBackstage();
		Publico publico = new PublicoEstudante();		
		Double valorIngresso = calculadoraServico.calcular(ingresso, publico);		
		Double valorEsperado = 400.00; 		
		Assert.assertEquals(valorEsperado, valorIngresso);		
	}	
//
//	@Test
//	public void calcularDescontoIngressoComErro() {		
//		Ingresso ingresso = new IngressoBackstage();
//		Publico publico = new PublicoEstudante();		
//		Double valorIngresso = calculadoraServico.calcular(ingresso, publico);		
//		Double valorEsperado = 5.00; 		
//		Assert.assertNotEquals(valorEsperado, valorIngresso);		
//	}	
//	
	
}
