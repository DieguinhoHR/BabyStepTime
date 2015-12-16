package com.babysteptime.aula.test;

import java.util.ArrayList;

public class Aluno {

	public ArrayList<Double> Notas = new ArrayList<Double>();
	
	public boolean adicionarNotas(ArrayList<Double> notas) {
		Notas = notas;
		return true;
	}

}
