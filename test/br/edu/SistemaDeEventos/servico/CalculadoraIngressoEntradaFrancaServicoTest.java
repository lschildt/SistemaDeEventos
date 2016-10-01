package br.edu.SistemaDeEventos.servico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.SistemaDeEventos.modelo.ingresso.Ingresso;
import br.edu.SistemaDeEventos.modelo.ingresso.IngressoBackstage;
import br.edu.SistemaDeEventos.modelo.publico.Publico;
import br.edu.SistemaDeEventos.modelo.publico.PublicoEstudante;

public class CalculadoraIngressoEntradaFrancaServicoTest {

	private CalculadoraServico calculadoraServico;
	
	@Before
	public void setUp() {		
		calculadoraServico = new CalculadoraIngressoEntradaFrancaServico();
	}
	
	@Test
	public void calcularDescontoIngressoEntradaFranca() {			
		Double valorIngresso = calculadoraServico.calcular();		
		Double valorEsperado = 0.0; 		
		Assert.assertEquals(valorEsperado, valorIngresso);		
	}		
	
}
