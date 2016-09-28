package br.edu.SistemaDeEventos.servico;

import java.util.ArrayList;

import br.edu.SistemaDeEventos.modelo.Evento;
import br.edu.SistemaDeEventos.modelo.Ingresso;

public class IngressoVIPServico implements IngressoServico {
	
	public Evento adicionarIngresso(Evento evento) {
		ArrayList<Ingresso> Ingresso = evento.getIngressosDisponiveisEvento();
		
		boolean ingressoEstaNalista = false;
		for (int i = 0; i < Ingresso.size(); i++) 
		  if (Ingresso.get(i).getTipo() == "VIP")
			ingressoEstaNalista = true;
	
		if (!ingressoEstaNalista) {
  		  Ingresso.add(new Ingresso("VIP", 1000.00));
  		  evento.setIngressosDisponiveisEvento(Ingresso);
		}
		
		return evento;
	}

}