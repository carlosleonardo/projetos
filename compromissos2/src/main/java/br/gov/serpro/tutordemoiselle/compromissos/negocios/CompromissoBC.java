package br.gov.serpro.tutordemoiselle.compromissos.negocios;

import javax.inject.Inject;
import org.slf4j.Logger;
import br.gov.frameworkdemoiselle.exception.ExceptionHandler;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.util.ResourceBundle;
import br.gov.serpro.tutordemoiselle.compromissos.entidades.Compromisso;
import br.gov.serpro.tutordemoiselle.compromissos.excecoes.CompromissoException;
import br.gov.serpro.tutordemoiselle.compromissos.persistencia.CompromissoDAO;

/**
 * Classe de negócio
 * 
 * @author 86132113568
 *
 * Sobrecarregamos os métodos de inclusão, alteração e exclusão para mostrar no log o que aconteceu.
 */
@BusinessController
public class CompromissoBC extends DelegateCrud<Compromisso, Integer, CompromissoDAO> {
	private static final long serialVersionUID = 1L;

	@Inject
	private Logger logger;

	@Inject
	private ResourceBundle bundle;

	@Override
	public void delete(Integer id) {
		super.delete(id);
		
		String mensagem = bundle.getString("compromisso.exclusao", id);
		logger.info(mensagem);
	}

	@Override
	public void insert(Compromisso compromisso) {
		super.insert(compromisso);
		
		String mensagem = bundle.getString("compromisso.inclusao", compromisso.getNomeCompromisso());
		logger.info(mensagem);
	}
	
	@ExceptionHandler
	public void tratarErro(CompromissoException cexc)
	{
		throw cexc;
	}
	
	@Override
	public void update(Compromisso compromisso) {
		super.update(compromisso);
		
		String mensagem = bundle.getString("compromisso.alteracao", compromisso.getNomeCompromisso());
		logger.info(mensagem);
	}
}
