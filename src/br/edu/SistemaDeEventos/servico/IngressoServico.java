package br.edu.SistemaDeEventos.servico;

import java.util.ArrayList;

import br.edu.SistemaDeEventos.modelo.Ingresso;

public class IngressoServico {
	
	public ArrayList<Ingresso> listarIngressos() {
		ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
		
		ingressos.add(new Ingresso("VIP", 1000.0));
		ingressos.add(new Ingresso("Backstage", 800.0));
		ingressos.add(new Ingresso("Plateia VIP", 500.0));
		ingressos.add(new Ingresso("Plateia", 300.0));
		
		return ingressos;
	}
	

}
