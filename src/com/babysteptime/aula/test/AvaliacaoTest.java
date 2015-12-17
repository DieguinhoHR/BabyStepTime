package com.babysteptime.aula.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.babysteptime.aula.Avaliacao;

public class AvaliacaoTest {
	private Avaliacao avaliacao;
	private Aluno aluno;

	@Before
	public void init() {
		avaliacao = new Avaliacao();
		aluno = new Aluno();
	}

	@Test
	public void testDeveInserirNota() {
		assertTrue(aluno.inserirNota(5));
	}

	@Test
	public void testDeveGarantirPrimeiraNotaNegativa() {
		assertFalse(aluno.inserirNota(-1));
	}

	@Test
	public void testDeveGarantirPrimeiraNotaZero() {
		assertTrue(aluno.inserirNota(0));
	}

	@Test
	public void testDeveGarantirPrimeiraNotaMaiorQueZero() {
		assertTrue(aluno.inserirNota(1));
	}

	@Test
	public void testDeveGarantirPrimeiraNotaMaiorDez() {
		assertTrue(aluno.inserirNota(10));
	}

	@Test
	public void testDeveGarantirPrimeiraNotaMaiorQueDez() {
		assertFalse(aluno.inserirNota(11));
	}

	@Test
	public void testDeveInserirDuasNotas() {
		aluno.inserirNota(5);
		aluno.inserirNota(6);

		assertEquals(aluno.Notas.get(0), new Double(5));
		assertEquals(aluno.Notas.get(1), new Double(6));
	}

	@Test
	public void testDeveInserirTresNotas() {
		aluno.inserirNota(5);
		aluno.inserirNota(6);
		aluno.inserirNota(2);

		assertEquals(aluno.Notas.get(0), new Double(5));
		assertEquals(aluno.Notas.get(1), new Double(6));
		assertEquals(aluno.Notas.get(2), new Double(2));
	}

	@Test
	public void testDeveInserirMaisQueTresNotas() {
		aluno.inserirNota(5);
		aluno.inserirNota(6);
		aluno.inserirNota(2);
		aluno.inserirNota(4);

		assertEquals(aluno.Notas.size(), 4);
	}

	@Test
	public void testDeveCalcularAMediaEntreTresValores() {
		
		aluno.inserirNota(5);
		aluno.inserirNota(5);
		aluno.inserirNota(5);

		assertEquals(5.0, avaliacao.calcularMedia(aluno.Notas),0.001);
	}

	@Test
	public void testDeveObterStatusAprovado() {
		
		aluno.inserirNota(5);
		aluno.inserirNota(9);
		aluno.inserirNota(8);
		
		

		assertEquals("Aprovado", avaliacao.obterStatus(aluno.Notas));
	}

	@Test
	public void testDeveObterStatusReprovado() {

		aluno.inserirNota(4);
		aluno.inserirNota(5);
		aluno.inserirNota(3);	

		assertEquals("Reprovado", avaliacao.obterStatus(aluno.Notas));
	}

	@Test
	public void testDeveObterStatusEmExame() {

		aluno.inserirNota(5);
		aluno.inserirNota(5);
		aluno.inserirNota(6);
			

		assertEquals("Exame", avaliacao.obterStatus(aluno.Notas));
	}
	
	@Test
	public void testeDeveCalcularMediaPonderada()
	{
		ArrayList<Integer> pesos = new ArrayList<Integer>();
		pesos.add(new Integer(1));
		pesos.add(new Integer(2));
		pesos.add(new Integer(3));
		

		aluno.inserirNota(5);
		aluno.inserirNota(5);
		aluno.inserirNota(5);		

		assertEquals(10.0, avaliacao.calcularPonderada(aluno.Notas, pesos),0.001);
	}
	
	@Test
	public void testeDeveCalcularMediaPonderadaMenosPesos() {
		ArrayList<Integer> pesos = new ArrayList<Integer>();		
		pesos.add(new Integer(2));
		pesos.add(new Integer(3));

		aluno.inserirNota(5);
		aluno.inserirNota(5);
		aluno.inserirNota(5);		
		
		assertEquals(10.0, avaliacao.calcularPonderada(aluno.Notas, pesos),0.001);
	}
	
	@Test
	public void testeDeveCalcularMediaPonderadaMaisPesos() {
		ArrayList<Integer> pesos = new ArrayList<Integer>();
		pesos.add(new Integer(1));
		pesos.add(new Integer(2));
		pesos.add(new Integer(3));
		pesos.add(new Integer(4));
		
		aluno.inserirNota(5);
		aluno.inserirNota(5);
		aluno.inserirNota(5);		

		assertEquals(10.0, avaliacao.calcularPonderada(aluno.Notas, pesos),0.001);
	}		
}
