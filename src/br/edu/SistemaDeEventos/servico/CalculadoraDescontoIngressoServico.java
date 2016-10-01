package br.edu.SistemaDeEventos.servico;

import br.edu.SistemaDeEventos.modelo.Ingresso;
import br.edu.SistemaDeEventos.modelo.Publico;

public class CalculadoraDescontoIngressoServico {
	
	public Double calcular(Ingresso ingresso, Publico publico) {
		Double valorIngresso = ingresso.getValor() - (ingresso.getValor() * publico.getPercentualDesconto());				
		return valorIngresso;		
	}
			
}
