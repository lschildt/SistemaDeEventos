package br.edu.SistemaDeEventos.rn;

import java.util.Date;

import br.edu.SistemaDeEventos.dto.Evento;

public class EventoRN {

	public void cadastrarEvento(Evento objEventoDTO) throws Exception {
	
		if(!validarNome(objEventoDTO)) {
			throw new Exception("O nome permite no máximo 150 caracteres");
		}
		
		if(!validarData(objEventoDTO)) {
			throw new Exception("A data do evento deve ser igual ou maior que a de hoje");
		}		
		
	}
		
	public boolean validarNome(Evento objEventoDTO) {		
		return objEventoDTO.getNome().length() <= 150;
	}
	
	public boolean validarData(Evento objEventoDTO) {		
		Date objDataAtual = new Date();
		
		
		System.out.println(objEventoDTO.getDataHora().toString());
		System.out.println(objDataAtual.toString());
		
		return objEventoDTO.getDataHora().after(objDataAtual) ||  objEventoDTO.getDataHora().equals(objDataAtual);
	}	
	
}
