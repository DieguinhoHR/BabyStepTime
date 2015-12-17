package com.babysteptime.aula;

import java.util.ArrayList;

public class Avaliacao {

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

	public double calcularPonderada(ArrayList<Double> notas, ArrayList<Integer> pesos) {
		double somaNota = 0;
		
		for (int i = 0; i < notas.size(); i++) { 
			int peso = 1;
		
			if (i < pesos.size()) {
				peso = pesos.get(i);			
			}
			
			somaNota += (notas.get(i) * peso);
		}		
		return somaNota / notas.size();
	}
}
