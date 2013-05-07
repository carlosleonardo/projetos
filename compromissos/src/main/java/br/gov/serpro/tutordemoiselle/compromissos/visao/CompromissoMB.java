package br.gov.serpro.tutordemoiselle.compromissos.visao;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.security.RequiredPermission;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.serpro.tutordemoiselle.compromissos.entidades.Compromisso;
import br.gov.serpro.tutordemoiselle.compromissos.negocios.CompromissoBC;

/**
 * Classe de visão para manter os compromissos.
 * 
 * @author 86132113568
 *
 */
@ViewController
public class CompromissoMB {
	
	@Inject
	private CompromissoBC compromissoBC;
	
	/**
	 * Retorna uma lista de compromissos. 
	 * Incluída permissão requerida para acessar o recurso.
	 * 
	 * @return Lista de compromissos
	 * 
	 */
	@RequiredPermission(resource="compromisso", operation="consultar")
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
	@RequiredPermission(resource="compromisso", operation="incluir")
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
	@RequiredPermission(resource="compromisso", operation="alterar")
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
	@RequiredPermission(resource="compromisso", operation="excluir")
	public void excluirCompromisso(Integer idCompromisso)
	{
		compromissoBC.delete(idCompromisso);
	}
}
