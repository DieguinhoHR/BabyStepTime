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
	
	@Test
	public void testDeveGarantirPrimeiraNotaNegativa() {		
		assertFalse(avaliacao.inserirPrimeiraNota(-1));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaZero() {
		assertTrue(avaliacao.inserirPrimeiraNota(0));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaMaiorQueZero() {
		assertTrue(avaliacao.inserirPrimeiraNota(1));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaMaiorDez() {
		assertTrue(avaliacao.inserirPrimeiraNota(10));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaMaiorQueDez() {
		assertFalse(avaliacao.inserirPrimeiraNota(11));		
	}	
}
