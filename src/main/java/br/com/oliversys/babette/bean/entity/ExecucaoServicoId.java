package br.com.oliversys.babette.bean.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ExecucaoServicoId implements Serializable{
	
	private static final long serialVersionUID = -3310824615579366466L;
	
	@Column(name="AGENDAMENTO_ID")
	private Long agendamentoId;
	
	@Column(name="PROFISSIONAL_ID")
	private Long profissionalId;	
	
	public ExecucaoServicoId() {
	}

	public Long getAgendamentoId() {
		return agendamentoId;
	}

	public void setAgendamentoId(Long agendamentoId) {
		this.agendamentoId = agendamentoId;
	}

	public Long getProfissionalId() {
		return profissionalId;
	}

	public void setProfissionalId(Long profissionalId) {
		this.profissionalId = profissionalId;
	}

	@Override
	public String toString() {
		return "ExecucaoServicoId [agendamentoId=" + agendamentoId
				+ ", profissionalId=" + profissionalId + "]";
	}
	
}
