package br.com.oliversys.babette.bean.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import bean.IBabetteUnhasEntity;

@Entity
@Table(name="PERGUNTAS")
public class Pergunta implements IBabetteUnhasEntity{

	private static final long serialVersionUID = -2868579762527173553L;

	@Id
	@Column(name="PERGUNTA_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="ENUNCIADO")
	private String enunciado;
	
	// o numero de respostas será sempre pequeno (no max. 10)
	@ElementCollection(fetch=FetchType.EAGER)
	@Column(name="RESPOSTAS")
	private List<String> respostas;
	
	public Pergunta() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public List<String> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<String> respostas) {
		this.respostas = respostas;
	}

	@Override
	public String toString() {
		return "Pergunta [id=" + id + ", enunciado=" + enunciado
				+ ", respostas=" + respostas + "]";
	}
}
