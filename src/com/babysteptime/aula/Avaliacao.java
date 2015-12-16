package com.babysteptime.aula;

import java.util.ArrayList;
public class Avaliacao {
	public ArrayList<Double> Notas = new ArrayList<Double>();
	
	public boolean inserirNota(double nota) {		
		if(nota < 0)
			return false;
		
		if(nota > 10)
			return false;		
		
		Notas.add(nota);
		return true;
	}

	public double calcularMedia() {	
		
		double somaNota = 0;
		
		for (double nota : Notas) 
			somaNota += nota;
		
		return somaNota / Notas.size(); 
	}

	public String obterStatus() {
		
		double media = calcularMedia();
		
		if(media < 5)
			return "Reprovado";		
		
		if(media >= 7)
			return "Aprovado";
		
		return "Exame";
	}
}
