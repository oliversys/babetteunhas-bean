package br.com.oliversys.babette.bean.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import bean.IBabetteUnhasEntity;
import bean.Profissional;

@Entity
@Table(name="EXECUCOES_SERVICOS")
public class ExecucaoServico implements IBabetteUnhasEntity {

	private static final long serialVersionUID = 62978638538328132L;

	@EmbeddedId
	private ExecucaoServicoId id;
	
	@OneToOne
	@JoinColumn(name = "AGENDAMENTO_ID", referencedColumnName = "AGENDAMENTO_ID")
	@MapsId("AGENDAMENTO_ID")
	private Agendamento agendamento;	

	@OneToOne
	@JoinColumn(name = "PROFISSIONAL_ID", referencedColumnName = "PROFISSIONAL_ID")
	@MapsId("PROFISSIONAL_ID")
	private Profissional profissional;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaRealExecucao; // o agendamento pode atrasar
	
	public ExecucaoServico() {
		
	}

	public Date getHoraRealExecucao() {
		return horaRealExecucao;
	}

	public void setHoraRealExecucao(Date horaRealExecucao) {
		this.horaRealExecucao = horaRealExecucao;
	}

	@Override
	public String toString() {
		return "ExecucaoServico [id=" + id + ", horaRealExecucao="
				+ horaRealExecucao + "]";
	}
}
