package br.gov.serpro.tutordemoiselle.compromissos.entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * A entidade de dados
 * 
 * @author 86132113568
 *
 */
@Entity
public class Compromisso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String nomeCompromisso;
	
	@Column
	private boolean repetir;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date dataInicial;

	@Temporal(TemporalType.DATE)
	@Column 
	private Date dataFinal;

	public Compromisso()
	{
		dataInicial = Calendar.getInstance().getTime();
		dataFinal = Calendar.getInstance().getTime();
	}

	public Compromisso(String nome) {
		this.nomeCompromisso = nome;
	}

	public Compromisso(String nomeCompromisso, boolean repetir,
			Date dataInicial, Date dataFinal) {
		this.nomeCompromisso = nomeCompromisso;
		this.repetir = repetir;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	@Override
	public boolean equals(Object outro) {
		Compromisso compromisso = (Compromisso) outro;
		return (
				compromisso.nomeCompromisso.equals(this.nomeCompromisso) && 
				compromisso.repetir == this.repetir && 
				compromisso.dataInicial.equals(this.dataInicial) && 
				compromisso.dataFinal.equals(this.dataFinal)
				);
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public Integer getId() {
		return id;
	}
	
	public String getNomeCompromisso() {
		return nomeCompromisso;
	}
	
	public boolean isRepetir() {
		return repetir;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNomeCompromisso(String nomeCompromisso) {
		this.nomeCompromisso = nomeCompromisso;
	}

	public void setRepetir(boolean repetir) {
		this.repetir = repetir;
	}
}
