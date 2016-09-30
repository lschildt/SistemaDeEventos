package br.edu.SistemaDeEventos.dao;

import java.util.List;

import br.edu.SistemaDeEventos.modelo.Evento;

public interface EventoDao {
	
	public void salvarEvento();
	public List<Evento> listAll();

}
