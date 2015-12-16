package com.babysteptime.aula;

import java.util.ArrayList;
public class Avaliacao {
	public ArrayList<Integer> Notas = new ArrayList<Integer>(tamanhoDoVetor);
	private static int tamanhoDoVetor = 3;
	
	public boolean inserirNota(int nota) {
		if(Notas.size() >= tamanhoDoVetor)
			return false;
		
		if(nota < 0)
			return false;
		
		if(nota > 10)
			return false;		
		
		Notas.add(nota);
		return true;
	}

	public int calcularMedia() {	
		
		int somaNota = 0;
		
		for (Integer integer : Notas) 
			somaNota += integer;
		
		return somaNota / Notas.size(); 
	}

	public String obterStatus() {
		
		int media = calcularMedia();
		
		if(media < 5)
			return "Reprovado";		
		
		if(media >= 7)
			return "Aprovado";
		
		return "";
	}
}
