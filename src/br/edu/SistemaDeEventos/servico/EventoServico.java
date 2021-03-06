package br.edu.SistemaDeEventos.servico;

import java.util.List;

import br.edu.SistemaDeEventos.dao.EventoDao;
import br.edu.SistemaDeEventos.modelo.Evento;
import br.edu.SistemaDeEventos.validador.EventoValidador;


public class EventoServico {

	private EventoDao eventoDao;
	private EventoValidador eventoValidador;
	

	public EventoServico (){
		
	}
	
	public void criarEvento(Evento objEventoDTO){
		this.eventoValidador.validar(objEventoDTO);
		salvar(objEventoDTO);
	}
	
	public void salvar(Evento objEventoDTO){
		this.eventoDao.salvarEvento(objEventoDTO);
	}
	
	public List<Evento> listarEventos(){
		List<Evento> listaEventos = eventoDao.listarEventos(); 	
		return listaEventos;
	}
}
