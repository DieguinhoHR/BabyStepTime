package com.babysteptime.aula.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.babysteptime.aula.Avaliacao;

public class AvaliacaoTest {
	private Avaliacao avaliacao;
	
	@Before
	public void init() {
		avaliacao = new Avaliacao();
	}

	@Test
	public void testDeveInserirNota() {		
		assertTrue(avaliacao.inserirPrimeiraNota(5));		
	}
}
