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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((agendamentoId == null) ? 0 : agendamentoId.hashCode());
		result = prime * result
				+ ((profissionalId == null) ? 0 : profissionalId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExecucaoServicoId other = (ExecucaoServicoId) obj;
		if (agendamentoId == null) {
			if (other.agendamentoId != null)
				return false;
		} else if (!agendamentoId.equals(other.agendamentoId))
			return false;
		if (profissionalId == null) {
			if (other.profissionalId != null)
				return false;
		} else if (!profissionalId.equals(other.profissionalId))
			return false;
		return true;
	}
}
