package br.edu.SistemaDeEventos.servico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.SistemaDeEventos.modelo.ingresso.Ingresso;
import br.edu.SistemaDeEventos.modelo.ingresso.IngressoBackstage;
import br.edu.SistemaDeEventos.modelo.publico.Publico;
import br.edu.SistemaDeEventos.modelo.publico.PublicoEstudante;
import br.edu.SistemaDeEventos.modelo.publico.PublicoGeral;

public class CalculadoraDescontoIngressoServicoTest {

	private CalculadoraServico calculadoraServico;
	
	@Before
	public void setUp() {		
		Ingresso ingresso = new IngressoBackstage();
		Publico publico = new PublicoEstudante();					
		calculadoraServico = new CalculadoraDescontoIngressoServico(ingresso, publico);
	}
	
	@Test
	public void calcularDescontoIngresso() {			
		Double valorIngresso = calculadoraServico.calcular();		
		Double valorEsperado = 400.00; 		
		Assert.assertEquals(valorEsperado, valorIngresso);		
	}	

//	@Test
//	public void calcularDescontoIngressoComErro() {		
//		Double valorIngresso = calculadoraServico.calcular();		
//		Double valorEsperado = 5.00; 		
//		Assert.assertNotEquals(valorEsperado, valorIngresso);		
//	}	
	
	
}
