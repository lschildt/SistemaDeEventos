package br.edu.SistemaDeEventos.modelo;

import java.util.Date;

public class Evento {

	private String nome;
	private Date dataHora;		

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataHora() {
		return dataHora;
	}
	
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
}
