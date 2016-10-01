package br.edu.SistemaDeEventos.modelo;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import br.edu.SistemaDeEventos.modelo.ingresso.Ingresso;

public class Evento {

	private String nome;
	private LocalDate dataHoraEvento;
	private LocalDate dataHoraInicioVendaIngressoEvento;
	private LocalDate dataHoraFimVendaIngressoEvento;
	private ArrayList<Ingresso> ingressosDisponiveisEvento;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataHoraEvento() {
		return dataHoraEvento;
	}
	
	public void setDataHoraEvento(LocalDate dataHora) {
		this.dataHoraEvento = dataHora;
	}

	public LocalDate getDataHoraInicioVendaIngressoEvento() {
		return dataHoraInicioVendaIngressoEvento;
	}

	public void setDataHoraInicioVendaIngressoEvento(LocalDate dataInicioEvento) {
		this.dataHoraInicioVendaIngressoEvento = dataInicioEvento;
	}

	public LocalDate getDataHoraFimVendaIngressoEvento() {
		return dataHoraFimVendaIngressoEvento;
	}

	public void setDataHoraFimVendaIngressoEvento(LocalDate dataFimEvento) {
		this.dataHoraFimVendaIngressoEvento = dataFimEvento;
	}

	public ArrayList<Ingresso> getIngressosDisponiveisEvento() {
		return ingressosDisponiveisEvento;
	}

	public void setIngressosDisponiveisEvento(ArrayList<Ingresso> ingressosDisponiveisEvento) {
		this.ingressosDisponiveisEvento = ingressosDisponiveisEvento;
	}
	
}
