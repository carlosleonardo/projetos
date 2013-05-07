package br.gov.serpro.tutordemoiselle.compromissos.seguranca;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.security.Authenticator;
import br.gov.frameworkdemoiselle.security.User;
import br.gov.frameworkdemoiselle.util.ResourceBundle;

/**
 * Classe para autenticar usuário no sistema. Chamada pelo framework, desde que especificado
 * por frameworkdemoiselle.security.authenticator.class no demoiselle.properties
 * 
 * @author 86132113568
 *
 */
public class Autenticador implements Authenticator {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Credenciais credenciais;
	
	@Inject
	private ResourceBundle bundle;

	@Override
	public boolean authenticate() {
		if (credenciais.getNome().equals("carlos") && credenciais.getSenha().equals("lao")) {
			return true;
		} else {
			throw new RuntimeException(bundle.getString("compromisso.erro.autenticacao", credenciais.getNome()));
		}
	}

	@Override
	public User getUser() {
		return new User() {
			private static final long serialVersionUID = 1L;

			@Override
			public void setAttribute(Object key, Object value) {
			}
			
			@Override
			public String getId() {
				return null;
			}
			
			@Override
			public Object getAttribute(Object key) {
				return null;
			}
		};
	}

	@Override
	public void unAuthenticate() {
	}

}
