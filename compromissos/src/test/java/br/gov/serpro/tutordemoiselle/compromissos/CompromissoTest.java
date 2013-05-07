package br.gov.serpro.tutordemoiselle.compromissos;

import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import br.gov.frameworkdemoiselle.security.SecurityContext;
import br.gov.serpro.tutordemoiselle.compromissos.entidades.Compromisso;
import br.gov.serpro.tutordemoiselle.compromissos.negocios.CompromissoBC;
import br.gov.serpro.tutordemoiselle.compromissos.seguranca.Credenciais;

@RunWith(DemoiselleRunner.class)
public class CompromissoTest {
	
	@Inject
	private CompromissoBC compromissoBC;
	
	@Inject
	private SecurityContext contextoSeguranca;
	
	@Inject
	private Credenciais credenciais;
	
	@Test
	public void incluirCompromisso()
	{
		Compromisso c = new Compromisso("Dayhorc");
		
		compromissoBC.insert(c);
	}
	
	@Test
	public void alterarCompromisso()
	{
		Compromisso compromisso = new Compromisso("Dayhorc");
		compromisso.setRepetir(true);
		compromissoBC.update(compromisso);
	}
	
	@Test
	public void excluirCompromisso()
	{
		Compromisso compromisso = new Compromisso("Dayhorc");
		compromissoBC.insert(compromisso);
		compromissoBC.delete(compromisso.getId());
	}
	
	@Before
	public void iniciar()
	{
		// Fazemos login e testamos
		credenciais.setNome("carlos");
		credenciais.setSenha("lao");
		contextoSeguranca.login();
	}
}
