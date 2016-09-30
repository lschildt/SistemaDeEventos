package br.edu.SistemaDeEventos.dao;

import java.util.List;

import br.edu.SistemaDeEventos.modelo.Evento;

public interface EventoDao {
	
	public void salvarEvento(Evento objEventoDTO);
	
	public List<Evento> listarEventos();

}
