package br.edu.SistemaDeEventos.servico;

import br.edu.SistemaDeEventos.modelo.ingresso.Ingresso;
import br.edu.SistemaDeEventos.modelo.publico.Publico;

public class CalculadoraDescontoIngressoServico implements CalculadoraServico {
	
	private Ingresso ingresso;	
	private Publico publico;
	
	public CalculadoraDescontoIngressoServico(Ingresso ingresso, Publico publico) {
		this.ingresso = ingresso;
		this.publico = publico;
	}

	public Double calcular() {
		Double valorIngresso = ingresso.getValor() - (ingresso.getValor() * publico.getPercentualDesconto());				
		return valorIngresso;	
	}
			
}
