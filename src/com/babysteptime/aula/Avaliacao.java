package com.babysteptime.aula;

import java.util.ArrayList;

public class Avaliacao {
	public ArrayList<Double> Notas = new ArrayList<Double>();

	public boolean inserirNota(double nota) {
		if (nota < 0)
			return false;

		if (nota > 10)
			return false;

		Notas.add(nota);
		return true;
	}

	public double calcularMedia(ArrayList<Double> notas) {

		double somaNota = 0;

		for (double nota : notas)
			somaNota += nota;

		return somaNota / notas.size();
	}

	public String obterStatus(ArrayList<Double> notas) {
		double media = calcularMedia(notas);

		if (media < 5)
			return "Reprovado";

		if (media >= 7)
			return "Aprovado";

		return "Exame";
	}

	public double calcularPonderada(ArrayList<Integer> pesos) {
		double somaNota = 0;
		
		for (int i = 0; i < Notas.size(); i++) { 
			int peso = 1;
		
			if (i < pesos.size()) {
				peso = pesos.get(i);			
			}
			
			somaNota += (Notas.get(i) * peso);
		}		
		return somaNota / Notas.size();
	}
}
