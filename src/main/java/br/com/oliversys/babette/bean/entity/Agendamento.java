package br.com.oliversys.babette.bean.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import bean.IBabetteUnhasEntity;
import bean.Servico;
import bean.Usuario;

@Entity
@Table(name="AGENDAMENTOS")
public class Agendamento implements IBabetteUnhasEntity {

	private static final long serialVersionUID = -3161822376769615137L;

	@Id
	@Column(name="AGENDAMENTO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
			
	@OneToOne
	private Servico servico;
	
	@ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
	private Usuario cliente;
	
	@Column(name="AGENDAMENTO_DATA")
	private Date data;
	
	@ElementCollection
	@Column(name="HORARIOS_DISPONIVEIS")
	private List<String> horariosDisponiveis;
	
	public Agendamento() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<String> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}

	public void setHorariosDisponiveis(List<String> horariosDisponiveis) {
		this.horariosDisponiveis = horariosDisponiveis;
	}

//	public Profissional getProfissional() {
//		return profissional;
//	}
//
//	public void setProfissional(Profissional profissional) {
//		this.profissional = profissional;
//	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
}
