package br.gov.serpro.tutordemoiselle.compromissos.excecoes;

import br.gov.frameworkdemoiselle.exception.ApplicationException;


@ApplicationException(rollback=true)
public class CompromissoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CompromissoException()
	{
		super("Erro!");
	}
}
