package br.gov.serpro.tutordemoiselle.compromissos.persistencia;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.gov.serpro.tutordemoiselle.compromissos.entidades.Compromisso;

/**
 * Classe de persistência
 * 
 * @author 86132113568
 *
 */
@PersistenceController
public class CompromissoDAO extends JPACrud<Compromisso, Integer> {
	private static final long serialVersionUID = 1L;
}
