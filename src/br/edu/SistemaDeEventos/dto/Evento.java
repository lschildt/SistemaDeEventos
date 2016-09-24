package br.edu.SistemaDeEventos.dto;

import java.util.Date;

public class Evento {

	private String nome;
	private Date dataHora;		

	public Evento() {
		super();
	}

	public Evento(String nome, Date dataHora) {
		super();
		this.nome = nome;
		this.dataHora = dataHora;
	}

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
