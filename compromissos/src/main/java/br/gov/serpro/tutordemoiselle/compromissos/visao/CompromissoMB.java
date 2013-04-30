package br.gov.serpro.tutordemoiselle.compromissos.visao;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.serpro.tutordemoiselle.compromissos.entidades.Compromisso;
import br.gov.serpro.tutordemoiselle.compromissos.negocios.CompromissoBC;

@ViewController
public class CompromissoMB {
	
	@Inject
	private CompromissoBC compromissoBC;
	
	/**
	 * Retorna uma lista de compromissos
	 * 
	 * @return
	 */
	public List<Compromisso> getCompromissos()
	{
		return compromissoBC.findAll();
	}

	/**
	 * Cria um novo compromisso
	 * 
	 * @param nome
	 * @param dataInicial
	 * @param dataFinal
	 * @param repetir
	 */
	public void incluirCompromisso(String nome, Date dataInicial, Date dataFinal, boolean repetir)
	{
		Compromisso compromisso = new Compromisso(nome, repetir, dataInicial, dataFinal);
		
		compromissoBC.insert(compromisso);
	}
	
	/**
	 * Altera um compromisso existente
	 * 
	 * @param nome
	 * @param dataInicial
	 * @param dataFinal
	 * @param repetir
	 */
	public void alterarCompromisso(String nome, Date dataInicial, Date dataFinal, boolean repetir)
	{
		Compromisso compromisso = new Compromisso(nome, repetir, dataInicial, dataFinal);
		compromissoBC.update(compromisso);
	}
	
	/**
	 * Exclui um compromisso, dado seu ìndice
	 * 
	 * @param idCompromisso
	 */
	public void excluirCompromisso(Integer idCompromisso)
	{
		compromissoBC.delete(idCompromisso);
	}
}
