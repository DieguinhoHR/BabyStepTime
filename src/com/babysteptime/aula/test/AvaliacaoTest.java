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
		assertTrue(avaliacao.inserirNota(5));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaNegativa() {		
		assertFalse(avaliacao.inserirNota(-1));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaZero() {
		assertTrue(avaliacao.inserirNota(0));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaMaiorQueZero() {
		assertTrue(avaliacao.inserirNota(1));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaMaiorDez() {
		assertTrue(avaliacao.inserirNota(10));		
	}
	
	@Test
	public void testDeveGarantirPrimeiraNotaMaiorQueDez() {
		assertFalse(avaliacao.inserirNota(11));		
	}
	
	@Test
	public void testDeveInserirDuasNotas() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(6);
		
		assertEquals(avaliacao.Notas.get(0), new Integer(5));
		assertEquals(avaliacao.Notas.get(1), new Integer (6));
	}
	
	@Test
	public void testDeveInserirTresNotas() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(6);
		avaliacao.inserirNota(2);
		
		assertEquals(avaliacao.Notas.get(0), new Integer(5));
		assertEquals(avaliacao.Notas.get(1), new Integer (6));
		assertEquals(avaliacao.Notas.get(2), new Integer (2));
	}
	
	@Test
	public void testNaoDeveInserirMaisQueTresNotas() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(6);
		avaliacao.inserirNota(2);
		avaliacao.inserirNota(4);
		
		assertEquals(avaliacao.Notas.size(), 3);
	}
}
