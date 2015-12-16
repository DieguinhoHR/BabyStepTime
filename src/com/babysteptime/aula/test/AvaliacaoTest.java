package com.babysteptime.aula.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

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

		assertEquals(avaliacao.Notas.get(0), new Double(5));
		assertEquals(avaliacao.Notas.get(1), new Double(6));
	}

	@Test
	public void testDeveInserirTresNotas() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(6);
		avaliacao.inserirNota(2);

		assertEquals(avaliacao.Notas.get(0), new Double(5));
		assertEquals(avaliacao.Notas.get(1), new Double(6));
		assertEquals(avaliacao.Notas.get(2), new Double(2));
	}

	@Test
	public void testDeveInserirMaisQueTresNotas() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(6);
		avaliacao.inserirNota(2);
		avaliacao.inserirNota(4);

		assertEquals(avaliacao.Notas.size(), 4);
	}

	@Test
	public void testDeveCalcularAMediaEntreTresValores() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);

		assertEquals(5.0, avaliacao.calcularMedia(),0.001);
	}

	@Test
	public void testDeveObterStatusAprovado() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(9);
		avaliacao.inserirNota(8);
		avaliacao.calcularMedia();

		assertEquals("Aprovado", avaliacao.obterStatus());
	}

	@Test
	public void testDeveObterStatusReprovado() {
		avaliacao.inserirNota(4);
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(3);
		avaliacao.calcularMedia();

		assertEquals("Reprovado", avaliacao.obterStatus());
	}

	@Test
	public void testDeveObterStatusEmExame() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(6);
		avaliacao.calcularMedia();

		assertEquals("Exame", avaliacao.obterStatus());
	}
	
	@Test
	public void testeDeveCalcularMediaPonderada()
	{
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		
		ArrayList<Integer> pesos = new ArrayList<Integer>();
		pesos.add(new Integer(1));
		pesos.add(new Integer(2));
		pesos.add(new Integer(3));

		assertEquals(10.0, avaliacao.calcularPonderada(pesos),0.001);
	}
	
	@Test
	public void testeDeveCalcularMediaPonderadaMenosPesos() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		
		ArrayList<Integer> pesos = new ArrayList<Integer>();		
		pesos.add(new Integer(2));
		pesos.add(new Integer(3));

		assertEquals(10.0, avaliacao.calcularPonderada(pesos),0.001);
	}
	
	@Test
	public void testeDeveCalcularMediaPonderadaMaisPesos() {
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		avaliacao.inserirNota(5);
		
		ArrayList<Integer> pesos = new ArrayList<Integer>();
		pesos.add(new Integer(1));
		pesos.add(new Integer(2));
		pesos.add(new Integer(3));
		pesos.add(new Integer(4));

		assertEquals(10.0, avaliacao.calcularPonderada(pesos),0.001);
	}	
	
	@Test
	public void testeNotasAluno()
	{
		Aluno aluno = new Aluno();
		ArrayList<Double> notas = new ArrayList<Double>();
		notas.add(new Double(5));
		notas.add(new Double(5));
		notas.add(new Double(5));
		assertTrue(aluno.adicionarNotas(notas));
	}
	
}
