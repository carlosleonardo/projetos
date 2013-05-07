package br.gov.serpro.tutordemoiselle.compromissos.seguranca;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

/**
 * Classe com as credenciais do usuário
 * 
 * @author 86132113568
 * 
 * Esta classe é do escopo de sessão e o CDI precisa disso para instanciar e manter a instância
 * durante a sessão do usuário. Além disso, ela precisa ser serializável(claro!)
 */
@SessionScoped
public class Credenciais implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;

	private String senha;

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
