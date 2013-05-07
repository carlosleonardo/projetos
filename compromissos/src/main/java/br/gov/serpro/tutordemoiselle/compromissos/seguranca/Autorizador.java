package br.gov.serpro.tutordemoiselle.compromissos.seguranca;

import br.gov.frameworkdemoiselle.security.Authorizer;

/**
 * Classe para autorizar o acesso aos recursos especificados por @RequiredPermission e @RequiredRole.
 * Esta classe deve ser especificada em demoiselle.properties usando frameworkdemoiselle.security.authorizer.class
 * 
 * @author 86132113568
 *
 */
public class Autorizador implements Authorizer {
	private static final long serialVersionUID = 1L;

	@Override
	public boolean hasPermission(String resource, String operation) {
		return true;
	}

	@Override
	public boolean hasRole(String role) {
		return true;
	}

}
