package br.ifpe;

import org.junit.Assert;
import org.junit.Test;


public class AplicacaoTest {
	
@Test
	public void teste1() {
		
	// Cen�rio
	Aplicacao app = new Aplicacao();
	
	
	
	// A��o
	String valor = app.acao();
	
	
	// Verfica��o
	
	Assert.assertTrue(valor == "Neto o grande bostinha");
	
	
	
	}
}
