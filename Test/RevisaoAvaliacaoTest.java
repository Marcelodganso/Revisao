import static org.junit.Assert.*;

import org.junit.Test;


public class RevisaoAvaliacaoTest {

	@Test
	public void deveFormatarNomeESobrenomeDoAutor () {
		String nomeFormatado = RevisaoAvaliacao.formatado("marcelo santos");
		assertEquals("SANTOS, Marcelo", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor2 () {
		String nomeFormatado = RevisaoAvaliacao.formatado("pedro henrique");
		assertEquals("HENRIQUE, Pedro", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeESobrenomeDoAutor3 () {
		String nomeFormatado = RevisaoAvaliacao.formatado("jackson de andrada");
		assertEquals("ANDRADA, Jackson de", nomeFormatado);
	}
}
