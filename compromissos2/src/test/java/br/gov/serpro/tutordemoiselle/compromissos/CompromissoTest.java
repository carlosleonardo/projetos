package br.gov.serpro.tutordemoiselle.compromissos;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;
import br.gov.serpro.tutordemoiselle.compromissos.entidades.Compromisso;
import br.gov.serpro.tutordemoiselle.compromissos.negocios.CompromissoBC;

@RunWith(DemoiselleRunner.class)
public class CompromissoTest {
	
	@Inject
	private CompromissoBC compromissoBC;
	
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
}
