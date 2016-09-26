package br.edu.SistemaDeEventos.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Evento {

	private String nome;
	private Date dataHoraEvento;
	private Date dataHoraInicioVendaIngressoEvento;
	private Date dataHoraFimVendaIngressoEvento;
	private ArrayList<Ingresso> ingressosDisponiveisEvento;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataHoraEvento() {
		return dataHoraEvento;
	}
	
	public void setDataHoraEvento(Date dataHora) {
		this.dataHoraEvento = dataHora;
	}

	public Date getDataHoraInicioVendaIngressoEvento() {
		return dataHoraInicioVendaIngressoEvento;
	}

	public void setDataHoraInicioVendaIngressoEvento(Date dataInicioEvento) {
		this.dataHoraInicioVendaIngressoEvento = dataInicioEvento;
	}

	public Date getDataHoraFimVendaIngressoEvento() {
		return dataHoraFimVendaIngressoEvento;
	}

	public void setDataHoraFimVendaIngressoEvento(Date dataFimEvento) {
		this.dataHoraFimVendaIngressoEvento = dataFimEvento;
	}

	public ArrayList<Ingresso> getIngressosDisponiveisEvento() {
		return ingressosDisponiveisEvento;
	}

	public void setIngressosDisponiveisEvento(ArrayList<Ingresso> ingressosDisponiveisEvento) {
		this.ingressosDisponiveisEvento = ingressosDisponiveisEvento;
	}
	
}
