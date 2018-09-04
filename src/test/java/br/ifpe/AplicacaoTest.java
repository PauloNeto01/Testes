package br.ifpe;

import org.junit.Assert;
import org.junit.Test;


public class AplicacaoTest {
	
@Test
	public void teste1() {
		
	// Cenário
	Aplicacao app = new Aplicacao();
	
	
	
	// Ação
	String valor = app.acao();
	
	
	// Verficação
	
	Assert.assertTrue(valor == "Neto o grande bostinha");
	
	
	
	}
}
