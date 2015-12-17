package com.babysteptime.aula.test;

import java.util.ArrayList;

public class Aluno {

	public ArrayList<Double> Notas = new ArrayList<Double>();
	
	public boolean inserirNota(double nota) {
		if (nota < 0)
			return false;

		if (nota > 10)
			return false;

		Notas.add(nota);
		return true;
	}	
	
}
